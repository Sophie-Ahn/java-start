package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("입력받을 숫자의 개수를 입력하세요:");
        int number = input.nextInt();

        int[] arr = new int[number];
        int sum = 0;

        System.out.println( number +"개의 정수를 입력하세요:");
        for (int i = 0; i < number; i++){
            arr[i] = input.nextInt();
            sum += arr[i];
        }

        double div = (double) sum / number;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + div);
    }
}
