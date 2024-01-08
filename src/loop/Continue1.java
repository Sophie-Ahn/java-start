package loop;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;
        while(i <= 5){
            if (i == 3) {
                i++;
                continue;
                // continue를 할 시 밑에 있는 라인은 다 무시하고 다시 while문을 돌림
            }
            System.out.println(i);
            i++;
        }
    }
}
