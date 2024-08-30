package day4;
//생성자를 사용해서 만들어보자

import java.util.ArrayList;

public class VendingMachine {
    int remainder = 0;
    // Beverage 클래스 보고 beverages라는 새로운 배열 폴더 만들어줘
    ArrayList<Beverage> beverages = new ArrayList<>(); // 이제 여기다 넣어야겠지???

    public VendingMachine() { // 자판기 생성자 // 이것이 생성자 리턴값 없음
        Beverage bv1 = new Beverage("콜라", 1000, 1);
        Beverage bv2 = new Beverage("사이다", 1200, 2);
        Beverage bv3 = new Beverage("커피", 800, 1); // 음료들의 값을 가지고 시작

        beverages.add(bv1); // 저 위에 있는 배열에 차곡차곡~
        beverages.add(bv2);
        beverages.add(bv3);
    }

    public void inputMoney(int money) {
        remainder = remainder + money; //or remainder += money; 같은 의미임
    }

    public String selectBeverage(int target) {
        Beverage beverage = beverages.get(target); // target 번째에 있는 음료수 정보를 가져옴 // beverage라는 변수 안에 값을 넣음

        if (beverage.price > remainder) {
            return "잔액 부족"; // return 하게 되면 메서드는 거기서 종료. 더이상 밑으로 안내려감.
        }
        if (beverage.count <= 0) {
            return "수량부족";
        }

        remainder -= beverage.price; // 잔액에서 음료가격 뺌
        beverage.count--; // 수량데이터 값 1 감소
        return beverage.name;
    }

    public int getRemainder() {
        return remainder;
    }

    public void printBeverage() {
        System.out.println("=== 음료수 목록 ===");// 저장되어있는 데이터 다 보여줘야겠지?? > 반복문
        for (int i = 0; i < beverages.size(); i++) {
            System.out.println(i + ". " + beverages.get(i).name + " : " + beverages.get(i).price + "원, " + "남은수량 : " + beverages.get(i).count);

        }

    }
}
