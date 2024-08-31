package day2;

import java.util.Scanner;

public class InputExam {
    public static void main(String[] args) {


        // 반복문의 추가문법
        // 반복문의 강제종료
        // 반복문의 강제로 다음 회차 넘기기 continue

//        for (int i = 0; i <= 10; i++){
//
//            if (i % 2 != 0) { //반복문 강제 종료 : break 만약에 i가 5라면 강제 종료 보통 if문과 같이 사용한다.
//                //break; // 강제 종료 5 까지만 출력됨.
//
//               continue; // 강제로 다음 회차로 넘기기 5만 빼고 다 출력됨.
//            }
//            System.out.println(i);
//        }


//        Scanner sc = new Scanner(System.in);
//        while (true){
//            System.out.print("값을 입력해주세요 : ");
//            int num = sc.nextInt();
//
//            if (num == 0) { // num이 0이면 if문 실행
//                break;
//            }
//
//            System.out.println("당신이 입력한 값은 : " +num);
//
//        }
//        System.out.println("프로그램이 종료되었습니다.");
        while (true) {
            System.out.print("기능을 선택해 주세요 (1. 더하기, 2. 빼기, 3. 곱하기, 4. 나누기, 5. 종료 ) : ");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();

            if (choose == 5) {
                System.out.println("계산기 프로그램을 종료합니다.");
                break;
            }

            if(choose > 5) {
                System.out.println("그런 기능은 없습니다.");
                continue;
            }

            int num1 = sc.nextInt();
            System.out.println("첫번째 숫자를 입력해주세요 : " + num1);
            int num2 = sc.nextInt();
            System.out.println("두번째 숫자를 입력해주세요 : " + num2);


            if (choose == 1) {
                System.out.println("결과 : " + num1 + " + " + num2 + " = " + (num1 + num2));  //
            } else if (choose == 2) {
                System.out.println("결과 : " + num1 + " - " + num2 + " = " + (num1 - num2)); //
            } else if (choose == 3) {
                System.out.println("결과 : " + num1 + " X " + num2 + " = " + (num1 * num2)); //
            } else if (choose == 4) {
                System.out.println("결과 : " + num1 + " / " + num2 + " = " + (num1 / num2)); //
            }


        }


    }

}



