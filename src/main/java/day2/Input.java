package day2;

import java.util.Scanner;

public class Input { // 일반인도 사용할 수 있도록 입력값을 받아 출력하는 것
    public static void main(String[] args) {


//        Scanner sc = new Scanner(System.in);
//
//        int num1 = sc.nextInt();// 숫자를 입력받는 명령어
//        System.out.println("당신이 입력한 첫번째 값은 : " + num1);
//
//        int num2 = sc.nextInt();
//        System.out.println("당신이 입력한 두번째 값은 : " + num2);
//        System.out.println(num1 + num2);



        // 스캐너 문제 1.
        // Scanner를 이용해서 아래와 같이 입출력 하여 사칙연산을 수행해주세요.
        //        입출력 예시
        //        첫번째 숫자를 입력해주세요: 12
        //        두번째 숫자를 입력해주세요: 33
        //        12 + 33 = 45
//        Scanner sc = new Scanner(System.in);
//
//        int num1 = sc.nextInt();
//        System.out.println("첫번째 숫자를 입력해주세요 : " + num1);
//
//        int num2 = sc.nextInt();
//
//        System.out.println("두번째 숫자를 입력해주세요 : " + num2);
//
//        System.out.print(num1+" + " +num2+" = "+(num1+num2));


        // 문제 2.
        // Scanner를 이용해 입력값을 받아
        // 구구단을 원하는 단이 나오게 해주세요.

        //예시) 원하는 단을 입력해주세요 : 4 (입력후 엔터)

        // 4단 출력.

        Scanner sc = new Scanner(System.in);
        int num3 = sc.nextInt();
        System.out.print("원하는 단을 입력해주세요 : " + num3);

        for (int i = 1; i <= 9; i++) {
            System.out.println(num3 + " x "+i+ " = " + (num3 * i));

        }

        System.out.println();






    }
}
