import java.util.List;

public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7},
                {7, 8, 9, 7}
        };

        List<Integer> result = SnailMatrix.snail(matrix);
        System.out.println(result);
    }
}
