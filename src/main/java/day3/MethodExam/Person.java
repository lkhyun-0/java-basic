package day3.MethodExam;

public class Person {
    String name;

    int age;

    int b;

    int lang;
    int c;


    public void introduce() {
        for (int i = 0; i < 1; i++)
            System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다!");

    }

    public void introduce2(int b) {
        for (int i = 0; i < b; i++) {
            System.out.println("안녕하세요. 저는 " + age + "살 " + name + "입니다!");

        }

    }

    public void greeting1(int lang) {
        if (lang == 1) {
            System.out.println("안녕하세요");
        } else if (lang == 2) {
            System.out.println("하이");
        } else if (lang == 3) {
            System.out.println("봉쥬르");
        }


    }

    public void greeting2(int lang, int c) {

        if (lang == 1) {
            for (int i = 0; i < c; i++) {
                System.out.println("안녕하세요");
            }
        } else if (lang == 2) {
            for (int i = 0; i < c; i++) {
                System.out.println("하이");
            }
        }else if (lang == 3) {
                for (int i = 0; i < c; i++) {
                    System.out.println("봉쥬르");
                }


            }
        }
    }

