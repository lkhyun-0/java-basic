package miniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class FunctionFinal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Post posts = new Post();

        ArrayList<String> title = new ArrayList<>(); // 문자형태의 post라는 이름을 가진 ArrayList 생성
        ArrayList<String> detail = new ArrayList<>(); //문자형태의 detail이라는 이름을 가진 ArrayList 생성


        while (true) {

            System.out.print("명령어 : ");
            String commend = sc.nextLine();

            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break; // 종료기능 완성
            } else if (commend.equals("add")) {
                System.out.print("게시물 제목을 입력해주세요 : ");
                String t = sc.nextLine();

                System.out.print("게시물 내용을 입력해주세요 : ");
                String d = sc.nextLine();

                System.out.println("게시물이 등록되었습니다.");

                title.add(t); // title ArrayList에 0번째 방에 t저장
                detail.add(d); // detail ArrayList에 0번째 방에 d저장

                // 추가 기능 완성

            } else if (commend.equals("list")) {

                for (int i = 0; i < title.size(); i++) {
                    System.out.println("=================");
                    System.out.println("제목 : " + title.get(i));// + 제목 가져오는 메서드 title ArrayList에서
                    System.out.println("내용 : " + detail.get(i));// + 내용 가져오는 메서드 detail ArrayList에서
                }
            } // 조회기능 완성
            //메서드화 하지 않고 ArrayList 순서를 일치 시켜서 해결
        }
    }
}
class Post {
    String title;
    String detail;
}



