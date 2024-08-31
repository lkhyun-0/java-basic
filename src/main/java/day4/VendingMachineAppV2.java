package day4;

import day5.prectice.Person;

import java.util.ArrayList;
// 생성자 사용해서 자판기 프로그램을 만들어 보자
//VendingMachine 클래스 안에 음료 데이터를 한번에 저장하고 사용하자
import java.util.Scanner;

public class VendingMachineAppV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 뭔가를 받을거임
        VendingMachine vm = new VendingMachine(); //VendingMachine와 같은 vm이라는 새 폴더 만들기

        while (true) {
            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : ");
            int menu = Integer.parseInt(sc.nextLine());
            if (menu == 1) {
                System.out.println("돈을 투입해주세요 : ");
                int money = Integer.parseInt(sc.nextLine());
                vm.inputMoney(money); // 잔액저장하고 현재 입력값 출력해주기
                System.out.println("현재 투입된 금액은 " + money + "원입니다.");

            } else if (menu == 2) {
                System.out.print("음료수를 선택해주세요 : ");
                int target = Integer.parseInt(sc.nextLine());
                String beverage = vm.selectBeverage(target); //
                if (beverage.equals("잔액 부족")) {
                    System.out.println("잔액이 부족합니다.");
                    continue;
                }

                if (beverage.equals("수량 부족")) {
                    System.out.println("수량이 부족합니다.");
                    continue;
                }
                System.out.println(beverage + "을/를 뽑으셨습니다.");
                int remainder = vm.getRemainder();
                System.out.println("잔액은 " + remainder + " 원입니다.");

            } else if (menu == 3) {
                vm.printBeverage();

            } else if (menu == 4) {
                int remainder = vm.getRemainder();
                System.out.println("현재 잔액은 " + remainder + "원 입니다.");

            } else if (menu == 5) {
                int remainder = vm.getRemainder();
                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 " + remainder + "원이 반환됩니다.");
                break;
            }
        }
    }
}