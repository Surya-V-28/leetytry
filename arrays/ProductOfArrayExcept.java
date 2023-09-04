

import java.util.*;

public class ProductOfArrayExcept {
    public static void main(String args[]){
        System.out.println("Working ");
        int[] nums = {1,2,3,4};
        ProductHelper.EasyMethod(nums);
        
       
    }
}


class ProductHelper  {
    static void ownMethod(int[] nums){
        int[][] ans = new int[nums.length-1][1];
        int[][] ans1 =new int[1][nums.length-1];
        HashMap<Integer,Integer> hash = new HashMap<>();
        for (int[] row :ans) {
            Arrays.fill(row,1);
        }
        for(int j=0;j<nums.length;j++){
            hash.put(nums[j],j);
        }
        for(int j=0;j<nums.length;j++){
            System.out.println(nums[j]);
            if(j==hash.get(nums[j])){
                Collection<Integer> collection = hash.keySet();
                List<Integer> list = new ArrayList<>(collection);
                list.remove(j);
                ans1[0][0] = 0;
                break;
            }

        }
        arrayhelper.arrayPrinter2d(ans1);

    }

     static void EasyMethod(int[] arrs){
        int sum=1;
        int[] ans  = new int[arrs.length];
        for(int i=0;i<arrs.length;i++){
            sum = sum*arrs[i];
        }
        System.out.println("sum " + sum);
        for(int i =0;i<arrs.length;i++){
            ans[i] =sum/ arrs[i];
        }
        arrayhelper.arrayPrinter(ans);
     }
}