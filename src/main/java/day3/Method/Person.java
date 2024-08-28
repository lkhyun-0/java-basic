package day3.Method;
// 객체(사물을 표현) -> 상태/동작 -> 변수와 메서드의 집합이다.
public class Person {
    // 변수는 상태를 의미한다.
    int age;
    String name;

    // 메서드는 동작(연산)을 표현한다.
    // 메서드 모양 : 접근제어자 리턴타입 메서드명(매개변수) {내용}
    // 모든 동작은 일단 쉽게 출력으로 대체하자.

    public void walk(){
        System.out.println(name +"이 걷습니다.");
    }
    // 매개변수
    public void introduce(String name2, int age2) {
        System.out.println("안녕하세요" + age2 + "살 " + name2 + "입니다.");
    }

    public void introduce() {
        System.out.println("안녕하세요" + age + "살 " + name + "입니다.");

    }
}

