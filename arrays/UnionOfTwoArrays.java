import java.util.*;

public class  UnionOfTwoArrays {
    public static void main(String[] args){
        System.out.println("Working");
        int arr1[] = {-8,-3 ,-3, -2, 0, 1, 2, 2, 6};
        int arr2[] = {-9, -9, 0};
        int n = 9, m=3;
        int i=0,j=0;
        ArrayList<Integer> ar = new ArrayList<>();
        boolean arrch = false, arrch2 = false;
        while(i<n && j<m){
           if(arr1[i]<=arr2[j]) {
               if(ar.size()==0 || ar.get(ar.size()-1) !=arr1[i]){
                 ar.add(arr1[i]);
               }
                 i++;
             } 
             else {
                 if(ar.size()==0 || ar.get(ar.size()-1) !=arr2[j]){
                    ar.add(arr2[j]);
                  }
                 j++;
             }
        }
        if(i==n) {
            while(j<m){
                if(ar.size()==0 || ar.get(ar.size()-1) !=arr2[j]){
                    ar.add(arr2[j]);
                  }
                j++;
            }
        } else {
            while(i<n){
                if(ar.size()==0 || ar.get(ar.size()-1) !=arr1[i]){
                    ar.add(arr1[i]);
                  }
                i++;
            }
        } 

        System.out.println(ar);
    }
}