package day4.MethodRetrun;

public class AccountExam {

        public static void main(String[] args) {

                Account a1 = new Account(); // Account 설계도 보고 객체 a1 만들기

                a1.deposit(1000); //Account 클래스 deposit 메서드의 money에 1000 넣기
                a1.deposit(2000); //deposit 메서드의 money에 2000 넣기
                a1.deposit(3000); //deposit 메서드의 money에 3000 넣기 -> remainder는 6000이 된다.

                int money = a1.withdraw(500); // 출금 메서드를 실행 머니 값에 400 넣기
                System.out.println(money); // 입력값 리턴받음 400

                int remainder = a1.getRemainder(); //잔액 메서드 실행
                System.out.println(remainder); // 잔액값 remainder 리턴 5600

                money = a1.withdraw(1500); // 출금 메서드 실행 1400 넣기 (잔액 변수-1400) 4200
                System.out.println(money); // 입력값 출력

                remainder = a1.getRemainder(); //getRemainder메서드 실행
                System.out.println(remainder); // 잔액 출력
    }
   }
// 다시 풀어보기

