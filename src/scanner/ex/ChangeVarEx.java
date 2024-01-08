package scanner.ex;

public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = b;

        b = a;
        a = temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // 풀이
        int c = 10;
        int d = 20;
        int tempr; // 빈 값의 변수를 만들어줌

        tempr = c;
        c = d;
        d = tempr;

        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
