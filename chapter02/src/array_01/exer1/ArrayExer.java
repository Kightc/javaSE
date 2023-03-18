package array_01.exer1;

public class ArrayExer {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 1, 6, 2, 9, 7, 0, 3};
        int[] index = new int[]{2, 0, 8, 5, 1, 3, 2, 7, 4, 6, 4 };
        StringBuilder number = new StringBuilder();

//        for (int i = 0; i < index.length; i++) {
//            int a = index[i];
//            number += arr[a];
//           }
        for (int a : index) {
            number.append(arr[a]);

//            System.out.println(number.hashCode());
        }
        System.out.println(number);

    }
}
