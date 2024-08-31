package day6.constructor;

public class Person {
    String name;
    int age;

    public Person(String name, int age){
        System.out.println("사람이 태어납니다.");
        this.name = name;// 그냥 name은 바깥에 있는 name을 의미
        this.age = age; // this.name은 매개변수 이 메서드안의 name을 의미함 // 이게 아니면 그냥 매개변수 이름을 바꾸면 됨 예를 들어 nameParam,,,
        //this는 메서드를 수행하는 객체를 의미한다
    }
    public void intro(){
        System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
    }






    // 리턴의 타입(void, int 등등)이 없고 class명과 동일한 이름의 특수한 메서드 > 생성자
    // 객체가 new로 생성되면 생성자는 반드시 실행된다.
    // 메서드 처럼 사용하면 되는 ~ 생성자
//    public Person(String nameParam, int ageParam){ // 매개변수의 데이터를 넣어야만 실행을 할 수 있다
//        System.out.println("사람이 한명 태어납니다");
//        name = nameParam;
//        age = ageParam;


}
