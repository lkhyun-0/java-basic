package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostApp { // 실행을 위한 메서드 등이 있는 곳 postrun 과 세트임

    public PostApp(){
        Post p1 = new Post(1, "안녕하세요 반갑습니다.","내용없음", getCurrentDateTime(),0);
        Post p2 = new Post(2, "자바공부중이에요.","내용없음", getCurrentDateTime(),0);
        Post p3 = new Post(3, "정처기 따야하나요?","내용없음", getCurrentDateTime(),0);
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }

    static ArrayList<Post> posts = new ArrayList<>();

    public void run() {
        Scanner sc = new Scanner(System.in);
        int lastestId = 1; // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임


        while (true) {
            System.out.print("명령어 : ");
            String commend = sc.nextLine();

            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // 종료기능 완성

            } else if (commend.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine(); // 제목을 입력 받아

                System.out.print("게시물 내용을 입력해주세요 : ");
                String body = sc.nextLine(); // 내용을 입력 받아

                Post post = new Post(lastestId, title, body, getCurrentDateTime(), 0); // 생성자 넘버+ 제목 + 내용 모두 저장 처음 저장했다면
                //(1, 입력한제목, 입력한내용, 시간) 이겠지?

                posts.add(post); // ArrayList에 제목과 내용 저장~

                System.out.println("게시물이 등록되었습니다.");
                lastestId++; //1씩 증가시키기 (1부터 증가시킨다는 것은 고유값을 유지하는데 편리하다)
                // 추가 기능 완성


            } else if (commend.equals("list")) {  // 조회는 그냥 꺼내와서 출력 해주기 객체를 잘 짜고 연결해주기 !!
                System.out.println("=================");

                for (Post post : posts) {
                    System.out.printf("번호 : %s \n", post.getId()); // post에 저장되어 있는 id데이터를get으로 가져오기
                    System.out.printf("제목 : %s\n", post.getTitle());// post에 저장되어 있는 제목 데이터를 get으로 가져오기
                    System.out.println("=================");
                }

            } else if (commend.equals("update")) {
                System.out.print("수정할 게시물의 번호를 입력하세요 : ");
                int targetId = Integer.parseInt(sc.nextLine()); //

                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물 입니다.");
                    continue;
                }

                System.out.print("수정할 제목 : ");
                String newTitle = sc.nextLine();
                System.out.print("수정할 내용 : ");
                String newDetail = sc.nextLine();

                post.setTitle(newTitle); // post 에 새 제목 저장
                post.setBody(newDetail); // post에 새 내용 저장

                System.out.println("수정이 완료되었습니다");

            } else if (commend.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("없는 게시물 번호 입니다.");
                    continue;
                }
                posts.remove(post);
                System.out.println("삭제가 완료되었습니다.");

            } else if (commend.equals("detail")) {

                System.out.println("상세보기 할 게시물 번호를 입력해주세요 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                Post post = findPostById(targetId);

                if (post == null) {
                    System.out.println("존재하지 않는 게시물 번호 입니다.");
                    continue;
                }
                post.increaseHit();

                System.out.printf("번호 : %s \n", post.getId());
                System.out.printf("제목 : %s\n", post.getTitle());
                System.out.printf("내용 : %s\n", post.getBody());
                System.out.printf("등록시간 : %s\n", post.getCreateDate());

                System.out.printf("조회수 : %d\n", post.getHit());
            }
        }
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
}

