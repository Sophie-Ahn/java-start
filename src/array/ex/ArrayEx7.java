package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        int[][] arr = new int[4][3];
//        int sum = 0;
//        double div = 0;
//        for (int i = 0; i < 4; i++) {
//            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
//
//            System.out.print("국어 점수:");
//            arr[i][0] = input.nextInt();
//
//            System.out.print("영어 점수:");
//            arr[i][1] = input.nextInt();
//
//            System.out.print("수학 점수:");
//            arr[i][2] = input.nextInt();
//
//        }
//
//        for (int i = 0; i < 4; i++){
//            sum = arr[i][0] + arr[i][1] + arr[i][2];
//            div = (double) sum / 3;
//            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", " + "평균: " + div);
//        }

        // 풀이
        Scanner input = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for (int j = 0; j < 3; j++) {
                System.out.print( subjects[j] + " 점수: ");
                score[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += score[i][j];
            }

            double average = (double) total / 3;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
    }
}
