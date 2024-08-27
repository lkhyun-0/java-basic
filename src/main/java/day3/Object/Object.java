package day3.Object;

public class Object {
    public static void main(String[] args) {

        // 폴더 -> 숫자문자를 가리지 않고 다 저장 가능한 개념 이것이 객체임

        // 사람을 표현하는 방법은 무한가지
        // 자바는 변수를 저장할 때 자료형을 요구한다
        // 객체는 먼저 어떻게 생겼는지 정의되어야 자바가 만들어줄 수 있음 (어떻게 생겼는지 자바한테 알려줘야함 like 설계도)
        // 설계도를 먼저 만든다 (class : 내가 알려주고자 하는 것)




        //Person c; >>> 폴더가 만들어짐 ? = 아직 안만들어짐 ㅇㅇ
        // new Person(); Person 설계도에 따라서 객체하나 만들어줘(복사본을 만들어줘 명령어 : new)
        // Person a = new Person(); // Person설계도에 따라서 a  이라는 복사본 만들어줘

        Person hong = new Person(); // Person설계도에 따라서 hong 이라는 복사본 만들어줘
        Person lee = new Person();// Person설계도에 따라서 lee 라는 복사본 만들어줘

        hong.name = "홍길동";
        hong.age = 20;
        hong.home = "서울";

        lee.name = "이순신";
        lee.age = 24;
        lee.home = "대전";

        System.out.println(hong.age + "살, " + hong.home + " 사는 " + hong.name + "입니다.");
        System.out.println(lee.age + "살, " + lee.home + " 사는 " + lee.name + "입니다.");



        // 객체와 클래스

        // 객체는 인스턴스 라고 칭함


        int age = 20;
        String name = "홍길동";
        String home = "서울";

        System.out.println(age + "살, " + home + "사는 " + name + " 입니다.");

        int age2 = 30;
        String name2 = "이순신";
        String home2 = "대전";

        System.out.println(age2 + "살, " + home2 + "사는 " + name2 + " 입니다.");
    }
}
