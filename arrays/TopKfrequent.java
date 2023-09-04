


import java.util.*;
public class TopKfrequent {
    public static void main(String args[]){
        Helper1.printer("working");
        int[] nums = {1,1,1,2,2,3,3,3,3,3};
        int k=2;
        Helper1.mywithOutPriQueue(nums,k);
        Helper1.myPriotyQueue(nums,k);

    }

}


class Helper1 {
    static void  printer(String s){
        System.out.println(s);
    }


    static void mywithOutPriQueue(int[] nums,int k) {
        int ans[] = new int[k];
        int a=0,wel;
        HashMap<Integer,Integer> hash = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
         
         for(int i=0;i<nums.length;i++){
             hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
         }
         for(int values:hash.values()){
             list.add(values);
         }
         Collections.sort(list,Collections.reverseOrder());
         for(int j=0;j<list.size();j++){
            queue.add(list.get(j)); 
         }
         for(int j=0;j<k;j++){
             for(Map.Entry<Integer,Integer> entry:hash.entrySet()){
                 if(entry.getValue()==queue.peek()){
                     if(a==k){
                         break;
                     }
                     ans[a] = entry.getKey();
                     a++;
                     int removed = queue.remove();
                 }
             }
         }
         arrayhelper.arrayPrinter(ans);
        
 
    }

    static void myPriotyQueue(int[] nums , int k ){
    int ans[] = new int[k];
     HashMap<Integer,Integer> hash = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
     }
     System.out.println(hash);
     PriorityQueue<Integer> queue = new PriorityQueue<>((a,b)->hash.get(b)-hash.get(a));
     for(int num: hash.keySet()){
         queue.add(num);
     }
     for(int j=0;j<k;j++){
        ans[j] = queue.poll();
     }
     arrayhelper.arrayPrinter(ans);
     
     
    }

}