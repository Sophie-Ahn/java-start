package array;

public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                // arr배열안에 변수 row라는 행의 갯수를 잼
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
