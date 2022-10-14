package Arrays;

public class MaxMultiArrays {
    public static void main(String[] args) {
        int[][] multiArrays = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        int maxArr = multiArrays[0][0];
        for (int row = 0; row < multiArrays.length; row++) {
            for (int col = 0; col < multiArrays[row].length; col++) {
                if (multiArrays[row][col] > maxArr) {
                    maxArr = multiArrays[row][col];
                }
            }
        }
        System.out.println(maxArr);
    }
}
