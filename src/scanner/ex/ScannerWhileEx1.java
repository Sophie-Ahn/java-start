package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = input.nextLine();

            if(name.equals("종료")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이를 입력하세요 : ");
            int age = input.nextInt();
            // 여기서 숫자를 적고 엔터를 치면 nextInt()가 숫자만 읽고 엔터부분은 못 읽는다
            // 내가 이름을 입력을 하지 않았지만 엔터라는 것을 글자로 인식하고 넘어가버림
            input.nextLine();
            // 그래서 임시로 nextLine을 써줘야 엔터라는 글자를 읽고 사용자가 이름을 작성할 수 있음

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
