package loop;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; ; i++) {
            sum = sum + i;
            if(sum > 10) {
                System.out.println("합이 10보다 크면 종료 i=" + i + " sum=" + sum);
                break;
            }
        }

        int sum1 = 0;
        for (int i = 1; ; i++){
            sum1 = sum1 + i;
            if (sum > 10){
                System.out.println("종료" + i + "/" + sum);
                break;
            }
        }
    }
}
