package day7.polymorphism;

public class Polmorphism {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();

        String name = "홍길동";
        warrior.name = name;
        warrior.age = 20;

        warrior.introduce();
        // 안녕하세요 저는 20살 홍길동입니다.

        warrior.weapon = new Bow();
        warrior.attack();
        // 출력 : 홍길동이/가 활로 공격합니다.
        warrior.useSkill();
        // 출력 : 홍길동이/가 불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.

        warrior.weapon = new Sword();
        warrior.attack();
        // 출력 : 홍길동이/가 칼로 공격합니다.

        warrior.useSkill();
        // 출력 : 홍길동이/가 연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.
    }
}
class Warrior {
    // 인스턴스 변수
    String name;
    // 인스턴스 변수
    int age;
    // 인스턴스 변수
    Weapon weapon;

    void introduce() {
        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
    }
        void attack() {
        System.out.printf(" " + name + "이/가 ");
        weapon.use();
    }
    void useSkill(){
        System.out.printf(name + "이/가 ");
        weapon.skill();

    }
}

class Weapon {
        void use() {
        System.out.printf(" 무기로 공격합니다. ");
    }
    void skill() {
        System.out.println("스킬 사용");
    }

}

class Sword extends Weapon {
    void use() {
        System.out.printf("칼로 공격합니다.");
    }
    void skill() {
        System.out.println("연속 베기 스킬을 사용합니다. 2배(30)의 피해를 입힙니다.");
    }
}

class Bow extends Weapon {
    void use() {
        System.out.printf("활로 공격합니다.");
    }

    void skill() {
        System.out.println("불화살 스킬을 사용합니다. 1.5배(15)의 피해를 입힙니다.");
    }

}


// 이전문제=========================================

//        Warrior warrior = new Warrior();
//
//        String name = "홍길동";
//        warrior.name = name;
//        warrior.age = 20;
//        warrior.introduce();
//        // 안녕하세요 저는 20살 홍길동입니다.
//
//        warrior.weapon = new Bow();
//        warrior.attack();
//        // 출력 : 홍길동이/가 활로 공격합니다.
//
//        warrior.weapon = new Sword();
//        warrior.attack();
//        // 출력 : 홍길동이/가 칼로 공격합니다.
//    }
//}
//
//class Warrior {
//    // 인스턴스 변수
//    String name;
//    // 인스턴스 변수
//    int age;
//    // 인스턴스 변수
//    Weapon weapon;
//
//    void introduce() {
//        System.out.println("안녕하세요. 저는 " + age + "살 " + name + " 입니다.");
//    }
//
//    void attack() {
//        System.out.printf(" " + name + "이/가 ");
//        weapon.use();
//    }
//}
//
//class Weapon {
//    void use() {
//        System.out.printf(" 무기로 공격합니다. ");
//    }
//
//}
//
//class Sword extends Weapon {
//    void use() {
//        System.out.printf("칼로 공격합니다.");
//    }
//
//}
//
//class Bow extends Weapon {
//    void use() {
//        System.out.printf("활로 공격합니다.");
//    }
//}

