

import java.util.*;

public class IntersectionTwoArrays {
    public static void main(String args[]){
        System.out.println("Working");
       int[] nums1 = {1,2,2,1}, nums2 = {2,2};
       int l1 = nums1.length;
       int l2 = nums2.length;
       int i = 0, j = 0, k = 0;
       Arrays.sort(nums1);
       Arrays.sort(nums2);
       while( i < l1 && j < l2)
       {
           if(nums1[i] < nums2[j])
           {
               i++;
           }
           else if(nums1[i] > nums2[j])
           {
               j++;
           }
           else
           {
               nums1[k++] = nums1[i++];
               j++;
           }
       }
       System.out.println(Arrays.copyOfRange(nums1,0,k));

    }
}