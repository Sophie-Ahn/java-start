package variable;

public class Var8 {
    public static void main(String[] args) {
        byte b = 127; // -128 ~ 127
        short s = 32767; // -32,768 ~ 32,767
        int i = 2147483647; // -2,147,483,648 ~ 2,147,483,647 (약 20억)
        long l = 9223372036854775807L;
        // long은 뒤에 대문자 L을 넣어줘야 인식이 됨

        // 실수
        float f = 10.0f; // float는 뒤에 f를 넣어줘야 인식이 됨
        double d = 10.0; // float보단 double이 더 정밀도가 높음
    }
}
