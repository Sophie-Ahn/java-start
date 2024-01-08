package array;

public class Array1Ref1 {
    public static void main(String[] args) {
        int[] students; // int형 배열 변수 선언
        students = new int[5]; // int형 변수가 5개가 만들어진 것

        System.out.println(students); // 참조값. 메모리의 주소를 나타냄
        // 배열을 생성했으면 참조값이 생성이 되어 변수안에 저장됨

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생1 점수: " + students[0]);
        System.out.println("학생2 점수: " + students[1]);
        System.out.println("학생3 점수: " + students[2]);
        System.out.println("학생4 점수: " + students[3]);
        System.out.println("학생5 점수: " + students[4]);

    }
}
