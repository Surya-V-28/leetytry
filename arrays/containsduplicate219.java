
import java.util.*;
import java.lang.Math;

public class  containsduplicate219  {

    public static void main(String arg[]){
        int[] arrs = {1,2,3,1};
        int  k =3;
        HashMap<Integer,Integer> hash = new HashMap<>();
        boolean flag = false;
        for(int i=0;i<arrs.length;i++){
            if(hash.containsKey(arrs[i])){
              int first = hash.get(arrs[i]);
              int value =Math.abs(i - first);
              if(value<=k){
                System.out.println("True");
                flag = true;
                break;
              }
              else {
                hash.put(arrs[i],i);  // update  the new entry of the variable for the list
              }
            }
            else {
                hash.put(arrs[i],i);
            }
        }
        if(!flag){
            System.out.println("False");
        }
    }
}