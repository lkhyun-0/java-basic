package miniProject;

import java.util.Scanner;
// 종료 기능
public class Function1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.print("명령어 : ");

            String commend =sc.nextLine();

            if (commend.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } // 문자는 같다 표시 변수명.equals.(문자값) ***

        }
    }
}