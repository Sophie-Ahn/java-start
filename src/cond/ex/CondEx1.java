package cond.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 75;
        String grade;

        if (score >= 90) {
            grade = "A";
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 80 && score < 90) {
            grade = "B";
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 70 && score < 80) {
            grade = "C";
            System.out.println("학점은 " + grade + "입니다");
        } else if (score >= 60 && score < 70) {
            grade = "D";
            System.out.println("학점은 " + grade + "입니다");
        } else {
            grade = "F";
            System.out.println("학점은 " + grade + "입니다");
        }

        // 풀이
//        int score = 85;
//        if (score >= 90) { System.out.println("학점은 A입니다.");
//        } else if (score >= 80) { System.out.println("학점은 B입니다.");
//        } else if (score >= 70) { System.out.println("학점은 C입니다.");
//        } else if (score >= 60) { System.out.println("학점은 D입니다.");
//        } else {
//            System.out.println("학점은 F입니다.");
//        }
    }
}
