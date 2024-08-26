package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
        //구구단 2단 만들기

// hi 10번 짜리를 사용해서 100번 출력 코드로 만든 이중 반복문
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println("hi");
            }
        }

        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + " = " + (dan * i));

        }
        dan = 3;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + " = " + (dan * i));
        }
        dan = 4;
        for (int dan2 = 2; dan2 < 10; dan2++) {
            for (int i = 1; i <= 9; i++) {
                System.out.println(dan2 + " x " + i + " = " + (dan2 * i));
            }
        }

// 문제. 구구단 짝수번째만 곱해주세요
        for (int dan3 = 2; dan3 < 10; dan3++) {
            for (int i = 1; i < 10; i++)
                if (i % 2 == 0) {
                    System.out.println(dan3 + " X " + i + " = " + (dan3 * i));// 고정값 i를 변경하면 곱하는 수 (짝수) dan3을 변경하면 구구단 (짝수)
                }
        }

        int y = 7;
        for (int i = 1; i <= y; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println();
        }

        // 문제. 삼각형그리기 1
//        int y = 5; // 높이 값
//        for (int i = 1; i <= y; i++) { 반복값
//            for (int j = 1; j <= i; j++) { 출력값
//                System.out.print("*"); 조건에 맞는 출력값
//            }
//            System.out.println(); 조건에 맞지 않는 출력값
//        }



        // 삼각형그리기 2
//        int y2 = 5;
//
//        for (int i = 1; i <= y2; i++) {
//            for (int j = 1; j <= y2 - i; j++) {
//                System.out.print(" ");
//            } // 공백 출력하기 위한 코드
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


// 삼각형 그리기 3
//        int y3 = 10;
//        int star_len = 0;
//
//        for (int i2 = 0; i2 < y3; i2++ ) {
//            int increase = 0;
//            int decrease = 0;
//
//            // y 가 짝수 일 경우
//            if ( y3 % 2 == 0 ) {
//                if ( y3 / 2 > i2 ) {
//                    increase = 1;
//                }
//                else if ( y3 / 2 < i2 ) {
//                    decrease = 1;
//                }
//            }
//            // count 가 홀수 일 star_len
//            else {
//                if ( y3 / 2 >= i2 ) {
//                    increase = 1;
//                }
//                else {
//                    decrease = 1;
//                }
//            }
//
//            if ( increase == 1 ) {
//                star_len++;
//            }
//
//            if ( decrease == 1) {
//                star_len--;
//            }
//
//            for ( int j2= 0; j2 < star_len; j2++ ) {
//                System.out.print("*");
//            }
//
//            System.out.println();
//        }





    }


}
//입맛대로 사각형도형
//        for (int height = 0; height < 10; height++){
//            for (int width = 0; width < 10; width++){
//            System.out.print("*");
//        }
//        System.out.println();
//        }

