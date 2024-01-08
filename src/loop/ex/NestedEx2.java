package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
//        for (int rows = 2, i = 1; i <= rows; i++) {
//            for (String star = "*"; star.length() <= i;){
//                System.out.print(star);
//            }
//        }

        // 풀이
//        int rows = 5;
//
//        for (int i = 1; i <= rows; i++){
//            for(int j = 1; j <= i; j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int row = 5;
        for (int i = 1; i <= row; i++){
            for (int j = 5; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
