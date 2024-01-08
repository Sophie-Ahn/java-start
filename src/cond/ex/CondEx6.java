package cond.ex;

public class CondEx6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        String status = (a < b ? "더 큰 숫자는 " + b + "입니다" : "더 작은 숫자는 " + a + "입니다");
        System.out.println(status);

        // 풀이
        int c = 10;
        int d = 20;
        int max = (a > b ? a : b);

        System.out.println("더 큰 숫자는 " + max + "입니다.");
    }
}
