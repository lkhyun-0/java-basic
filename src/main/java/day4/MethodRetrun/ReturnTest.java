package day4.MethodRetrun;

public class ReturnTest {

    // 원의 넓이 구하는 메서드
    // 실수와 정수를 계산하면 결과값은 무조건 실수
    public double circleArea(int radius) { // 원의 넓이 구하는 메서드
        System.out.println((radius * radius) * 3.14);
        return (radius * radius) * 3.14;
    }

    public int func1(int a) {
        System.out.println(a);
        return a;
    }


    public int func2(int c) {
        System.out.println(c);
        return c;
    }

    public int func3(int e) {
        System.out.println(e * e);
        return e;
    }


    public int func4(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    public void plus(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiple(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    public void square(int num1) {
        System.out.println(num1 * num1);
    }

    public void isnegative(int no) {
        if (no < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("양수입니다.");
        }
    }

    public void printEven(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
    }

