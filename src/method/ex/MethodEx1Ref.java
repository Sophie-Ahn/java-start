package method.ex;

public class MethodEx1Ref {
//    public static void main(String[] args) {
//
//        double average = average(1, 2, 3);
//        System.out.println("평균값: " + average);
//
//        average = average(15, 25, 35);
//        System.out.println("평균값: " + average);
//    }
//
//    public static double average(int a, int b, int c) {
//        int sum = a + b + c;
//        double average = sum / 3.0;
//
//        return average;
//    }

    // 풀이
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(15,25,35));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
