package day5.prectice;

import java.util.ArrayList;

public class Exam3 {
    public static void main(String[] args) {

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
        p4.name = "황진이";

        ArrayList<Person> people = new ArrayList<>();

        people.add(p1); //p(n) 파일은 이름과 나이가 저장되어있음 > 이름과 나이를 한번더 큰 폴더인 people이라는 ArrayList에 저장함
        people.add(p2);
        people.add(p3);
        people.add(p4);

        for (int i = 0; i < people.size(); i++) {
            Person p = people.get(i); // Person 이라는 설계도를 보고 만든 p의 값은 people(i)번째 값과 같다
            p.introduce();//p야 인트로 메서드 보고 > 너의 값을 가지고 자기소개 해봐~


        }
// Person 클래스 만들고 > p(n)만들고 데이터 넣기 > people ArrayList로 묶어주기

        // 2개 이상의 데이터로 표현되는 개념/사물은 무조건 객체로 만들어라.!!





    }
}
//        ArrayList<String> names = new ArrayList<>();
//        ArrayList<Integer> ages = new ArrayList<>();
//
//        names.add("홍길동");
//        names.add("이순신");
//        names.add("임꺽정");
//        names.add("황진이");
//
//        ages.add(20);
//        ages.add(30);
//        ages.add(35);
//        ages.add(40);
//        // 이름과 나이를 같이 다루고 싶다!! > 한번더 폴더화하자
//
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("안녕하세요" + ages.get(i) + "살" + names.get(i) + "입니다.");
//        }
//        names.remove(1);
//        ages.remove(1);
//
//
//        System.out.println("========================================");
//        for (int i = 0; i < names.size(); i++) {
//            System.out.println("안녕하세요 " + ages.get(i) + "살 " + names.get(i) + "입니다.");
//        }