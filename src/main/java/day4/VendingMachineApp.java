package day4;

import java.util.Scanner;
//v1 객체 없이 문제 해결
public class VendingMachineApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // 뭔가를 받겠다!! 선언

        String[] names = {"콜라", "사이다", "커피"};
        int[] prices = {1000, 1200, 800};// 배열생성
        int remainder = 0; // 잔액변수 선언

        while (true) {
            System.out.print("1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료 : ");
            int menu = Integer.parseInt(sc.nextLine());
            // 분기 먼저
            if (menu == 1) {
                System.out.print("돈을 투입해주세요 : ");
                int money = Integer.parseInt(sc.nextLine());
                System.out.println("현재 투입된 금액은 " + money + "원 입니다.");
                remainder = remainder + money; // 잔액 변수에 투입금액 더해서 저장

            } else if (menu == 2) {
                System.out.print("음료수를 선택해주세요 : ");
                int target = Integer.parseInt(sc.nextLine());

                if (prices[target] > remainder) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }
                System.out.println(names[target] + "를 뽑았습니다.");
                remainder = remainder - prices[target]; // 잔액에서 음료수 가격 빼기
                System.out.println("잔액은 " + remainder + " 원입니다."); // 잔액 알림


            } else if (menu == 3) {
                System.out.println("=== 음료수 목록 ===");
                for (int i = 0; i < names.length; i++) {
                    System.out.println(i + ". " + names[i] + " : " + prices[i] + "원");
                }


            } else if (menu == 4) {
                System.out.println("현재 잔액은 " + remainder + "원 입니다.");

            } else if (menu == 5) {
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈" + remainder + "원이 반환됩니다.");
                break;
            }
        }

    }
}
