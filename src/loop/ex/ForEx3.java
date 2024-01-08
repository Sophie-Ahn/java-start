package loop.ex;

public class ForEx3 {
    public static void main(String[] args) {
//        for (int max = 100, i = 1; i <= max; i++){
//            int sum = i + 1;
//            if (i == max){
//                System.out.println(sum);
//            }
//        }

        // 풀이
        int max = 100;
        int sum = 0;
        for (int i = 1; i <= max; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
