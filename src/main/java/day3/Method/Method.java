package day3.Method;

public class Method {
    public static void main(String[] args) {
        Person p1 = new Person();
        // 변수는 정보를 저장
        // 메서드는 동작을 수행한다.

        p1.age = 50; // p1이라는 변수에 age 정보를 저장함
        p1.name = "홍길동";

        Person p2 =  new Person();// p2라는 변수에 age 정보를 저장함
        p2.age = 30;
        p2.name = "이순신";

        p1.introduce();
        p2.introduce();
        p1.walk();
        p2.walk();




    }
}
