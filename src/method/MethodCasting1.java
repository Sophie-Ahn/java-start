package method;

import org.w3c.dom.ls.LSOutput;

public class MethodCasting1 {
    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int) number);
        // double을 int형에 대입하므로 컴파일 오류
    }

    public static void printNumber(int n) {
        System.out.println("숫자: " + n);
    }
}
