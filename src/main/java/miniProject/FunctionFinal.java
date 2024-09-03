package miniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Post> posts = new ArrayList<>();
        int lastestId = 1; // 가장 최신의 id값. id값의 고유성을 유지하기 위해 1씩 증가시킬 계획임

        while (true) {
            System.out.print("명령어 : ");
            String commend = sc.nextLine();

            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // 종료기능 완성

            } else if (commend.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String title = sc.nextLine();

                System.out.print("게시물 내용을 입력해주세요 : ");
                String detail = sc.nextLine();

                Post post = new Post(lastestId, title, detail); // 생성자 넘버+ 제목 + 내용 모두 저장 처음 저장했다면
                //(1, 입력한제목, 입력한내용) 이겠지?

                post.setTitle(title); // setter 사용해서 위에서 받은 입력값 post에 저장
                post.setDetail(detail); // setter 사용해서 위에서 받은 입력값 post에 저장

                posts.add(post); // ArrayList에 제목과 내용 저장~

                System.out.println("게시물이 등록되었습니다.");
                lastestId++; //1씩 증가시키기 (1부터 증가시킨다는 것은 고유값을 유지하는데 편리하다)

                // 추가 기능 완성


            } else if (commend.equals("list")) { // 조회
                System.out.println("=================");
                for (Post post : posts) {
                    System.out.printf("번호 : %s. \n", post.getId());
                    System.out.printf("제목 : %s\n", post.getTitle());
//                    System.out.printf("내용 : %s\n", post.getDetail());
//                    System.out.println("내용 : " + posts.get(i).getDetail()); // 내용은 다음 요구사항에서
                    System.out.println("=================");
                }


            } else if (commend.equals("update")) {

                System.out.println("=================");
                System.out.print("수정할 게시물의 번호 : ");
                int targetidx = Integer.parseInt(sc.nextLine()); //업데이트를 위해 타겟팅시도하는
                int targetId = Integer.parseInt(sc.nextLine()); // 목록에 이미 있는

                // 논리연산자
                // 조건1 || 조건2 -> 조건1 조건2 둘 중 하나만 만족해도 실행 (or?) (역슬ㄹ쉬+shift)
                // 조건1 && 조건2 -> 조건1 조건2가 동시에 만족(모두 만족)해야만 실행(and?)
                if (targetidx < 1 || targetidx > posts.size()) {
                    System.out.println("없는 게시물 번호 입니다.");
                    continue;
                }

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        System.out.print("수정할 제목 : ");
                        String newTitle = sc.nextLine();
//                        System.out.print("수정할 내용 : ");
//                        String newDetail = sc.nextLine();

//                        Post post = posts.get(targetIdx - 1);
                        
                        post.setTitle(newTitle); // post 에 새 제목 저장
//                        post.setDetail(newDetail); // post에 새 내용 저장

                        System.out.println("수정이 완료되었습니다");
                        break;
                    }
                }

            } else if (commend.equals("delete")) {
                System.out.print("삭제할 게시물 번호 : ");
                int targetId = Integer.parseInt(sc.nextLine());

                for (Post post : posts) {
                    if (post.getId() == targetId) {
                        posts.remove(post); // 인덱스가 아닌 값을 넣어서 해당 값을 삭제 할 수도 있다.

                        System.out.println("삭제가 완료되었습니다.");
                        break;
                    }
                }
            }
        }
    }
}






