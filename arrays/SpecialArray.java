
public class SpecialArray {

    public static void main(String args[]) {
        System.out.println("Working");
        int[] nums = {4, 3, 1, 6};
        int prev = -1;
        int[][] queries = {{0, 2}, {2, 3}};
        boolean[] last = new boolean[queries.length];
        for (int i = 0; i < last.length; i++) {
            last[i] = true;
        }
        int counter = 0;
        for (int[] arr : queries) {
            prev = -1;
            for (int i = arr[0]; i < arr[1]; i++) {
                if (prev == -1) {
                    prev = nums[i] % 2;
                    last[i] = true;
                } else if (prev == nums[i] % 2) {
                    last[i] = false;
                    prev = nums[i] % 2;
                    break;
                } else {
                    last[i] = true;
                }
                prev = nums[i] % 2;
            }
        }
    }
}
