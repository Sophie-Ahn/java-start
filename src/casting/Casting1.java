package casting;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = (long) intValue;
        System.out.println("longValue" + longValue);

        doubleValue = (double) intValue;
        System.out.println("doubleValue" + doubleValue);

        doubleValue = (long) 20L;
        System.out.println("doubleValue" + doubleValue);

        // int < long < double이 더 큰 범위다
        // 작은 숫자 타입에서 큰 숫자 타입에 대입하면 문제가 되지 않음

        // 하지만 결국 대입하는 형(타입)을 맞추어야 함
        doubleValue = intValue;
        doubleValue = (double) intValue;
        doubleValue = (double) 10;
        doubleValue = 10.0;
        // ()를 앞에 넣어주면 작은 범위가 큰 범위로 변한다
    }
}
