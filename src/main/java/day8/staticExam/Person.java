package day8.staticExam;

public class Person {
    static int age;
    static String name;
    static int avgAge ;
    static String greeting ;// 인류의 평균 나이

    public Person() {
        this.age = age;
        this.name = name;
        this.avgAge = 80;
        this.greeting = "안녕";

    }

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n", age, name);
    } // 이런경우에는 static 붙이면 안됨

    public static void printAvgAge() {
        System.out.printf("인류 평균 나이는 %d 세 입니다.\n", avgAge);
    }

    public static void walk() {
        System.out.printf("사람이 걷습니다.");
    } // 이런경우에는 필요에 따라서 static을 붙여도 좋다 절대 남용 금지 모르겠다면 사용 하지 마라
    public static void printValue(String greeting){
        System.out.println(greeting);
    }
}


