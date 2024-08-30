package day6.constructor;

public class Car {
    String model;
    String color;
    int speed;

    public Car(String modelParam, String colorParam, int speedParam) {
        System.out.println("자동차가 만들어집니다.");
        model = modelParam;
        color = colorParam;
        speed = speedParam;
    }

    public void drive() {
        System.out.println(color + model + "이/가" + speed + "km 로 달립니다.");

    }

}
