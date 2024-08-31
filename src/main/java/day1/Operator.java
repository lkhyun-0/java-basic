package day1;

public class Operator {
    public static void main(String[] args) {
        // 산술연산자 + - * / %(나머지 구하기)
        System.out.println(10 + 5);
        System.out.println(10 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        System.out.println(10 % 5);

        System.out.println(10 / 3); // 정수
        System.out.println(10.0 / 3.0); // 실수
        System.out.println(10 % 3); // 나머지 구하기 %

        // 비교연산자
        // <, >, <=, >=, ==(양 변이 같다), !(양 변이 틀리다)
        //System.out.println(10 > 5);  맞음 true
        //System.out.println(10 < 5);  틀림 false

        System.out.println(10 > 10);
        System.out.println(10 >= 10);
        //System.out.println(10 = 10);
        //System.out.println(10 ! 10);

        // 숫자(정수) - int, 문자 - String, 숫자(실수) - double


        // 문제풀어보기
        if (true) {
            System.out.println("참");
        }

        if (false) {
            System.out.println("거짓");
        }

        int a = 10;
        // `==` => 같다.
        if (a == 10) {
            System.out.println("참");
        }

        // `!=` => 같지 않다.
        if (a != 10) {
            System.out.println("거짓");
        }

        if (a > 10) {
            System.out.println("거짓");
        }

        if (a >= 10) {
            System.out.println("참");
        }

        int b = 10;

        if (a == b) {
            System.out.println("참");
        }

        //boolean c => c 에는 오직 true/false 만 담을 수 있다.

        boolean c = a != b;

        if (c) {
            System.out.println("거짓");
        }

        if (c == false) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!c) {
            System.out.println("참");
        }

        // `!` => 반전
        if (!(!c)) {
            System.out.println("거짓");
        }

        boolean d = true;

        if (c != d) {
            System.out.println("참");
        }
    }
}