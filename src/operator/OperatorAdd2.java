package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고 b에 대입을 한다
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자
        a = 1;
        b = 0;

        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " + b);

        a++;
        ++a;
        // 단독으로 사용하면 ++를 어느 위치에 있든 1씩 증가한다
    }
}