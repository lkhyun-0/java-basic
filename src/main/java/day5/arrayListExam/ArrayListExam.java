package day5.arrayListExam;

import day5.prectice.Person;

import java.util.ArrayList;

public class ArrayListExam {
    public static void main(String[] args) {

        // 생성
        // 배열의 생성
//        int[] arr = new int[5]; // 길이가 5인 숫자배열 생성
//
//        //ArrayList의 생성
//        ArrayList<Integer> list = new ArrayList<>(); // 비어있는 배열
//
//         추가
//         배열은 추가가 없다. 따라서 추가 라는 개념이 없음
//
//        ArrayList 의 추가
//         가장 앞에서 부터 추가 됨
//       list.add(1); // 0번 방에 추가됨
//        list.add(2); // 1번 방에 추가됨
//
//
//        // 조회
//        // 배열의 조회
//        System.out.println(arr[0]); //0번방에 있는 거 조회
//        System.out.println(arr[1]); //0번방에 있는 거 조회
//        System.out.println(arr[2]); //0번방에 있는 거 조회
//
//        //ArrayList의 조회
//        System.out.println(list.get(0)); // 0번 방에 있는거 조회
//        System.out.println(list.get(1)); // 1번 방에 있는거 조회
//        //System.out.println(list.get(2)); // 2번 방에 있는게 없기 때문에 에러남
//
//        // 배열 수정하는 법
////        arr[0] = 10; // 0번방에 10넣겠음
//        //System.out.println(arr[0]);
//
//        //ArrayList의 수정하는 법
//        list.set(0, 10); // 0번방에 있는 거 10으로 바꿈
//
//        // 배열은 삭제하는 법 없음
//
//        //ArrayList 삭제하는 법
//        System.out.println(list.get(0));
//        //System.out.println(list.get(1));
//
//        list.remove(0); // 0번방의 값을 삭제한다는 뜻
//
//        // 데이터의 개수 확인
//        // 배열 => length를 제공하긴 하지만 데이터의 개수랑은 무관하다. 따로 내가 직접 변수에 보관해야함.
//
//        //ArrayList 데이터 개수 확인 하는 법
//        System.out.println(list.size());


        // 문제 1. 반복문
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(4);
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(0);  // {5,4,3,2,1,0}을 ArrayList에 추가 해주세요.

        System.out.println(list.size());  // ArrayList의 사이즈를 출력해주세요. = 6

        System.out.println(list.get(2));
        System.out.println(list.get(3)); // ArrayList의 3,4번째 값을 읽어서 출력해주세요. (인덱스 X, 1부터 ) = 3,2

        list.remove(0); // 1번째 방 삭제 > 5가 없어짐
        list.remove(0); // 5가 없어진 상태에서는 4가 첫번째 방이므로  1번째 방 삭제

        // System.out.println(list.size()); = 4


        System.out.println(list.get(0));
        System.out.println(list.get(1)); // 다시 3,4번째 값을 출력해주세요 = 1,0

        System.out.println(list.get(1)); // 2번째 방에 있는 수는 = 2


// 반복문으로 출력하기 지울때 인덱스 확인 잘하기 지워진 후에 인덱스 번호 생각하기
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


        // 원시형 -> 객체형
        // int -> Integer
        // String 은 원래 객체형임

        //ArrayList는 타입(자료형)을 객체만 다룬다.

        // 따라서 생성시에
        //ArrayList<객체형 자료형> list = new ArrayList<>(); 이렇게 들어가야함  >>> 이론정리

        //문제 2.

        // 선언
        // 이름을 저장할 수 있는 ArrayList를 선언하고 만들어주세요.

        ArrayList<String> list1 = new ArrayList<>();
//
//         add()
//         리스트에 값을 추가해주세요.
//         "홍길동", "이순신", "황진이", "임꺽정", "강감찬", "을지문덕" 을 ArrayList에 추가 해주세요.
//
        list1.add("홍길동");
        list1.add("이순신");
        list1.add("황진이");
        list1.add("임꺽정");
        list1.add("강감찬");
        list1.add("을지문덕");
//
//         size()
//         리스트의 사이즈를 출력해주시고, 값이 6이 맞다면 계속 진행해주세요.
        System.out.println(list1.size());
//         출력결과 : 6
//         get()
//         리스트의 2,3 인덱스의 값을 출력해주세요.
        System.out.println(list1.get(2));
        System.out.println(list1.get(3));
//         출력결과 : 황진이, 임꺽정
//
//         리스트의 모든 값을 출력해주세요.
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
//         출력 결과 : 홍길동 이순신 황진이 임꺽정 강감찬 을지문덕

//         remove()
//         리스트에서 홍길동, 이순신을 지운 뒤, 다시 2,3 인덱스의 값을 출력해주시고 어떤 변화가 있는지 체크해주세요.
        list1.remove(0);
        list1.remove(0);

        System.out.println(list1.get(2));
        System.out.println(list1.get(3));
//        출력 결과 : 강감찬, 을지문덕

//         리스트의 모든 값을 출력해주세요.
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
//        출력 결과 : 황진이 임꺽정 강감찬 을지문덕
//
//         add()
        list1.add("정약용");
//        리스트에 정약용을 추가시켜주세요.

//        리스트의 모든 값을 출력해주세요.
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
//         출력 결과 : 황진이 임꺽정 강감찬 을지문덕 정약용


//         set() 임꺽정과 을지문덕을 신사임당과 유관순으로 바꿔주세요.
//        list1.set(1, "신사임당");
//        list1.set(3, "유관순"); = 반복문을 사용하지 않고 해결한 코드 이렇게 짜지말고 반복문으로 해결하자 컴퓨터한테 찾으라고 시키자는 거 for문으로

        for (int i = 0; i < list1.size(); i++) { // 리스트의 길이만큼 반복하도록 만들기
            if (list1.get(i).equals("임꺽정")) { // 만약 그 값이 임꺽정과 동일하다면
                list1.set(i, "신사임당"); // 그 값을 신사임당으로 수정해달라
            }
            if (list1.get(i).equals("을지문덕")) {
                list1.set(i, "유관순");
            }

        }


//         리스트의 모든 값을 출력해주세요.
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
//         출력 결과 : 황진이 신사임당 강감찬 유관순 정약용
        //리스트에서 황진이 신사임당 유관순만 출력해주세요.
        System.out.println(list1.get(0));
        System.out.println(list1.get(1));
        System.out.println(list1.get(3));
//         출력 결과 : 황진이 신사임당 유관순

// 문제 3.
        Person p1 = new Person();
//        p1.age = 24;
//        p1.name = "홍길동";
//
//        Person p2 = new Person();
//        p2.age = 30;
//        p2.name = "이순신";
//
//        Person p3 = new Person();
//        p3.age = 41;
//        p3.name = "을지문덕";
//
//        Person p4 = new Person();
//        p4.age = 32;
//        p4.name = "황진이";

// 1. 네 사람을 ArrayList에 저장

        ArrayList<Integer> age = new ArrayList<>();
        age.add(24);
        age.add(30);
        age.add(41);
        age.add(32);

        ArrayList<String> name = new ArrayList<>();
        name.add("홍길동");
        name.add("이순신");
        name.add("을지문덕");
        name.add("황진이");

// 2. 네 사람에게 자기소개 시키기 (자기소개 문구 : 안녕하세요 ~~살 ~~~입니다.)
        System.out.println("안녕하세요 " + age.get(0) + "살 " + name.get(0) + "입니다.");
        System.out.println("안녕하세요 " + age.get(1) + "살 " + name.get(1) + "입니다.");
        System.out.println("안녕하세요 " + age.get(2) + "살 " + name.get(2) + "입니다.");
        System.out.println("안녕하세요 " + age.get(3) + "살 " + name.get(3) + "입니다.");

// 3. 30대인 사람에게만 자기소개 시키기
        for (int i = 0; i < age.size(); i++) {
            if (age.get(i) >= 30) {
                System.out.println("안녕하세요 " + age.get(i) + "살 " + name.get(i) + "입니다.");

            }
        }


    }
}
