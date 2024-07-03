
import java.util.*;

public class SuccessfulPairsSpellsPotions {
    public static void main(String args[]){
        System.out.println("Working");
        int[]  spells = {3,1,2}, potions = {8,5,8};
        int success = 16;
        int j=0,counter =0;;
        int[] ans = new int[spells.length];

        Arrays.sort(potions);
    
    int arr[] =new int [spells.length];
    
    for(int i=0;i<spells.length;i++){
       int start=0;
        int end=potions.length;
       
          while(start<end){
              int mid=start+(end-start)/2;
              if(spells[i]*1l*potions[mid]>=success){
                  end=mid;
              }
              else{
                  start=mid+1;
              }
          }
              arr[i]=(potions.length -end);
    }
        for(int l=0;l<arr.length;l++){
            System.out.println(arr[l]);
        }

    }
}

