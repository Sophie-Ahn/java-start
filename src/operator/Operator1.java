package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈 (소수점이 제거된 몫만 나옴)
        int div = a / b;
        System.out.println("a / b = " + div);

        // 나머지 (나머지만 나옴)
        int mod = a % b;
        System.out.println("a % b = " + mod);

        // 수학적으로 0으로 나눌 수 없듯이 코딩에서도 오류가 나버림
//        int z = 10 / 0;
//        System.out.println(z);
    }
}
