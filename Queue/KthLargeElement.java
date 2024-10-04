
import java.util.*;

public class KthLargeElement {
    public static void main(String args[]){
        System.out.println("Working");
        int k =2;
        int[] nums = {3,2,1,5,6,4};
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for(int num : nums){
            if(q.size()<k){
                q.offer(num);
            } 
            else if(num>q.peek()){
                q.poll();
                q.offer(num);
            }
        }
        System.out.println("working " + q);

    }
}