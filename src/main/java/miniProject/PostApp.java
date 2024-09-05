package miniProject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class PostApp {

    private PostController postController = new PostController();
    private Scanner sc = new Scanner(System.in);

    public void run() { // 실행 메소드

        while (true) {
            if (postController.loginfo.getMemberID() == null) {
                System.out.print("명령어 : ");
            } else {
                System.out.println("명령어를 입력해주세요[" + postController.loginfo.getMemberID() + "(" + postController.info.getMemberNN() + ")]");
            }
            String commend = sc.nextLine();
            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (commend.equals("add")) {
                postController.add();
            } else if (commend.equals("list")) {
                postController.list();
            } else if (commend.equals("update")) {
                postController.update();
            } else if (commend.equals("delete")) {
                postController.delete();
            } else if (commend.equals("detail")) {
                postController.detail();
            } else if (commend.equals("search")) {
                postController.search();
            } else if (commend.equals("signup")) {
                postController.signup();
            } else if (commend.equals("login")) {
                postController.login();
            }
        }
    }
}
