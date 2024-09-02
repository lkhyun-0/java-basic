package day7;

public class DuckSim {
    public static void main(String[] args) {

        Duck d1 = new Duck();
        d1.fly();
        d1.swim();

        Mallard m1 = new Mallard();
        m1.fly();
        m1.swim();

        WhiteDuck w1 = new WhiteDuck();
        w1.fly();
        w1.swim();

        Rubberduck r1 = new Rubberduck();
        r1.fly();
        r1.swim();

        Rubberduck r2 = new Rubberduck();
        r2.fly();
        r2.swim();

        AsuraDuck a1 = new AsuraDuck();
        a1.fly();
        a1.swim();


    }
}

class Duck {
    public void fly(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
    public void swim(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
    }

class Mallard extends Duck { // 청둥오리
}

class WhiteDuck  extends Duck {
}

class Rubberduck extends Duck {
    public void fly() {
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }
    public void swim(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}

// 상속의 한계 부모클래스는 무조건 하나
// 객체가 많아지고 상속관계가 복잡해질 수록 중복의 해결이 어려워짐
// 상속을 잘못 사용 > 큰일이 난다~
// 상속을 남용하면 1개를 바꾸면 모두 작동을 안할 수 있기 때문에
// 잘 생각해서 사용하도록
class AsuraDuck  extends Duck {
    public void swim(){
        System.out.println("오리가 둥둥 떠다닙니다.");
    }
}
// 객체는 먼저 자신의 메서드를 사용한다 > 찾아봐도 안나오면 부모클래스에서 찾아서 사용