package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        int i = 10;

        do{// 먼저 조건 상관없이 실행을 먼저 한다
            System.out.println("현재 숫자는:" + i);
            i++;
        }
        while(i < 3); // 알고보니 조건문이 false라서 그 뒤로 do부분을 다시 실행을 못해서 빠져나옴
    }
}
