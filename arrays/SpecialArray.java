
import java.util.ArrayList;

public class SpecialArray {

    public static void bruteForce(String[] args) {
        int[] nums = {3, 7, 8};
        int prev = -1;
        int[][] queries = {{2, 2}};
        ArrayList<ArrayList<Boolean>> ans = new ArrayList<>();
        boolean[] last = new boolean[queries.length];
        ArrayList<Boolean> makes = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            prev = -1;

            for (int i = 0 + j; i < nums.length; i++) {

                if (prev == -1) {
                    prev = nums[i] % 2;
                    makes.add(true);
                } else if (prev == nums[i] % 2) {
                    makes.add(false);
                    prev = nums[i] % 2;
                    for (int k = makes.size(); k < nums.length; k++) {
                        makes.add(false);
                    }
                    break;
                } else {
                    makes.add(true);
                }
                prev = nums[i] % 2;
            }
            ans.add(new ArrayList<>(makes));
            makes.clear();
        }
        System.out.println(ans);
        int j = 0;
        for (int[] query : queries) {
            if (ans.get(query[0]).size() < query[1]) {
                last[j++] = ans.get(query[0]).get(ans.get(query[0]).size() - 1);

            } else {
                last[j++] = ans.get(query[0]).get(query[1]);
            }

        }

        for (boolean elem : last) {
            System.out.print(" , " + elem);

        }
    }

    public static void main(String args[]) {
        System.out.println("Working");
        int[] nums = {3, 7, 8};
        int prev = -1;
        int[][] queries = {{2, 2}};
        int preSum[] = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i - 1];
            if (nums[i - 1] % 2 == nums[i] % 2) {
                preSum[i]++;
            }
        }
        System.out.println("preSum of the arrays ");
        for (int elem : preSum) {
            System.out.print(elem + " , ");
        }
        boolean[] ans = new boolean[queries.length];
        int i = 0;
        for (int[] query : queries) {
            int count = query[1] - query[0];
            ans[i++] = count >= 1 ? false : true;

        }
        System.out.println("answer is here");
        for (boolean each : ans) {
            System.out.println(each);

        }

    }
}
