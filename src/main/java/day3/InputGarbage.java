package day3;

import java.util.Scanner;

public class InputGarbage {
    public static void main(String[] args) {


        // 이름 입력: 홍길동
        // 나이 입력: 24
        Scanner sc = new Scanner(System.in);
        // 안녕하세요 24살 홍길동입니다.
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine()); // 숫자를 문자로 변환해주는 함수

        System.out.println("안녕하세요 " + age + "살 " + name + "입니다.");



//         숫자를 입력받을 때 문자로 받고 숫자로 변환









        // 나이 입력: 24
        // 이름 입력: 홍길동

        // 안녕하세요 24살 홍길동입니다.

    }
}
