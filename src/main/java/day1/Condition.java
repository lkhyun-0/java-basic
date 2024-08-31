package day1;

public class Condition {
    public static void main(String[] args) {

        if (false) {
            System.out.println("안녕");
        }
        if (false) {
            System.out.println("바이");
        }
        int num;
        num = 15;
        if (num > 10) {
            System.out.println("num이 10보다 크다");
        }
        int money;
        money = 10000;

        if (money >= 10000) {
            System.out.println("치킨을 먹어요");
        }
        if (money < 10000) {
            System.out.println("떡볶이를 먹어요");
        }

        int weather;
        weather = 3;

        if (weather == 1) {
            System.out.println("날씨가 맑습니다. 나들이 나가세요.");
        }
        if (weather == 2) {
            System.out.println("날씨가 흐립니다. 집에 계세요");
        }
        if (weather == 3) {
            System.out.println("날씨가 비가 옵니다. 우산을 챙기세요.");
        }
        if (weather == 4) {
            System.out.println("날씨가 눈이 옵니다. 눈사람 만들어 보세요.");
        }


// 나이에 따른 학적 표현
// 초등학생, 중학생, 고등학생, 성인

        int age;
        age = 21;

        if (age <= 8) {
            System.out.println("초등학생");
        } else if (age <= 16) {
            System.out.println("중학생");
        } else if (age <= 19) {
            System.out.println("고등학생");
        } else {
            System.out.println("성인");
        }


    }

}