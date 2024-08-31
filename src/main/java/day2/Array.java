package day2;

public class Array {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;

        // 변수가 많아지면 변수를 관리하는 것도 힘들고 사용하는 것도 힘들다.
        // 원인 변수명이 많아져서 힘듦 -> 변수명을 한개만 쓰면 됨
        // 변수가 많아서 다 사용하기 힘듦 -> 반복문을 사용하면 된다.
        // 결론 배열을 사용하면 됨

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println(arr[3]);

        int num = 10;
        num = 20;
        System.out.println("==========================");
        System.out.println(arr[2]);
        arr[2] = 30;
        System.out.println(arr[2]);
        System.out.println("==========================");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println("==========================");


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 배열의 길이 정보 확인

        int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println(arr2.length);
        System.out.println("=============================================");
        // 내가 저장할 값이 몇개인지 모를 때, 개수를 알아도 구체적인 값을 모를 때
        // 비어 있는 배열을 만들어 놓고 나중에 값을 저장할 수도 있어야 함.

        // 10개 짜리 비어있는 배열을 만들기
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // 아래와 같은 식임

        int[] arr4 = new int[10]; // 비어있는 배열을 만드는 식
        System.out.println(arr3.length);
        System.out.println(arr4.length);
        // 중간에 값 저장
        arr4[4] = 10;
        System.out.println("==================================");


        //배열 문제1.
        System.out.println("배열문제 1번");
        int[]arr5 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        for (int i = 0; i <=arr5.length; i++ ){
            System.out.println(arr5[i]);
        }

        // 문제 2.
        System.out.println("배열문제 2번");

//        int[] arr5 = {1, 2, 3, 4, 5};
//
//        for (int j = 0; j < 2; j++) {
//
//            for (int i = 0; i < 5; i++) {
//                System.out.println(arr5[i]);
//            }
//
//        }

// 문제 3.
        System.out.println("배열문제 3번");
        int[] arr6 = {1, 2, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            System.out.println(arr6[i]);

        }

        // 숫자 배열 -> 숫자만 저장 가능 다른 타입은 불가능하다.
        // 문자 배열
        String[] arr7 = {"apple", "banana", "orange"};
        boolean[] arr8 = {true, false};



    }
}

