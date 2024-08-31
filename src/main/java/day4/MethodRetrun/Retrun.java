package day4.MethodRetrun;
// 메서드는 값을 표현할 수도 있고 아닐 수도 있음
public class Retrun {
    public static void main(String[] args) {
//        메서드는 값을 리턴할 수 있는데 리턴값이 필요한 이유는 메서드가 리턴한 값을 다양하게 2차 작업할 수 있기 때문이다.

//        ReturnTest t1 = new Test();
//        int num = t1.plus(100,20);

//        System.out.println(num / 2);
//
//        System.out.println(num * 2);


        //반지름이 5인 원의 넓이 구하기
        System.out.println("======반지름이 5인원의 넓이 구하기=============");

        ReturnTest t5 = new ReturnTest();
        double result1 = t5.circleArea(5);

        //반지름이 10인 원의 넓이 구하기
        System.out.println("======반지름이 10인원의 넓이 구하기===========");
        ReturnTest t10 = new ReturnTest();
        double result2 = t10.circleArea(10);
//
//        //반지름이 5인 원의 넓이를 3으로 나눔
//        System.out.println(result1 / 3);
//
//        //반지름이 10인 원의 넓이를 2배로 증가시킴
//        System.out.println(result2 * 2);


        // 메서드 리턴 1번 문제
        ReturnTest t1 = new ReturnTest();

        t1.func1(10);
        // 출력 : 10
        t1.func1(20);

        t1.func2(22);
        // 출력 : 22
        t1.func2(55);
        // 출력 : 55

        t1.func3(10);
        // 출력 : 100
        t1.func3(5);
        // 출력 : 25

        t1.func4(10, 30);
        // 출력 : 40
        t1.func4(20,50);
        // 출력 : 70

        // 메서드 리턴 2번문제
        t1.plus(10, 20);
        t1.minus(10, 20);
        t1.multiple(5, 4);
        t1.divide(10, 3);
        t1.square(5);

        // 메서드 리턴 3번 문제
        t1.isnegative(0); // 메서드 Test클래스에 있음

        // 메서드 리턴 4번 문제
        t1.printEven(10);
        t1.printEven(20);
        t1.printEven(5);
        //t1.isEven(50);

        // 계좌에 입금받기 > Account 클래스에 있음



    }
}






