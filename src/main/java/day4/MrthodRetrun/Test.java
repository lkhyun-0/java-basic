package day4.MrthodRetrun;

public class Test {

//    public int plus(int num1, int num2){
//        System.out.println(num1+num2);
//        return num1 + num2;  // 메서드가 (리턴)돌아갈 때 num1 + num2 이라는 값을 가지고 돌아감. 가져가는 값을 정해줘야함 int, byte, long 등등
//    }

    // 원의 넓이 구하는 메서드 만들기
    // 반지름*반지름*3.14
    // 변하는 값은 반지름이기 때문에  반지름 값을 매개변수로 넣어준다
    //


    // 원의 넓이 구하는 메서드
    // 실수와 정수를 계산하면 결과값은 무조건 실수
    public double circleArea(int radius) {
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

    public int plus(int num1, int num2) {
        System.out.println(num1 + num2);
        return num1 + num2;
    }

    public int minus(int num1, int num2) {
        System.out.println(num1 - num2);
        return num1 - num2;
    }

    public int multiple(int num1, int num2) {
        System.out.println(num1 * num2);
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        System.out.println(num1 / num2);
        return num1 / num2;
    }

    public int square(int num1) {
        System.out.println(num1 * num1);
        return num1 * num1;
    }

    public int isnegative(int no) {
        if (no < 0) {
            System.out.println("음수입니다.");
        } else {
            System.out.println("양수입니다.");
        }
        return no;
    }

    public void printEven(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
    }
    //public boolean isEven(int num) {



    }

