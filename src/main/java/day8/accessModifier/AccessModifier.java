package day8.accessModifier;

public class AccessModifier {
    public static void main(String[] args) {


        // 자원(변수 + 메서드)에 접근할 수 있는 권한
        //public : 모두 사용 가능
        //protected : 상속관계 + 같은 폴더 안에 있는 객체끼리 사용가능 > 지금 필요 없음
        //default : 같은 폴더 안에 있는 객체끼리 사용가능 > 지금 필요 없음
        //private : 자신만 사용가능

        Calculator c1 = new Calculator();
        c1.num1 = 8;
        c1.divide();
        //c1.num2 = 1; 이게 안됨

        c1.num1 = 20;
        c1.divide();
        // 여기서 0을 넣은게 문제의 원인임
        // 모두 접근 가능한 public으로 설정해놨기 때문임

        // private으로 Calculator의 데이터를 외부로부터 보호하게되면 다른곳에서는 변경할 수 없음

        c1.num1 = 10;
        //c1.num2 = 2; 이것도 안됨

        // num을 세팅할 수 있게 만드는 메서드
        // c1.setnum은 public이라 접근이 가능해짐
        // 조건문을 활용해서 오류를 잡을 수 있음
        c1.setNum1(20);
        c1.setNum2(1);

        c1.divide();

        System.out.println(c1.getNum1()); //

        // 객체변수는 객체 내의 모든 메서드에 영향을 주므로 외부의 접근을 일반적으로
        // private으로 막는다.
        // 변수에 접근이 필요하면 getter와 setter 메서드를 public으로 만들어 사용한다.
    }
}
