package cond;

public class CondOp1 {
    public static void main(String[] args) {
        int age = 18;
        String status;
        if(age >= 18){
            status = "성인";
        }else {
            status = "미성년자";
        }

        System.out.println(status + age);
        // 단순히 true와 false에 따라 특정 값을 구하는 경우
        // 삼항 연산자 또는 조건 연사자라 불리는 ?: 연산자 사용가능
    }
}
