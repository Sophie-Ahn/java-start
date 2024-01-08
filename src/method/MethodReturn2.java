package method;

public class MethodReturn2 {
    public static void main(String[] args) {
        // return을 만나면 메소드에서 무조건 빠져나

        checkAge(20);
    }

    public static void checkAge(int age) {
        if (age < 18) {
            System.out.println(age + "살, 미성년자는 출입이 불가능합니다.");
            return;
        }

        System.out.println(age + "살, 입장하세요");
    }
}
