package operator.ex;

public class OperationEx3 {
    public static void main(String[] args) {
        int score = 90;
        System.out.println(80 < score && score < 100);


        // 풀이
        int exScore = 80;
        boolean result = exScore >= 80 && exScore <= 100;
        System.out.println(result);
    }
}
