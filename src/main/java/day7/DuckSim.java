package day7;

public class DuckSim {
    public static void main(String[] args) {

        Duck d1 = new Duck();
        d1.fly();
        Mallard m1 = new Mallard();
        m1.fly();
        WhiteDuck w1 = new WhiteDuck();
        w1.fly();
        Rubberduck r1 = new Rubberduck();
        r1.donfly();
        r1.donswim();
        AsuraDuck a1 = new AsuraDuck();
        a1.fly();
        a1.donswim();
    }
}

class Duck {
    public void fly(){
        System.out.println("오리가 날개로 날아갑니다.");
    }
    public void swim(){
        System.out.println("오리가 오리발로 헤엄칩니다.");
    }
    public void donfly(){
        System.out.println("저는 날 수 없어요. ㅠㅠ");
    }
    public void donswim(){
        System.out.println("오리가 둥둥 떠다닙니다.");

    }
}

class Mallard extends Duck {
}

class WhiteDuck  extends Duck {
}

class Rubberduck extends Duck {

}

class AsuraDuck  extends Duck {
}