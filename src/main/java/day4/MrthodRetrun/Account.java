package day4.MrthodRetrun;

public class Account {
    int remainder = 0; // 잔액변수 선언

    // 예금 메서드
    public void deposit(int money){
        System.out.println(money + "을 예금했습니다.");
        remainder = remainder + money; // 잔액에 입금값 더해서 저장
    }

    // 출금 메서드
    public int withdraw(int money){
        remainder = remainder - money; // 잔액에서 출금 값을 빼고 저장
        return money; // 입력값 리턴
    }
    // 잔액출력 메서드
    public int getRemainder(){
        return remainder; // 잔액 리턴
    }
}
// 다시 풀어보기