package miniProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Function2 { // 추가기능 완성

    public static void main(String[] args) {
        Fruit f = new Fruit();
        ArrayList<String> fruit = new ArrayList<>();




    }


    public static Fruit setFruit(Fruit f) {
        f.name = "apple";
        f.name = "banana";
        f.name = "orange";
        return f;
    }

}
class Fruit {
    String name;
}

//            public static void setPerson(Person a) {
//                a.age = 20;
//                a.name = "홍길동";
//            }
//        }

//                Person p1 = new Person();
//
//                setPerson(p1);
//
//                p1.intro();
//
//                Person p2 = getPerson();
//
//                p2.intro();
//
//                ArrayList<String> arr = new ArrayList<>();
//
//
//
//            }
//
//            // main에서 arr을 넘겨받아 "apple", "banana", "orange" 저장
//            public static void setArr() {
//
//            }
//
//            public static Person getPerson() {
//                Person p = new Person();
//                p.age = 30;
//                p.name = "이순신";
//
//                return p;
//            }
//

//
//        class Person {
//            int age;
//            String name;
//
//            public void intro() {
//                System.out.printf("%d살 %s입니다.\n", age, name);









//        Scanner sc = new Scanner(System.in); // 뭔가를 입력 받겠다
//
//
//        ArrayList<String>title  = new ArrayList<>(); // 문자형태의 post라는 이름을 가진 ArrayList 생성
//        ArrayList<String>detail  = new ArrayList<>(); //문자형태의 detail이라는 이름을 가진 ArrayList 생성
//
//
//        while (true) {
//            System.out.print("명령어 : ");
//            String commend = sc.nextLine();
//
//            if (commend.equals("add")) { // 입력 값이 add와 같은 경우 아래 출력
//                System.out.print("게시물 제목을 입력해주세요 : ");
//                String t = sc.nextLine(); // 문자 변수 t를 입력 하세요
//
//                System.out.print("게시물 내용을 입력해주세요 : ");
//                String d = sc.nextLine(); // 문자변수 d를 입력 하세요
//
//                System.out.println("게시물이 등록되었습니다.");
//                title.add(t); // title ArrayList에 0번째 방에 t저장
//                detail.add(d); // detail ArrayList에 0번째 방에 d저장
//
//            }
//        }



