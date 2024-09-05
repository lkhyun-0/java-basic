package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.jndi.toolkit.dir.DirSearch.search;
import static java.nio.file.Files.delete;
import static jdk.jfr.internal.consumer.EventLog.update;
import static sun.security.jgss.GSSUtil.login;


public class PostApp { // 메인과 연동되는 클래스 여기서 작업함 중요
    // 모든 클래스는 생성자를 가질 수 있어용~ 같은이름으로
    public PostApp() { // 데이터 넣어 놓고 시작하고 싶을 때 생성자로 ~ 초기화? 한다고 함
        Post p1 = new Post(1, "안녕하세요 반갑습니다. java", "내용없음", getCurrentDateTime(), 0, "내용없음");
        Post p2 = new Post(2, "java공부중이에요.", "내용없음", getCurrentDateTime(), 0, "내용없음");
        Post p3 = new Post(3, "정처기 따야하나요?", "내용없음", getCurrentDateTime(), 0, "내용없음");
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }

    Scanner sc = new Scanner(System.in);
    int lastestId = 1; // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임

    static ArrayList<Post> posts = new ArrayList<>();
    ArrayList<MemberInformation> memberinfo = new ArrayList<MemberInformation>(); // 여기에
    MemberInformation info = new MemberInformation();
    ArrayList<LogInfo> logInfos = new ArrayList<>(); // 여기에
    LogInfo loginfo = new LogInfo();

    public void run() { // 실행 메소드

        while (true) {
            if (loginfo.getMemberID() == null) {
                System.out.print("명령어 : ");
            } else {
                System.out.println("명령어를 입력해주세요[" + loginfo.getMemberID() + "(" + info.getMemberNN() + ")]");
            }
                String commend = sc.nextLine();
            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;

            } else if (commend.equals("add")) {
                add();
            } else if (commend.equals("list")) {
                printPostList(posts);
            } else if (commend.equals("update")) {
                update();
            } else if (commend.equals("delete")) {
                delete();
            } else if (commend.equals("detail")) {
                detail();
            } else if (commend.equals("search")) {
                search();
            } else if (commend.equals("signup")) {
                signup();
            }else if (commend.equals("login")){
                login();
            }

        }
    }

    private void login() {
        System.out.print("아이디: ");
        String inputId = sc.nextLine();
        loginfo.setMemberID(inputId);
        System.out.print("비밀번호 : ");
        String inputPW = sc.nextLine();
        loginfo.setMemberPW(inputPW);
        if (info.getMemberID().equals(inputId) && info.getMemberPW().equals(inputPW)){
            System.out.println(info.getMemberNN()+"님 환영합니다!");
            logInfos.add(loginfo);
        }else {
            System.out.println("비밀번호를 틀렸거나 잘못된 회원정보입니다.");
        }
    }

    private void signup() {
        System.out.println("==== 회원 가입을 진행합니다 ====");

        System.out.print("아이디를 입력해주세요 : ");
        String inputId = sc.nextLine();
        info.setMemberID(inputId);
        System.out.print("비밀번호를 입력해주세요 : ");
        String inputPW = sc.nextLine();
        info.setMemberPW(inputPW);
        System.out.print("닉네임을 입력해주세요 : ");
        String inputNN = sc.nextLine();
        info.setMemberNN(inputNN);
        System.out.println("                              ");
        System.out.println("==== 회원가입이 완료되었습니다 ====");
    }

    private void search() {
        System.out.print("검색할 키워드를 입력하세요 : ");
        String keyword = sc.nextLine();
        ArrayList<Post> searchedPostList = new ArrayList<>();
        for (Post post : posts) {
            if (post.getTitle().contains(keyword)) {
                searchedPostList.add(post);
            }
        }
        printPostList(searchedPostList);
    }
    private void detail() {
        System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
        int targetId = Integer.parseInt(sc.nextLine());
        Post post = findPostById(targetId); // 또 찾아 게시물 중에서
        if (post == null) { // 다 찾아 봤는데 없어?
            System.out.println("존재하지 않는 게시물 번호 입니다."); // 없다고 알려주고
            return; // 다음회차로 넘겨줘
        }
        post.increaseHit(); // 조회수 1올려줘
        System.out.printf("번호 : %d\n", post.getId());
        System.out.printf("제목 : %s\n", post.getTitle());
        System.out.printf("내용 : %s\n", post.getBody());
        System.out.printf("등록날짜 : %s\n", post.getCreateDate());
        System.out.printf("조회수 : %d\n", post.getHit());
        System.out.println("상세보기 기능을 선택해주세요(1. 댓글 등록, 2. 추천, 3. 수정, 4. 삭제, 5. 목록으로) :");
        int detailFunc = Integer.parseInt(sc.nextLine());
        while (true) {
            if (detailFunc == 1) {
                System.out.print("[댓글 기능을 선택하셨습니다.]");
                String comment = sc.nextLine();
                System.out.println("댓글내용 : " + comment);
                System.out.println("댓글이 성공적으로 등록되었습니다.");

                post.setComment(comment); // post에 저장

                System.out.printf("==== %d번 게시물 ====\n", post.getId());
                System.out.printf("번호 : %d\n", post.getId());
                System.out.printf("제목 : %s\n", post.getTitle());
                System.out.printf("내용 : %s\n", post.getBody());
                System.out.printf("등록날짜 : %s\n", post.getCreateDate());
                System.out.printf("조회수 : %d\n", post.getHit());
                System.out.println("===========================");
                System.out.println("===========댓글=============");
                System.out.println("댓글내용 : " + post.getComment());
                System.out.printf("작성일 : %s\n", post.getCreateDate());
//                        System.out.println("===========================");
//                        System.out.println("댓글내용 : " + post.getComment());
//                        System.out.printf("작성일 : %s\n", post.getCreateDate()); > 반복되는 부분 해결하자 메서드로
                // 위에 출력 부분도 반복됨 메서드 사용해서 해결하기

//                        post.getComment();


            } else if (detailFunc == 2) {
                System.out.println("[추천 기능]");

            } else if (detailFunc == 3) {
                System.out.println("[수정 기능]");

            } else if (detailFunc == 4) {
                System.out.println("[삭제 기능]");

            } else if (detailFunc == 5) {
                System.out.println("상세보기 화면을 빠져나갑니다.");
                break;
            }
        }
    }

    private void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int targetId = Integer.parseInt(sc.nextLine()); // 삭제하고 싶은 번호 입력받기
        Post post = findPostById(targetId);// 입력값이랑 게시물번호랑 같은지 싹 찾아 > 메서드임 아래에서 한번 더 보기
        if (post == null) { // 만약 다 찾아 봤는데 없어?
            System.out.println("없는 게시물 번호 입니다."); // 없다고 알려주고
            return; // 다음회차로 넘겨
        }
        posts.remove(post); // ArrayList 는 삭제 기능을 지원하기 때문에 ~ 이렇게 적어주고
        System.out.println("삭제가 완료되었습니다."); // 출력
    }

    private void update() {
        System.out.print("수정할 게시물의 번호를 입력하세요 : ");
        int targetId = Integer.parseInt(sc.nextLine()); // 수정하고 싶은 번호 골라서 입력

        Post post = findPostById(targetId); // 게시물 중에서 입력 받은 값이랑 같은 것이 있는지 찾아!

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

    private void add() {
        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = sc.nextLine(); // 제목을 입력 받아

        System.out.print("게시물 내용을 입력해주세요 : ");
        String body = sc.nextLine(); // 내용을 입력 받아

        Post post = new Post(lastestId, title, body, getCurrentDateTime(), 0, "내용없음");
        // post라는 클래스에 1번 입력한 제목, 입력한 내용, 현재 시각, 0,"내용없음" 을 저장함

        posts.add(post); // ArrayList에 제목과 내용 저장~
        // posts는 ArrayList임

        System.out.println("게시물이 등록되었습니다.");
        lastestId++; //1씩 증가시키기 (1부터 증가시킨다는 것은 고유값을 유지하는데 편리하다)
        // 추가 기능 완성
    }

    public static Post findPostById(int id) { // 찾기만 해주면 됨  수정은 넘겨주고 실행
        // 만약 내가 찾고자 하는 게시물이 없다면?
        for (Post post : posts) {
            if (post.getId() == id) {
                return post; // 값을 찾고 return을 만나면 메서드는 그 즉시 종료됨
            } // 찾으면 아래로 내려갈 일이 없겠지?
        } // > 반복문을 다 뒤졌어 근데 내가 원하는 값이 안나왔어 > 그러면 비어있다 (없다)라는 값을
        return null; // null은 없다는 의미
    }

    public static String getCurrentDateTime() {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        return formattedDateTime;
    }

    public void printPostList(ArrayList<Post> targetList) {  //ArrayList<Post> targetList > 이 부분이!정하는 거임 얼마나 반복할지
        System.out.println("=================");
        for (Post post : targetList) { // 그래서 여기도 들어가는 거임
            System.out.printf("번호 : %s \n", post.getId()); // post에 저장되어 있는 id데이터를get으로 가져오기
            System.out.printf("제목 : %s\n", post.getTitle());// post에 저장되어 있는 제목 데이터를 get으로 가져오기
            System.out.printf("내용 : %s\n", post.getBody());
            System.out.printf("작성일 : %s\n", post.getCreateDate());
            System.out.printf("조회수 : %d\n", post.getHit());
            System.out.println("=================");
        }
    }
}