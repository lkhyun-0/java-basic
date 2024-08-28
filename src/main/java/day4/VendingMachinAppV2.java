package day4;

import java.util.Scanner;

public class VendingMachinAppV2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 뭔가를 받겠다 선언

        Vending v = new Vending(); // 자바야 벤딩 클래스보고 새 객체(폴더) 만들어줘
        int remainder;

        while (true) {
            System.out.print("1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료 : ");
            int menu = Integer.parseInt(sc.nextLine());

            if (menu  == 1) {
                System.out.print("돈을 투입해주세요 : ");
                int money = Integer.parseInt(sc.nextLine());
                v.inputmoney(money);
                System.out.println("현재 투입된 금액은 "+ money + "원 입니다.");
            } else if (menu == 2) {


            } else if (menu == 3) {


            } else if (menu == 4) {

            } else if (menu == 5) {
                System.out.println("자판기 프로그램을 종료합니다. 잔액은 원 입니다.");

            }

        }
    }}
// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 1
// 돈을 투입해주세요 : 2000
// 현재 투입된 금액은 2000원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 2000원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 2000원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 0
// 콜라 를 뽑으셨습니다.
// 잔액은 1000 원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 1000원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 1
// 잔액이 부족합니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 1
// 돈을 투입해주세요 : 200
// 현재 투입된 금액은 200원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 4
// 현재 잔액은 1200원 입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 3
// == 음료수 목록 ==
// 0. 콜라 : 1000원
// 1. 사이다 : 1200원
// 2. 커피 : 800원

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 2
// 음료수를 선택해주세요 : 2
// 커피 를 뽑으셨습니다.
// 잔액은 400 원입니다.

// 기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : 5
// 자판기 프로그램을 종료합니다. 남은 돈 400원이 반환됩니다.




// 정답 코드 + vending 클래스에 메서드 생성해야함
// vm.inputMoney(money);
// vm.selectBeverage(target)
// vm.getRemainder();
// vm.printBeverages();

//package day4.vending;
//
//import java.util.Scanner;
//
//public class VendingMachineApp2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        VendingMachine vm = new VendingMachine();
//        while (true) {
//            System.out.print("기능 선택 (1. 돈 투입,  2. 음료 선택,  3.음료 목록 확인, 4.잔액 확인, 5. 사용 종료) : ");
//            int menu = Integer.parseInt(sc.nextLine());
//
//            if (menu == 1) {
//                System.out.println("돈을 투입해주세요 : ");
//                int money = Integer.parseInt(sc.nextLine());
//                vm.inputMoney(money);
//                System.out.println("현재 투입된 금액은 " + money + "원입니다.");
//            }
//            else if (menu == 2) {
//
//                System.out.print("음료수를 선택해주세요 : ");
//                int target = Integer.parseInt(sc.nextLine());
//                String beverage = vm.selectBeverage(target);
//                System.out.println( beverage + "을/를 뽑으셨습니다.");
//                int remainder = vm.getRemainder();
//                System.out.println("잔액은 " + remainder + " 원입니다.");
//
//            }
//            else if (menu == 3) {
//                vm.printBeverages();
//            }
//            else if (menu == 4) {
//                int remainder = vm.getRemainder();
//                System.out.println("현재 잔액은 " + remainder + "원 입니다.");
//            }
//            else if (menu == 5) {
//                int remainder = vm.getRemainder();
//                System.out.println("자판기 프로그램을 종료합니다. 남은 돈 " + remainder  + "원이 반환됩니다.");
//                break;
//            }
//        }
//    }
//}


// 사칙연산 이름목록 입출금 자판기 만들기 복습하기