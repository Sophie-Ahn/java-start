package array.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하세요:");
        int number = 0;
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            number = input.nextInt();
            arr[i] = number;
        }

        for (int j = 0; j < arr.length; j++){
            System.out.print(arr[j]);

            if (j < arr.length - 1) {
                System.out.print(", ");
            }
        }


        // 풀이
//        Scanner scan = new Scanner(System.in);
//        int[] num = new int[5];
//
//        System.out.println("5개의 정수를 입력하세요:");
//        for (int i = 0; i < num.length; i++){
//            num[i] = scan.nextInt();
//        };
//
//        System.out.println("출력");
//        for (int i = 0; i < num.length; i++){
//            System.out.print(num[i]);
//
//            if (i < num.length - 1) {
//                System.out.print(", ");
//            }
//        }
    }
}
