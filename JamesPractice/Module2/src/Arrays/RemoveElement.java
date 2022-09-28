package Arrays;

public class RemoveElement {

    public static int[]removeElement(int x) {
        int index = 0;
        int[] arr = { 1, 4, 6, 8, 12, 0};
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                index = i;
                break;
            }
        }
        return arr;
    }
}
