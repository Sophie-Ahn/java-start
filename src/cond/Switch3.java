package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2 : // break가 없기 때문에 케이스3까지 가서 break 됨
            case 3 :
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }

        System.out.println(coupon);

        // 스위치문은 단순히 값만 넣을 수 있다
        // 값이 같은지 확인하는 연산 또는 문자만 가능하다
        // 특정 값에 따라 코드를 치는 경우면 if문보다 switch문이 더 나음
    }
}
