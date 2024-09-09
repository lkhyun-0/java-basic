package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

// 받아서 넘겨주는
public class PostController {
    Scanner sc = new Scanner(System.in);
    private PostRepository postRepository = new PostRepository();
    private PostView postView = new PostView();
    private UserRepository userRepository  = new UserRepository();
    public User user = new User(0, "무","무","무");




    int lastestId = 4;
    int userNo = 1;

    public PostController() {
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java", "내용없음", getCurrentDateTime(), "내용없음", 0,"hong");
        Post p2 = new Post(2, "java 공부중이에요.", "내용없음", getCurrentDateTime(), "내용없음", 0,"lee");
        Post p3 = new Post(3, "정처기 따야하나요?", "내용없음", getCurrentDateTime(), "내용없음", 0,"lim");
        postRepository.save(p1);
        postRepository.save(p2);
        postRepository.save(p3);
    }

    public void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine();
        System.out.print("회원님의 닉네임을 입력해주세요. : ");
        String nickname = sc.nextLine();
        Post post = new Post(lastestId, title, body, getCurrentDateTime(), "내용없음", 0, nickname);
        postRepository.save(post);
//        post.setCreater(nickname); // 입력한 닉네임
        System.out.println("게시물이 등록되었습니다.");
        lastestId++;
    }


    public void detail() {
        System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = postRepository.findPostById(targetId); // 창고에서 꺼내서
        // 요리를 한다음
        if (post == null) { // 다 찾아 봤는데 없어?
            System.out.println("존재하지 않는 게시물 번호 입니다."); // 없다고 알려주고
            return; // 다음회차로 넘겨줘
        }
        post.increaseHit(); // 조회수 1올려줘
        // 서빙한테 넘겨줌
        postView.printPostDetail(post);

        while (true) {
            System.out.println("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) :");
            int detailFunc = Integer.parseInt(sc.nextLine());

            if (detailFunc == 1) {
                System.out.print("[댓글 기능을 선택하셨습니다.]");
                String comment = sc.nextLine();
                System.out.println("댓글내용 : " + comment);
                System.out.println("댓글이 성공적으로 등록되었습니다.");
                post.setComment(comment); // post에 저장
                postView.printPostDetail(post);
                postView.printCommet(post);

            } else if (detailFunc == 2) {
                System.out.println("[추천 기능]");

            } else if (detailFunc == 3) {


            } else if (detailFunc == 4) {
            } else if (detailFunc == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }
        }
    }


    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine()); // 삭제하고 싶은 번호 입력받기

        Post post = postRepository.findPostById(targetId);// 입력값이랑 게시물번호랑 같은지 싹 찾아 > 메서드임 아래에서 한번 더 보기

        if (post == null) { // 만약 다 찾아 봤는데 없어?
            System.out.println("없는 게시물 번호 입니다."); // 없다고 알려주고
            return; // 다음회차로 넘겨
        }
        postRepository.delete(post);

        System.out.println("삭제가 완료되었습니다."); // 출력
    }

    public void update() {
        System.out.print("수정할 게시물의 번호를 입력하세요 : ");
        int targetId = Integer.parseInt(sc.nextLine()); // 수정하고 싶은 번호 골라서 입력

        Post post = postRepository.findPostById(targetId);

        if (post == null) { // 만약 다 찾아 봤는데 없어?
            System.out.println("없는 게시물 입니다."); // 없다고 알려주고
            return; // 다음회차로 넘겨줘
        }
        System.out.print("수정할 제목 : ");
        String newTitle = sc.nextLine();
        System.out.print("수정할 내용 : ");
        String newDetail = sc.nextLine();

        post.setTitle(newTitle); // post 에 새 제목 저장
        post.setBody(newDetail); // post 에 새 내용 저장
        System.out.println("수정이 완료되었습니다");
    }



    public void list() {
        ArrayList<Post> posts = postRepository.getPosts();
        postView.printPostList(posts);
    }


    public void signup() {
        System.out.println("==== 회원 가입을 진행합니다 ====");

        System.out.print("아이디를 입력해주세요 : ");
        String id = sc.nextLine();
        System.out.print("비밀번호를 입력해주세요 : ");
        String pw = sc.nextLine();
        System.out.print("닉네임을 입력해주세요 : ");
        String nickname = sc.nextLine();

        User user = new User(userNo,id, pw, nickname);

        user.setId(id);
        user.setPw(pw);
        user.setNickname(nickname);
        userRepository.save(user);
        userNo++;

        System.out.println("                              ");
        System.out.println("==== 회원가입이 완료되었습니다 ====");
    }


    public void login() {
        System.out.print("아이디: ");
        String id = sc.nextLine();
        System.out.print("비밀번호 : ");
        String pw = sc.nextLine();


        userRepository.findUser(id, pw);
        System.out.println(user.getNickname()+"님 환영합니다.");



    }




    public void search() {
        System.out.print("검색할 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        ArrayList<Post> searchedPostList = postRepository.getPostsByKeyword(keyword);
        postView.printPostList(searchedPostList);
    }

    public String getCurrentDateTime() {
        // 현재 날짜와 시간 가져오기
        LocalDateTime currentDateTime = LocalDateTime.now();
        // 원하는 포맷 지정하기
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        // 포맷 적용하여 출력하기
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }
}

