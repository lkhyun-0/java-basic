package day4;

public class InstanceVar {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "홍길동";
        p1.intro();
        Person p2 = new Person();
        p2.name = "이순신";
        p1.intro();

        p1.walk();
        p2.walk();
    }
}
