package day1;

public class Variable {
    public static void main(String[] args) {
        // 홍길동의 나이가 20세
//        System.out.println(20);
//        System.out.println(20);
//        System.out.println(20);
//        System.out.println(20);
//        System.out.println(20);
//        // 홍길동의 나이가 21세가 되었을 때 모두 변경해야 함
//        System.out.println(20);
//        System.out.println(20);
//        System.out.println(20);
//        System.out.println(20);
//        System.out.println(20);

        // 변수를 사용해서 값을 저장할 수 있다. 변수는 값을 저장하는 것.

        // 숫자
        // 상자 (변수)를 만들어야한다.
        // int (변수이름);
        // (변수이름) = x;


        // 값을 변수에 담아야한다. = 로 담기
        // 문자 담기 = 문자 이름;

        String name;
        name = "홍길만";
        int age;
        age = 60;

        // 변수 값을 꺼내 사용하기
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");
        System.out.println("안녕하세요 저는 " + age + "살 " + name + " 입니다");


        // 변수 사용시 주의사항
        // 동일한 변수가 2개 이상 존재할 수 없음
        // 변수명이 숫자나 특수기호로 시작되어서는 안된다 (숫자는 뒤에 붙는건 가능)
        // 변수는 재활용 가능하며 반드시 = 의 왼쪽에 위치하는 것이 규칙

        // 문제 풀어보기 변수 정의 + 출력
        int i;
        i = 100;
        double d;
        d = 3.14;
        String s;
        s = "안녕하세요";
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);

        i = 200;
        d = 10.5;
        s = "반갑습니다.";
        System.out.println(i);
        System.out.println(d);
        System.out.println(s);


        // 값 바꾸기
        int a = 5;
        int b = 10;

        System.out.println("a : " + a);
        System.out.println("b : " + b);

        a = 10;
        b = 5;

        System.out.println("a : " + a);
        System.out.println("b : " + b);


    }
}
