package day7.composition;

public class LeeCorparation {
    public static void main(String[] args) {

        LeeCorp leeCorp = new LeeCorp(); // 아래에 있는 회사 설계도 대로 길순이와 길동이의 자리가 있는 회사를 만들었다.

        leeCorp.developer = new Kildong(); // > 결과적으로 길동이한테 시킨 것 new 다음에 오는 것을 지니로 바꾸면 지니한테 시키는 것
        leeCorp.kilsoon = new Kilsoon();// 길순이 자리에 길순이 고용

        leeCorp.java(); // 자바 프로그래밍  > 자바 + 파이썬 실행 메서드는 Composition 클래스에 있음
        leeCorp.python(); // 파이썬 프로그래밍

    }
}

class LeeCorp { // 회사 설계도

    JavaDeveloper developer;
    Kilsoon kilsoon;


    public void java() {
        developer.java(); // 길동이 자리가 자바 담당임 > 지니가 앉았으니 지니가 실행하겠지??
    }

    public void python() {
        kilsoon.python(); // 길순이가 파이썬 담당직원임
    } // 파이썬을 시키면 길순이가 실행
}

// 길동이 클래스 수정 없이 지니로 변경하고 싶으면 클래스를 하나 더 만들어서 그 안에 넣고 확장해서 찾아보라고 해야겠지?