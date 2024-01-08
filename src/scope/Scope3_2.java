package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if (m > 0) {
            int temp = m * 2;
            System.out.println("temp=" + temp);
        }
        System.out.println("m=" + m);

        // temp라는 변수는 if문 안에서만 사용됨으로 main이 아닌 if문 아네
        // 변수 설정 해 놓으면 메모리사용도 줄고 가독성 있는 코드가 짜여진다
    }
}
