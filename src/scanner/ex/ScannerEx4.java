package scanner.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("구구단의 단 수를 입력해주세요: ");
            int num = input.nextInt();

            for(int i = 1; i <= 9; i++){
                int sum = num * i;
                System.out.println(num + " X " + i + " = " + sum);
            }
            break;
        }

        // 풀이
        Scanner input1 = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int num1 = input.nextInt();

        System.out.println(num1 + "의 구구단:");
        for(int j = 1; j <= 9; j++){
            System.out.println(num1 + " X " + j + " = " + num1 * j);
        }
    }
}
