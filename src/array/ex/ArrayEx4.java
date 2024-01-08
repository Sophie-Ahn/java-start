package array.ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] number = new int[5];
        int count = 0;
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요:");
        for (int i = 0; i < number.length; i++){
            number[i] = input.nextInt();
            sum += number[i];
            count++;
        }

        double div = (double) sum / count;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + div);


        // 풀이
        // 5개라는 갯수가 정해져 따로 카운트를 안해도 됨
//        Scanner scanner = new Scanner(System.in);
//        int[] numbers = new int[5];
//        int sum = 0;
//        double average;
//        System.out.println("5개의 정수를 입력하세요:"); for (int i = 0; i < 5; i++) {
//            numbers[i] = scanner.nextInt();
//            sum += numbers[i];
//        }
//        average = (double) sum / 5;
//        System.out.println("입력한 정수의 합계: " + sum);
//        System.out.println("입력한 정수의 평균: " + average);
    }
}
