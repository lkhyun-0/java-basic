package day1;

public class ConditionChoose {
    public static void main(String[] args) {

        // 택일구조 : 남녀 양자택일 , 학적 사자택일, 성적 오자택일(A, B, C, D, F)

        // 학적 사자택일
        int age;
        age = 10;

        if (age <= 8) {
            System.out.println("초등학생");
        }
        if (age <= 16) {
            if (age > 13) {
            }
            System.out.println("중학생");

        }
        if (age <= 19) {
            if (age > 16)
                System.out.println("고등학생");
        }
        if (age >= 20) {
            System.out.println("성인");
        }


        // 성적 출력하기
        int socre;
        socre = 40;

        if (socre >= 90) {
            System.out.println("A");
        } else if (socre >= 80) {
            System.out.println("B");
        } else if (socre >= 70) {
            System.out.println("C");
        } else if (socre >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        // 문제 풀어보기

        //홀수와 짝수를 구별해주세요.
        // num이 짝수면 even, 홀수면 odd 출력해주세요.
        // 짝수 판별 : 2로 나누어서 떨어지면 짝수

        int num;
        num = 7;

        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }


// 두수 num1과 num2가 주어집니다.
// 두 수중 더 큰수에서 더 작은 수를 뺀 결과를 출력해주세요.
        int num1 = 10;
        int num2 = 15;

        if (num2 > num1) {
            System.out.println(num2 - num1);
        } else {
            System.out.println(num1 - num2);
        }

// 문제 : 할인 대상인지 아닌지 출력해주세요.
// 조건 : 나이가 19세 이하이거나 60세 이상이면 할인 대상입니다.
// 조건 : 출력예시 처럼 출력되어야 합니다.
// 조건 : `구현시작` 부분만 수정 할 수 있습니다..
// 조건 : 2가지 이상의 방법으로 풀어야 합니다.

        int age1;
        age1 = 57;

        if (age1 <= 19) {
            System.out.println("할인대상입니다.");
        } else if (age1 >= 60) {
            System.out.println("할인대상입니다.");
        } else {
            System.out.println("할인 대상이 아닙니다.");
        }

        System.out.println("당신의 나이는 " + age1 + "살 입니다.");


// 터널 문제
        int tunnel1;
        tunnel1 = 180;
        int tunnel2;
        tunnel2 = 182;
        int tunnel3;
        tunnel3 = 172;

        if (tunnel1 > 170) {
            System.out.println("PASS");
        } else {
            System.out.println("CRASH");
        }
        if (tunnel2 > 170) {
            System.out.println("PASS");
        } else {
            System.out.println("CRASH");
        }
        if (tunnel3 > 170) {
            System.out.println("PASS");
        } else {
            System.out.println("CRASH");
        }


    }
}
