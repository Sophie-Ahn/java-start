package cond.ex;

public class CondEx4 {
    public static void main(String[] args) {
//        double rating = 7;
//
//        if (rating >= 9) {
//            System.out.println("'고질라'를 추천합니다");
//        } else if (rating > 7 && rating < 9) {
//            System.out.println("'토이 스토리'를 추천합니다");
//            System.out.println("'고질라'를 추천합니다");
//        } else if (rating <= 7){
//            System.out.println("'어바웃타임'을 추천합니다");
//            System.out.println("'토이 스토리'를 추천합니다");
//            System.out.println("'고질라'를 추천합니다");
//        };

        // 풀이
        double rate = 7;

        if (rate <= 9) {
            System.out.println("'어바웃타임'을 추천합니다");
        };

        if (rate <= 8) {
            System.out.println("'토이 스토리'를 추천합니다");
        };

        if (rate <= 7) {
            System.out.println("'고질라'를 추천합니다");
        }
    }
}
