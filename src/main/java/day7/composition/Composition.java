package day7.composition;

public class Composition {
    public static void main(String[] args) {

        Kildong dong = new Kildong();
        Kilsoon soon = new Kilsoon();
        // 자바는 내가 할게. 대신 넌 파이썬을 해.
        //dong.java();
        soon.java(); // 길순아 자바 프로그래밍 해줘
    }
}

class Kildong extends JavaDeveloper {
    public void java() {
        System.out.println("자바 25버전 프로그래밍");
    }
}

class Kilsoon {
    Kildong kildong = new Kildong();
    public void java() {
        // 길동이한테 연락.
        kildong.java();
    }
    public void python() {
        System.out.println("파이썬 프로그래밍");
    }
}

class Jinee extends JavaDeveloper{
    public void java() {
        System.out.println("아주 뛰어난 자바 프로그래밍");
    }
}

class JavaDeveloper {
    public void java(){
        System.out.println("자바 프로그래밍");
    }
}

// 마지막 7일차 마지막 부분 다시 풀기 새패키지에