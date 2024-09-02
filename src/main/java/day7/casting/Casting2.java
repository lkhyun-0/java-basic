package day7.casting;

public class Casting2 {
    public static void main(String[] args) {

        // 형변환은 유사한 타입에서만 가능 => int 와 double는 가능하지만 int와 String은 절대 불가능한 형변환

        // 객체간의 형변환

        Dog d1 = new Dog();
        d1.bark();

        Cat c1 = new Cat();
        c1.moew();

       // d1 = c1; Dog 변수에 Car이 대입 될 수 없음

        Animal a1 = new Animal();

        a1 = d1; // Animal 타입 변수에 Dog가 대입되었다 ? - x
        //Dog가 Animal로 모습을 바꿔서 대입되었다 -> ㅇ

        a1 = c1;

        //객체간의 형변환은 상속관계 에서만 허용이 됨

        c1 = (Cat) a1; // Animal을 Cat으로 강제 형변환 > 이거 위험함

        a1 = d1;
        a1.eat();

//        a1 = d1; // a1에는 Dog가 들어가 있음
//        Cat c2 = (Cat)a1; // > Dog -> Cat
//        c2.moew(); // > 에러가 나요 고양이인지 강아지인지 자바는 알 수 없다

        // 자식 객체가 부모 객체로 모습을 바꾸는 것은 안전하다. 자식은 부모의 기능을 무조건 가지고 있기 때문에
        // 부모객체가 자식 객체로 모습을 바꾸는 것은 위험하다. 부모객체는 여러자식 객체를 포함할 수 있기 때문에
        // 특정 객체로 확신할 수 없다.

    }
}



class Animal  {
    public void eat (){
        System.out.println("먹다");
    }
}

class Dog extends Animal {
    public void bark () {
        System.out.println("멍멍");
    }
    }

class Cat extends Animal {
    public void moew () {
        System.out.println("야옹");
    }
}