package day8.accessModifier;

public class AccessModifierExam1 {
    public static void main(String[] args) {

        Person p1 = new Person();
        p1.setId(20);
        p1.getId(20);

        System.out.println("제 번호는 " + p1.getId(20) + "입니다.");
        // 출력 : 제 번호는 20 입니다.
    }
}


// 문제 : 사람의 id를 출력해주세요.
// 조건 : 사람의 id를 20으로 설정해주세요.
// 조건 : 사람 클래스의 id 필드의 private 속성은 수정할 수 없습니다.
// 조건 : 사람 클래스에서 출력할 수 없습니다.

class Person {
    // private => 외부로 공개되지 않는다., 리모콘에 노출되지 않는다.
    private int id;

    public int setId(int id) {
        this.id = id;
        return id;
    }
    public int getId(int id){
        return id;
    }


}
