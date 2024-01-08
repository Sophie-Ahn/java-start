package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;
        int sum4 = (2 * 2) + (3 * 3);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);

        // 복잡한 계산식 같은 경우에는 관례로 괄호를 넣는게 더 알아보기가 쉽다
        // 코드를 좀 더 쓰더라도 명확하고 보기 쉽게 하는 것이 더 낫다
    }
}
