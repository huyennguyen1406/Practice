package Arrays;


public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8};
        int length = arr1.length + arr2.length;
        int[] merge = new int[length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[index++] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            merge[index++] = arr2[i];
        }
//        StringBuilder s = new StringBuilder();

        for (int i = 0; i < merge.length - 1; i++) {
            System.out.print(merge[i] + ", ");
        }
        System.out.print(merge[merge.length - 1]);

//        for (int num : merge) {
//            s.append(num).append(
//        String res = s.toString().substring(0, s.length() - 2);
//        System.out.println(res);

//        int num = 0;
//        for (int element : arr1) {
//            merge[num] = element;
//            num++;
//        }
//        for (int element : arr2) {
//            merge[num] = element;
//            num++;
//        }
//        System.out.println(Arrays.toString(merge));
    }
}
