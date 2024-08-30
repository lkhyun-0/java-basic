package day6.constructor;

public class Constructor {
    public static void main(String[] args) {

        System.out.println("=====문제======");
        // 다음 클래스들을 생성자를 이용해 간단하게 값을 세팅해주세요.

        Person p1 = new Person("홍길동", 27);
        Person p2 = new Person("홍길순", 25 );

        p1.intro();
        p2.intro();

        Car c1 = new Car("소나타", "하얀색",100);
        Car c2 = new Car("모닝", "검정색",70);

        c1.drive();
        c2.drive();

        Cat cat1 = new Cat("아리", 4, "러시안블루");
        Cat cat2 = new Cat("망고", 6, "샴");

        cat1.meow();
        cat2.meow();

        Warrior w1 = new Warrior("이순신",20,10);
        Warrior w2 = new Warrior("강감찬",15,15);

        w1.status();
        w2.status();

        w1.attack();
        w2.attack();

        w1.defense();
        w2.defense();




    }
}
