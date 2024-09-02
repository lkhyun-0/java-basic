package day6;

import java.util.ArrayList;


public class ObjectArrayList {  // ArrayList를 1개만 사용하는 법을 알아보자
    public static void main(String[] args) {
        // 1. 일단 데이터를 입력
        String name1 = "홍길동";
        int age1 = 20;
        // 각각의 배열에 추가하기
        ArrayList<String> names = new ArrayList<>(); // names라는 비어있는 배열 생성
        names.add(name1); // 여기에 name1정보 추가

        ArrayList<Integer> ages = new ArrayList<>(); // ages라는 비어있는 배열 생성
        ages.add(age1); // 여기에 age1 정보 추가

        // 2. 이제 큰 폴더에 다시 넣어야겠지?? 사람정보니까 Person 클래스 생성하자~

        Person p1 = new Person(); // p1폴더 생성
        p1.name = name1; // Person폴더의 이름 파일에 name1 데이터 들어가
        p1.age = age1; // Person 폴더의 나이 파일에 age1데이터 들어가
        // p1폴더에는 이름과 나이가 들어가 있는 상태

        // 여기까지가 ArrayList를 여러개 사용해서 해결하는 법

        //3. 이제 p1폴더를 한번에 다룰 수 있어야겠지????? ArrayList로 ????  -->이게 1개로 해결하는 방법

        ArrayList<Person> persons = new ArrayList<>(); // persons라는 배열 생성
        persons.add(p1); // persons에 p1폴더 집어 넣기 이름과 나이를 한번에 나눠서 관리, 보관


    }
}
