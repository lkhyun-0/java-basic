package day1;

public class Loop { //반복문
    public static void main(String[] args) {

        int count;
        count = 0;
        while (count < 10) {
            System.out.println("안녕하세요");
            count++; // count  값이 1 씩 증가
        }

        int count2 = 0; // 변수를 만듦과 동시에 저장하는 것

        while (count2 < 10) {
            System.out.println("반갑습니다.");
            count2++;
        }

        // for

        for (int count3 = 0; count3 < 10; count3++) {
            System.out.println("화이팅!");
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }


// 문제 : 1부터 100까지 출력해주세요.
        int test;
        test = 1;
        while (test <= 100) {
            System.out.println(test);
            test++;
        }


// 문제1. 1 ~ 100까지 수중 짝수만 출력
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }


        }
// 문제2. 1 ~ 100 출력+ 짝수에는 even 홀수에는 odd
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " : even");
            } else {
                System.out.println(i + " : odd");
            }

        }


// 문제3. 손흥민
        int time = 74;
        int score = 0;
        for(int i = time; i < 90; i = i + 5) {
            score = score + 1;
        }

        System.out.println(score);


        // 문제4. a b 두 수가 주어지면 a와 b 사이의 수를 오름차순 출력해주세요.

    }
}















