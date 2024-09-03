package day8.staticExam;

public class StaticExam {
    public static void main(String[] args) {
//        Person p1 = new Person(20, "홍길동");
//        Person p2 = new Person(30, "이순신");

//        p1.introduce();
//        p2.introduce();
//
//        p1.age++;
//        p1.introduce();

        //클래스와 객체를 따로 만드는 이유 같은 구조인데 서로 다른 정보를 갖게하기 위함
        // 복사본인 객체를 만들어서 서로 다른 정보를 저장해야함

//        p2.introduce(); // p1의 나이를 올렸기때문에 p2는 변하지 않음

//        p1.printAvgAge(); // p1의 인류 평균나이가 81로 수정되어 출력됨
//        p2.printAvgAge(); // p2의 인류의 평균나이는 여전히 80임
//
//        p1.avgAge = 81;
//
//        p1.printAvgAge();
//        p2.printAvgAge();


        //인류의 평균 나이가 81로 정정된경우 하나하나 다시 넣어줘야함
        //객체는 자신만의 개성을 표현하기 위해 존재하지만 간혹 무든 객체가 공유하는 정보가 있을 수 있음
        // 객체간의 공유 정보를 static으로 표현

        // 매서드는 일반적으로 객체화한 후에 사용가능하지만 static을 붙이면 class에서 바로 사용가능함
//        Person.printAvgAge(); // new를 하지 않아도 사용가능하므로 편리함. 하지만 모든 변수나 메서드에 남용하면 안됨

        // static은 꼭 필요한 경우에만 사용해야하며 메서드에서도 static 변수를 사용할 때나 객체가
        // 가지고 있는 변수를 사용하지 않는 경우에만 붙여야함

        Person p1 = new Person();
        p1.name = "홍길동";
        p1.age = 22;

        p1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.

        Person p2 = new Person();
        p2.name = "홍길순";
        p2.age = 25;
        p2.introduce();
        // 출력 : 저는 25살 홍길순 입니다.


        p1.name = "홍길동";
        p1.age = 22;
        p1.introduce();
        // 출력 : 저는 22살 홍길동 입니다.


        }






    }

