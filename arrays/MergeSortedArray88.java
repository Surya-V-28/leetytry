



import java.util.*;


public class MergeSortedArray88 {
    public static void main(String args[]){
        System.out.println("Welocme to surya working");
       
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,4,5};
        int i =2,j=2;
        int k = i+j+1;

        while(j>=0){
            if(i >= 0 && nums1[i] >nums2[j]){
                nums1[k--] = nums1[i--];
               
            }
            else {
                nums1[k--] = nums2[j--];
               
            }
        }

        for(int ad : nums1){
                    System.out.println(ad);
           }
         


        

    }
}


// int[] nums1 = {1,2,3};
//         int n= 3, m =3;
//         int[] nums2 = {2,5,6};
//         int[] fias = new int[n+m];
//         int onec=0,twoc=0;
//         int   storeIvalue =0;
//         for(int i=0;i<fias.length-1;i++){
//             if(onec <=2&&twoc<=2){

//             if(nums1[onec] <=nums2[twoc]){
//                 fias[i] = nums1[onec];
//                 onec++;
//             } else if(nums1[onec] >nums2[twoc]){
//                 fias[i] = nums2[twoc];
//                  twoc++;

//             }
//             storeIvalue = i;
//         }
//         }
//         System.out.println("this is value of One" + onec + " this is the value of  2 "+ twoc);
//         if(onec==3) {
//             System.out.println("working");
//             for(int i =4;i<n+m-1;i++){
//                 fias[i] = nums2[twoc];
//                 twoc++;
//             }
//             for(int ad : fias){
//                 System.out.println(ad);
//             }
//         }
//         if(twoc==3) {

//             System.out.println("working 2");
//             for(int i =4;i<n+m-2;i++){
//                 fias[i] = nums1[onec];
//                 onec++;
//             }
//             for(int ad : fias){
//                 System.out.println(ad);
//             }
//         }