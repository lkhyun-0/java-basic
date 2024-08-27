package day3;
// 명명 규칙 클래스명은 대문자로 시작 의미가 바뀔때 대문자로 - 카멜표기법
// 함수나 변수는 소문자로 시작
// 상수는 모두 대문자로 띄어쓰기는 언더바_

import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {

        // help >
        // (add : 이름 입력
        // list : 이름 목록
        // exit : 종료) > 출력

        // add 입력 > 이름을 입력해주세요 : aaa
        // 나이를 입력해주세요 : 20
        // aaa가 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : tomas
        // 나이를 입력해주세요 : 20
        // tomas이 명부에 저장되었습니다.
        // 명령어 입력 : add
        // 이름을 입력해주세요 : chris
        // chris이 명부에 저장되었습니다.
        // 나이를 입력해주세요 : 20
        // 명령어 입력 : list
        // 1. john
        // 2. tomas
        // 3. chris

        // 명령어 입력 : exit
        // 이름 프로그램이 종료됩니다. > 프로그램 종료

        Scanner sc = new Scanner(System.in); // 뭔가를 받겠다. 선언

        String[] names = new String[1000];
        int[]ages = new int[1000];// 비어있는 이름 배열 선언
        int index = 0; // 입력된 이름 데이터 순서 나이 데이터도 같이 사용


        while (true) {
            System.out.println("명령어 입력 : "); // 계속 반복되어야 함
            String str1 = sc.nextLine(); // 문자인 입력값을 str1에 받겠다.

            if (str1.equals("help")) { // str1이 "help"와 같은 경우
                System.out.println("add : 이름추가");
                System.out.println("list : 이름목록확인");
                System.out.println("exit : 종료"); // > 를 출력함.l

            } else if (str1.equals("add")) { // 그렇지 않고 "add"와 같은 경우 (저장하기)
                System.out.print("이름을 입력해주세요 : "); // 출력
                names[index] = sc.nextLine(); // names[index] names = 비어있는 배열을 지칭, [index]는 배열의 순서를 지칭 따라서 지금 입력하는 값을 names라는 비어있는 배열에 index 번째에 넣겠다 선언임
                System.out.print("나이를 입력해주세요. : "); // 출력
                ages[index] = Integer.parseInt(sc.nextLine()); //
                System.out.println(names[index] + " 이 명부에 저장되었습니다."); // 위의 입력값 출력해줌
                index++;// 그리고 인덱스는 하나씩 증가하도록해서 0번방부터 차례대로 들어가도록 함

            } else if (str1.equals("list")) { // 그렇지 않고 "list"와 같은 경우 (저장값 불러오기)
                for (int i = 0; i < index; i++){ //i 는 배열순서 배열의 방을 가르킴 0부터 시작하고 1씩 증가한다.
                    System.out.println((i+1) + ". " + names[i] + ", "+ ages[i] ); //(i+1)은 배열이 0부터 시작하기 때문이다. "1."를 만들기 위함
                }
            } else if (str1.equals("exit")) {
                System.out.println("이름 프로그램을 종료합니다.");
                break; // 종료명령어
            }

            }
        }
    }

