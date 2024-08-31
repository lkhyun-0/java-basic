package day3;

// Arraylist 1개사용해서 만들기 !!
// 이름 짓기 열심히 고민해주세요
// 변수(상태)는 명사로 메서드는 (동작) 동사로 지어주세요
// 관계가 있고 직관적일수록 좋은 이름임


import day6.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        // 1. 일단 데이터를 입력
        Scanner sc = new Scanner(System.in); // 뭔가를 받겠다. 선언
        ArrayList<Person> persons = new ArrayList<>(); // ArrayList한개만 남기고 시작


        // 두개를 하나로 묶으려면 폴더가 있어야겠지?

        while (true) {
            System.out.println("명령어 입력 : "); // 계속 반복되어야 함
            String str1 = sc.nextLine(); // 문자인 입력값을 str1에 받겠다.

            if (str1.equals("help")) { // str1이 "help"와 같은 경우
                System.out.println("add : 이름추가");
                System.out.println("list : 이름목록확인");
                System.out.println("exit : 종료"); // > 를 출력함.l

            } else if (str1.equals("add")) { // 그렇지 않고 "add"와 같은 경우 (저장하기)
                System.out.print("이름을 입력해주세요 : "); // 출력
                String name1 = sc.nextLine(); // 입력 받기

                Person p1 = new Person(); // 새로운 p1 폴더 생성
                p1.name = name1;

                System.out.print("나이를 입력해주세요. : "); // 출력
                int age1 = Integer.parseInt(sc.nextLine()); // age라는 입력값을 받겠다~
                p1.age = age1;

                persons.add(p1);
                persons.add(p1); // 입력값을 ages ArrayList에 순서대로 저장해줘

                System.out.println(name1 + " 이 명부에 저장되었습니다."); // 위의 입력값 출력해줌
                persons.add(p1); // 반복문이 끝날때마다 p1은 사라질 위기에 처해있음 그래서 위에 만들어 놓은 persons라는 배열에 저장해야함
                // p1을 persons배열 에 차곡차곡 저장하겠다는 의미
                // 이름은 p1으로 같지만 각기 다른 p1들이 배열에 차곡차곡 채워지고 있음

            } else if (str1.equals("list")) { // 그렇지 않고 "list"와 같은 경우 (저장값 불러오기)
                for (int i = 0; i < persons.size(); i++) { //i 는 배열순서, persons ArrayList의 길이만큼 반복하겠다.
                    Person p1 = persons.get(i); // 리모콘 값을 변수에 저장을 해서 > ????
                    System.out.print(persons.get(i).name);
                    System.out.print(persons.get(i).age);// persons의 모든 값을 출력하겠다.


                }
            } else if (str1.equals("exit")) {
                System.out.println("이름 프로그램을 종료합니다.");
                break; // 종료명령어
            }

        }
    }
}
// help >
// (add : 이름 입력
// list : 이름 목록
// exit : 종료) > 출력

// add 입력 > 이름을 입력해주세요 : aaa
// 나이를 입력해주세요 : 20
// aaa가 명부에 저장되었습니다.
// 명령어 입력 : add
// 이름을 입력해주세요 : tomas
// 나이를 입력해주세요 : 20
// tomas이 명부에 저장되었습니다.
// 명령어 입력 : add
// 이름을 입력해주세요 : chris
// chris이 명부에 저장되었습니다.
// 나이를 입력해주세요 : 20
// 명령어 입력 : list
// 1. john
// 2. tomas
// 3. chris

// 명령어 입력 : exit
// 이름 프로그램이 종료됩니다. > 프로그램 종료

