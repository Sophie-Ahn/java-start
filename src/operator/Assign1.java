package operator;

public class Assign1 {
    public static void main(String[] args) {
        int a = 5;
        a += 3; // a = a + 3 => 8
        a -= 2; // 6
        a *= 3; // 18
        a /= 6; // 3
        a %= 1; // 0
        System.out.println(a);
    }
}
