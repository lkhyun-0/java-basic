package day6.constructor;

public class Warrior {
    String name;
    int attack;
    int defense;

    public Warrior(String nameParam, int attackParam, int defenseParam) {
        System.out.println("전사가 태어납니다.");
        name = nameParam;
        attack = attackParam;
        defense = defenseParam;
    }

    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", name, attack, defense);
    }

    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙니다.", name, attack);
    }

    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", name, defense);

    }

}
