package day7.constructorChain;

public class ConstructorChain {
    public static void main(String[] args) {
        WhiteDuck wd1 = new WhiteDuck();
        wd1.fly();
    }
}

class Duck {
    public Duck (){
        System.out.println("Duck이 생성됩니다.");
    }
    public void fly () {
        System.out.println("오리가 납니다.");
    }

}

class WhiteDuck extends Duck {
    public WhiteDuck(){
        System.out.println("WhiteDuck이 생성됩니다.");
    }
    public void fly () {
        System.out.println("흰오리가 납니다.");
    }
}
// 객체의 자기 자신의 메서드를 먼저 사용한다