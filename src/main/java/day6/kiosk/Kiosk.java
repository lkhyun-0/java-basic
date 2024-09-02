package day6.kiosk;


import javax.print.attribute.standard.Sides;
import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {
    public static void main(String[] args) {
        int cost = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Burger> burgers = new ArrayList<>(); // 햄버거 목록
        ArrayList<Burger> burgerCart = new ArrayList<>(); // 버거 장바구니

        ArrayList<Side> sides = new ArrayList<>(); //사이드 목록
        ArrayList<Side> sideCart = new ArrayList<>();

        ArrayList<Beverage> beverages = new ArrayList<>(); //음료 목록
        ArrayList<Beverage> beveragesCart = new ArrayList<>();


        Burger b1 = new Burger("한우불고기버거", 6000);
        Burger b2 = new Burger("치즈버거", 3000);
        Burger b3 = new Burger("치킨버거", 3500);
        Burger b4 = new Burger("새우버거", 3200); // 버거 목록

        burgers.add(b1);
        burgers.add(b2);
        burgers.add(b3);
        burgers.add(b4); // 배열에 넣음

        Side s1 = new Side("감자튀김", 1800);
        Side s2 = new Side("치즈스틱", 2000);
        Side s3 = new Side("치킨너겟", 2500);
        Side s4 = new Side("오징어링", 2700);

        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        sides.add(s4); // 배열에 넣음

        Beverage bv1 = new Beverage("콜라", 1000);
        Beverage bv2 = new Beverage("에이드", 2000);
        Beverage bv3 = new Beverage("커피", 1500);
        Beverage bv4 = new Beverage("쉐이크", 2500); // 데이터 입력

        beverages.add(bv1);
        beverages.add(bv2);
        beverages.add(bv3);
        beverages.add(bv4); // 배열에 넣기

        System.out.println("햄버거 키오스크 v1");
        while (true) {
            System.out.println("1. 햄버거 선택");
            System.out.println("2. 사이드 선택");
            System.out.println("3. 음료수 선택");
            System.out.println("4. 메뉴 취소");
            System.out.println("5. 주문하기");

            System.out.println("===== 주문목록 =====");
            System.out.println("버거 : ");
            for (int i = 0; i < burgerCart.size(); i++) {
                System.out.println(burgerCart.get(i).name);
            }
            System.out.println("사이드 : ");
            for (int i = 0; i < sideCart.size(); i++) {
                System.out.println(sideCart.get(i).name);
            }
            System.out.println("음료수 : ");
            for (int i = 0; i < beveragesCart.size(); i++) {
                System.out.println(beveragesCart.get(i).name);
            }
            System.out.print("총금액 : ");
            System.out.println(cost);
            System.out.println("===============");

            System.out.print("무엇을 하시겠습니까? : ");



            int menu = Integer.parseInt(sc.nextLine());

            if (menu == 1) { // 햄버거 목록을 보여줘야 함 burgers에 있다
                System.out.println("=== 버거 목록 ===");
                for (int i = 0; i < burgers.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, burgers.get(i).name, burgers.get(i).price);
                }
                // "%d. %s %d\n"은 1. ~ //  이름과 가격정보를 가져옴
                // 목록을 보여 줬으니까 고르라고 해야겠지?

                System.out.print("어떤 버거를 고르시겠습니까? : ");
                int selectNo = Integer.parseInt(sc.nextLine()); // 번호로 버거목록에서 버거를 선택
                Burger burger = burgers.get(selectNo - 1); // 선택한 번호로 버거 가져오기
                // -1을 한 이유는 메뉴가 1번부터 시작이기 때문에 배열은 0번째부터니까
                //한우불고기버거를 고르셨습니다.
                System.out.println(burgers.get(selectNo - 1).name + "를 고르셨습니다.");
                burgerCart.add(burger); // 선택한 버거를 장바구니에 저장하기

                cost = cost + burgers.get(selectNo - 1).price ;// 가격정보를 cost에 리턴해줘야겠지?

            }
            if (menu == 2) {
                System.out.println("=== 사이드 목록 ===");
                for (int i = 0; i < sides.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, sides.get(i).name, sides.get(i).price);
                }
                System.out.println("===============");

                System.out.print("어떤 사이드를 고르시겠습니까? : ");
                int selectNo = Integer.parseInt(sc.nextLine());
                Side Side = sides.get(selectNo - 1); // 이름 출력하려고
                System.out.println(sides.get(selectNo - 1).name + "를 고르셨습니다.");
                sideCart.add(Side); // 사이드 장바구니에 메뉴가 추가되어야겠지??
                cost = cost + sides.get(selectNo - 1).price;
            }
            if (menu == 3) {
                System.out.println("=== 음료 목록 ===");
                for (int i = 0; i < sides.size(); i++) {
                    System.out.printf("%d. %s %d\n", i + 1, beverages.get(i).name, beverages.get(i).price);
                }
                System.out.println("===============");

                System.out.print("어떤 음료를 고르시겠습니까? : ");
                int selectNo = Integer.parseInt(sc.nextLine());
                Beverage beverage = beverages.get(selectNo - 1);

                System.out.println(sides.get(selectNo - 1).name + "를 고르셨습니다."); // 골랐으면 장바구니에 담아야겠지???

                beveragesCart.add(beverage);
                cost = cost + beverages.get(selectNo - 1).price;

            }
            if (menu == 4) {
                System.out.println("어떤 메뉴를 취소하겠습니까?");
                System.out.println("1. 버거");
                System.out.println("2. 사이드");
                System.out.println("3. 음료수");
                System.out.print("선택 : ");
                int cancl = Integer.parseInt(sc.nextLine());
                if (cancl == 1){
                    System.out.print("품목을 선택해주세요 : ");


                    int cancelSelec = Integer.parseInt(sc.nextLine());

                }








            }
            if (menu == 5) {

            }

        }


    }

}


//4, 5 번 구현하기


// 햄버거 키오스크 v1
// 1. 햄버거 선택
// 2. 사이드 선택
// 3. 음료수 선택
// 4. 메뉴 취소
// 5. 주문 하기
//====== 주문 목록 =====
// 버거: [한우불고기버거]
// 사이드 : []
// 음료수 : []
// 총금액 : 6000
// 무엇을 하시겠습니까 : 2


// 햄버거 키오스크 만들기
// ================================================================


// === 사이드 목록 ===
// 1. 감자튀김 1800
// 2. 치즈스틱 2000
// 3. 치킨너겟 2500
// 4. 오징어링 2700
// 어떤 사이드를 고르시겠습니까 : 2
// 치즈스틱을 고르셨습니다.

// ================================================================

// 햄버거 키오스크 v1
// 1. 햄버거 선택
// 2. 사이드 선택
// 3. 음료수 선택
// 4. 메뉴 취소
// 5. 주문 하기
//====== 주문 목록 =====
// 버거: [한우불고기버거]
// 사이드 : [치즈스틱]
// 음료수 : []
// 총금액 : 8000
// 무엇을 하시겠습니까 : 2

// === 사이드 목록 ===
// 1. 감자튀김 1800
// 2. 치즈스틱 2000
// 3. 치킨너겟 2500
// 4. 오징어링 2700
// 어떤 사이드를 고르시겠습니까 : 1
// 감자튀김을 고르셨습니다.

// ================================================================

// 햄버거 키오스크 v1
// 1. 햄버거 선택
// 2. 사이드 선택
// 3. 음료수 선택
// 4. 메뉴 취소
// 5. 주문 하기
//====== 주문 목록 =====
// 버거: [한우불고기버거]
// 사이드 : [치즈스틱, 감자튀김]
// 음료수 : []
// 총금액 : 9800
// 무엇을 하시겠습니까 : 3

// === 음료수 목록 ===
// 1. 콜라 1000
// 2. 에이드 2000
// 3. 커피 1500
// 4. 쉐이크 2500
// 어떤 음료수를 고르시겠습니까 : 2
// 에이드를 고르셨습니다.

// ================================================================

// 햄버거 키오스크 v1
// 1. 햄버거 선택
// 2. 사이드 선택
// 3. 음료수 선택
// 4. 메뉴 취소
// 5. 주문 하기
//====== 주문 목록 =====
// 버거: [한우불고기버거]
// 사이드 : [치즈스틱, 감자튀김]
// 음료수 : [에이드]
// 총금액 : 11800
// 무엇을 하시겠습니까 : 4

// 어떤 메뉴를 취소하겠습니까?
// 1. 버거
// 2. 사이드
// 3. 음료수
// 선택 : 2

// 품목을 선택해주세요.
// 1. 치즈스틱
// 2. 감자튀김
// 선택 : 1
// 치즈스틱이 취소되었습니다.

// ================================================================

// 햄버거 키오스크 v1
// 1. 햄버거 선택
// 2. 사이드 선택
// 3. 음료수 선택
// 4. 메뉴 취소
// 5. 주문 하기
//====== 주문 목록 =====
// 버거: [한우불고기버거]
// 사이드 : [감자튀김]
// 음료수 : [에이드]
// 총금액 : 9800
// 무엇을 하시겠습니까 : 5

// 정말 주문하시겠습니까?(y/n) : y
// 결제 금액을 입력해주세요 : 20000

// 영수증 발급하시겠습니까?(y/n) : y

// ==== 영수증 =====
// 버거: [한우불고기버거]
// 사이드 : [감자튀김]
// 음료수 : [에이드]
// 총금액 : 9800
//==================

// 거스름든 : 10200원
// 이용해주셔서 감사합니다.
