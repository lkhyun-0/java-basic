package day7.inheritance;
 // 상속에 대해 알아보자
public class Inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.breathe();

        Cat c1 = new Cat();
        c1.moew();
        c1.breathe();

        Person p1 = new Person();
        p1.breathe();
    }

}

class Animal{
    public void breathe(){
        System.out.println("숨쉬다~!");
    }
} // 강아지와 고양이 모두 동물이니 Animal로 묶어서 생각~

class Dog extends Animal{
    public void bark(){
        System.out.println("멍멍 짖다.");
    }
} // 자바에게 힌트를 준다 > 자바야 확장(extends)해서 생각해봐 Animal설계도에서 찾아보면 나올거야

class Cat extends Animal{
    public void moew(){
        System.out.println("야옹");
    }
}
class Person extends Animal{
}







