package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int number = input.nextInt();

        int[] arr = new int[number];
        int min, max;
        System.out.println(number + "개의 정수를 입력하세요:");
        for (int i = 0; i < number; i++){
            arr[i] = input.nextInt();
        }

        min = max = arr[0];

        for (int i = 0; i < number; i++) {
            // for문을 돌면서 처음에 설정해줬던 min값과 비교하면서
            // if 조건이 충족이 되면 min값을 다시 설정 해줌으로서
            // min, max값을 알 수가 있음
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max =arr[i];
            }
        }

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
