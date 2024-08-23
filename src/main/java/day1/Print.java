package day1;

public class Print {

    // 주석 (comment) : 사람이 보기 위한 코멘트 컴퓨터는 무시한다.(한줄 주석)
    // 여러줄 주석 : 전체 선택 컨트롤 + /
    //        aaa;
    //        bbb;
    //        ccc;
    //        ddd;
    public static void main(String args[]) {
        // 프로그램 명령어(코드)는 위에서 아래로 순차실행된다.
        // 출력 : System.out.print() 괄호 안의 값을 콘솔에 출력
        // 출력 : System.out.print'ln'() 출력 후 줄바꿈을 해준다

        System.out.print(100);
        System.out.print(777);

        System.out.println(100);
        System.out.println(777);
        // 문자 ""로 표현
        System.out.println("이경현");
        // 더하기 + 기호
        System.out.println(100 + 200);
        // 문자 + 문자
        System.out.println("100 + 200 =" + "300");
        System.out.println("100 + 200 =" + 300);
        System.out.println("100 + 200 = " + 100 + 200); //문자+숫자 숫자가 문자가 되어 이어붙이기 됨
        System.out.println("100 + 200 = " + (100 + 200));

        // 하나의 출력문에서 줄바꿈 하기 : \n(줄바꿈 문자)
        System.out.println("안녕하세요\n반갑습니다");

        System.out.println("2 X 1 = 2\n2 X 2 = 4\n2 X 3 = 6\n2 X 4 = 8\n2 X 5 = 10\n2 X 6 = 12\n2 X 7 = 14\n2 X 8 = 16\n2 X 9 = 18");
        System.out.println("2 X 1 = " + (2 * 1) + "\n2 X 2 = " + (2 * 2) + "\n 2 X 3 = " + (2 * 3));
    }
}
