package method.ex;

public class MethodEx2Ref {
    public static void main(String[] args) {
        message("Hello, world", 3);
        message("Hello, world", 5);
        message("Hello, world", 7);
    }

    public static void message(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }
}
