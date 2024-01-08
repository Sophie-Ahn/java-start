package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생
        intValue = (int) doubleValue;
        System.out.println(intValue); // 1
        System.out.println(doubleValue);
        // 표현은 10으로 되어있지만 데이터 값은 10.5로 남아있음

        System.out.println(10.5);
        System.out.println((int)10.5);
        // 형변환 한다고 해서 안에 있는 값이 변하는 것은 아님
    }
}
