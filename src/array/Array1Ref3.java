package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students; // int형 배열 변수 선언
        students = new int[]{90,80,70,60,50}; // 배열 생성

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);
    }
}
