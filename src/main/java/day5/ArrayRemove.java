package day5;

public class ArrayRemove {
    public static void main(String[] args) {
        int[] arr = new int[10]; // 배열은 길이가 정해져있어야함.
        int count = 0; // 전체 데이터의 개수


        arr[0] = 1;
        count++;

        arr[1] = 2;
        count++;

        arr[2] = 3;
        count++;

        arr[3] = 4;
        count++;

        arr[4] = 5;
        count++;

//        arr[2] = arr[3];



        for (int i = 2; i < count - 1; i++) {
            arr[i] = arr[i - 1];
            System.out.println(arr[i]);
        }
// 배열에서 요소를 삭제하는 것은 불가능하다. 그런 방법은 존재하지 않음.
// 따라서 삭제가 된 것처럼 보이게 만들어야함.
// 삭제하고 싶은 데이터의 뒤의 것들을 땡겨와서 덮어쓰기한 후에 필요없는 데이터는 사용하지 않음
// 이러한 방법으로 삭제가 된것처럼 보이게 만든다.

// 배열의 단점 -> 길이가 고정되어 있음
// 유연성이 떨어지고 삭제나 추가기능이 복잡하다

// 해결방법은 길이를 유동적으로 변환이 가능하게 하는 배열을 사용하면 됨 => 동적배열이라함(ArrayList)


    }
}

//
