package day3.MethodExam;

public class Car {
    int car;

    int loop;

    String carname;
    int km;


    public void run(int loop) {
        for (int i = 0; i < loop; i++) {
            System.out.println("자동차가 달립니다.");
        }

    }

    public void run2(int car) {
        for (int i = 0; i < car; i++) {
            System.out.println("자동차가 달립니다.");
        }
    }
    public void run3(){
        System.out.println(carname + "이/가 최대속력 " + km + "으로 달립니다.");
    }
}
