package loop;

public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true){
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break;
                // break문이 없으면 합이 10보다 커도 빠져나오지 못함
            }
            i++;

        }
    }
}
