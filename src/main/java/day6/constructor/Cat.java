package day6.constructor;

public class Cat {
    String name;
    int age;
    String kind;
    public Cat (String nameParam, int ageParam, String kindParam){
        name = nameParam;
        age = ageParam;
        kind = kindParam;
    }
    public void meow(){
        System.out.printf("%d살 %s 고양이 %s가 야옹하고 웁니다:\n",age,kind,name);
    }
}
