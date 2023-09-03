


import java.util.*;
public class TopKfrequent {
    public static void main(String args[]){
        Helper1.printer("working");
       HashMap<Integer,Integer> hash = new HashMap<>();
       List<Integer> list = new ArrayList<>();
       Integer max;
        int[] nums = {1,2};
        int ans[] = new int[2];
        int k =2,a=0;
        for(int i=0;i<nums.length;i++){
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        for(int values:hash.values()){
            System.out.print(values + " ");
            list.add(values);
        }
        System.out.println(hash);
        for(int j=0;j<k;j++){
           max = Collections.max(list);
           for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
            if(entry.getValue() ==max){
                 ans[a] = entry.getKey();
                 a++;
            }
           } 
           list.remove(max);
        }
        arrayhelper.arrayPrinter(ans);


    }

}


class Helper1 {
    static void  printer(String s){
        System.out.println(s);
    }
}