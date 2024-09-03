package day8.accessModifier;

public class Calculator {
    int num1 = 10;
    private int num2 = 2;

    // setter 정하자
    // 명명규칙 set변수명() -> 카멜표기법 반드시 지켜줘야함
    // setNum1()

    // 메서드는 변수를 사용해서 작동하는게 대부분
    // 객체의 변수에 잘못된 데이터가 들어오면 메서드가 고장난다.
    // 객체의 변수는 함부로 바꾸면 안된다.
    public void divide() {
        System.out.println(num1 / num2); // public 안에 있는 자원
    }

    // num의 값을 설정할 수 있는 메서드를 설정하는 법
    // 이 메서드는 public으로 열어둠
    // Calculator가 가진 num의 세팅 값을 변경할 수 있음

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        if (num2 == 0) {
            System.out.println("0은 나눌 수 없습니다. 기본값인 1로 세팅합니다.");
            num2 = 1;
        }
        this.num2 = num2;

    }
    public int getNum1() {
        return num1;
    }

}
// getter 가져오자
// 명명규칙 get변수명() -> 카멜표기법 반드시 지켜줘야함
// getNum1()