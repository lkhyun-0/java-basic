package day4;
import day5.prectice.Person;
import java.util.ArrayList;
import java.util.Scanner;
//public class VendingMachineAppV2 {
//    public static void main(String[] args) {
//
//            VendingMachine bv1 = new VendingMachine();
//            bv1.names = "콜라";
//            bv1.prices = 1000;
//            bv1.count = 1;
//
//            VendingMachine bv2 = new VendingMachine();
//            bv2.names = "사이다";
//            bv2.prices = 1200;
//            bv2.count = 2;
//
//            VendingMachine bv3 = new VendingMachine();
//            bv3.names = "커피";
//            bv3.prices = 800;
//            bv3.count = 2;
//
//            ArrayList<VendingMachine> bv = new ArrayList<>();
//
//            bv.add(bv1);
//            bv.add(bv2);
//            bv.add(bv3);
//
//            for (int i = 0; i < bv.size(); i++){
//
//                VendingMachine b = bv.get(i);
//            }



// ===================================================================================================








//Scanner sc = new Scanner(System.in);
//
//        VendingMachine vm = new VendingMachine();
//
//        while (true) {
//            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : ");
//            int menu = Integer.parseInt(sc.nextLine());
//
//            if (menu == 1) {
//                System.out.println("돈을 투입해주세요 : ");
//                int money = Integer.parseInt(sc.nextLine());
//                vm.inputmoney(money);
//                System.out.println("현재 투입된 금액은 " + money + "원입니다.");
//            }
//            if (menu == 2) {
//                System.out.print("음료수를 선택해주세요 : ");
//                int target = Integer.parseInt(sc.nextLine());
//                String beverage = vm.selectBeverage(target);
//
//                if (beverage.equals("잔액부족")) {
//                    System.out.println("잔액이 부족합니다.");
//                    continue;
//                }
//                if (beverage.equals("재고없음")) {
//                    System.out.println("재고가 없습니다.");
//                    continue;
//                }
//                System.out.println(beverage + "을/를 뽑으셨습니다.");
//
//                int remainder = vm.getRemainder();
//                System.out.println("잔액은 " + remainder + " 원입니다."); // 그냥 잔액을 꺼내오면 됨
//
//
//            } else if (menu == 3) {
//                vm.printBeverages(); // 그냥 목록을 꺼내오면됨 수량정보 기억하기
//
//            } else if (menu == 4) {
//                int remainder = vm.getRemainder();
//                System.out.println("현재 잔액은 " + remainder + "원 입니다.");
//            } else if (menu == 5) {
//                int remainder = vm.getRemainder();
//                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 " + remainder + "원이 반환됩니다.");
//                break;
//            }