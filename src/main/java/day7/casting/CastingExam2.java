package day7.casting;

public class CastingExam2 {
    public static void main(String[] args) {
    Weapon weapon = new Spear();
    weapon.attack();

    weapon = new Bow();
    weapon.attack();


}
}
class Weapon{
    public void attack (){
    }
}
class Spear extends Weapon {
    public void attack(){
        System.out.println("칼로 공격합니다.");
    }
}

class Bow extends Weapon {
    public void attack(){
        System.out.println("활로 공격합니다.");
    }
}



