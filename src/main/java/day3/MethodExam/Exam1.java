package day3.MethodExam;

public class Exam1 {
    public static void main(String[] args) {
        class1 c1 = new class1();

        c1.name = "차태진";
        c1.introduce();

        class1 c2 = new class1();
        c2.name = "이경현";
        c2.introduce();

        Test t1 = new Test();

        t1.name = "홍길동";
        t1.hi();
        t1.bye();

        Test t2 = new Test();
        t2.print(3);
        t2.print(5);
        t2.print(100);

        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 20;

        p1.introduce();

        p1.introduce2(1);

        Person p2 = new Person();
        p2.lang = 1;
        p2.lang = 2;
        p2.lang = 3;

        p2.greeting1(1);
        p2.greeting1(2);
        p2.greeting1(3);

        p2.greeting2(2,2);

        Car v1 = new Car();
        v1.run(3);

        Car v2 = new Car();
        v2.run2(5);

        Car v3 = new Car();
        v3.carname = "제네시스";
        v3.km = 220;

        v3.run3();

        Car v4 = new Car();
        v4.carname = "카이엔";
        v4.km = 250;

        v4.run3();



















    }
}
