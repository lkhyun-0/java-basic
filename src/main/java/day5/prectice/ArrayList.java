package day5.prectice;

// 2개 이상의 데이터를 한번더 묶어서 한번에 저장하고 관리해보자 ArrayList를 활용해서
public class ArrayList {
    public static void main(String[] args) {
        // Person 클래스 만들고 > p(n)만들고 데이터 넣기(main) > people ArrayList만들고 배열에 p파일 넣어주기
        // -> 이렇게 하면 people이라는 배열에 나이와 이름을 한번에 저장 관리 할 수 있음

        Person p1 = new Person();
        p1.age = 24;
        p1.name = "홍길동";

        Person p2 = new Person();
        p2.age = 30;
        p2.name = "이순신";

        Person p3 = new Person();
        p3.age = 41;
        p3.name = "을지문덕";

        Person p4 = new Person();
        p4.age = 32;
        p4.name = "황진이";  // p1파일에 데이터 저장

        java.util.ArrayList<Person> people = new java.util.ArrayList<>();

        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4); // p파일들을 people배열에 순서대로 저장

        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i); // Person 이라는 설계도를 보고 만든 p의 값은 people(i)번째 값과 같다
            p.introduce();//p야 인트로 메서드 보고 > 너의 값을 가지고 자기소개 해봐~
        }



        // 2개 이상의 데이터로 표현되는 개념/사물은 무조건 객체로 만들어라.!!


    }
}