
public class NumberofWaystoSplitArray {

    public static void main(String[] args) {
        System.out.print("working on the code");
        int[] nums = {10, 4, -8, 7};
        int[] fPreSum = new int[nums.length];
        int[] rPreSum = new int[nums.length];
        fPreSum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            fPreSum[i] = fPreSum[i - 1] + nums[i];
        }
        rPreSum[nums.length - 1] = nums[nums.length - 1]; // Start from the last element
        for (int i = nums.length - 2; i >= 0; i--) {
            rPreSum[i] = rPreSum[i + 1] + nums[i];
        }
        System.out.println(" forend ");
        for (int i = 0; i < fPreSum.length; i++) {
            System.out.print(fPreSum[i] + " , ");
        }
        System.out.println("");
        System.out.println(" revserse  ");
        for (int i = 0; i < rPreSum.length; i++) {
            System.out.print(rPreSum[i] + " , ");
        }
        int ans = 0;
        for (int i = 0; i < fPreSum.length - 1; i++) {
            if (fPreSum[i] >= rPreSum[i + 1]) {
                ans++;
            }
        }
        System.out.println("the final answer is " + ans);
    }
}
