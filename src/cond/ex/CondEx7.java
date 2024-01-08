package cond.ex;

public class CondEx7 {
    public static void main(String[] args) {
        int x = 2;
        int calc = x % 2;

        String num = (calc > 0 ? "홀수" : "짝수");
        System.out.println("x = " + x + ", " + num);

        // 풀이
        int y = 2;
        String result = (y % 2 == 0) ? "짝수" : "홀수";
        System.out.println("y = " + y + ", " + result);
    }
}
