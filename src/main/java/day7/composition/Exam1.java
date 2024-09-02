package day7.composition;

public class Exam1 {
    public static void main(String[] args) {

        Person p1 = new Person(); //클래스 생성
        p1.age = 20; // 변수임
        p1.arm = new Arm(); //

        System.out.println(p1.arm.length + "cm");
        // 출력 : 100cm
    }
}
// 객체가 가지고 있는 변수와 메서드의 차이 ()매개변수가 있으면 메서드 없으면 변수

class Person {
    int age;
    Arm arm;
}

class Arm {
    int length;
    public Arm() {
        length = 100;
    }

}
