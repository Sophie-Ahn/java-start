package loop.ex;

public class WhileEx3 {
    public static void main(String[] args) {
//        int max = 100;
//        int i = 1;
//
//        while (i <= max){
//            int sum = i;
//            if (i == max) {
//                System.out.println(sum);
//                break;
//            }
//            i++;
//        }

//        int max = 3;
//        int i = 1;
//        int sum = 0;
//
//        while(i <= max) {
//            sum += i;
//            if (i == max) {
//                System.out.println(sum);
//                break;
//            }
//            i++;
//        }


        // 풀이
        int max = 100;
        int i = 1;
        int sum = 0;

        while (i <= max) {
            sum += i;
            i++;
        };

        System.out.println(sum);

    }
}
