import java.util.*;


public class BuildStackOperationUsingarray {
    public static void main(String args[]){
        System.out.println("Working yarr");
        int[] target = {1,3,5};
        int n= 5;
        int Counter =0;
        List<String> res  = new ArrayList<String>();
        for(int i=1;i<=n;i++){
            res.add("Push");
          if(i==target[Counter]){
            Counter++;
          }
          else {
            res.add("Pop");
          }
          if(Counter==target.length){
            break;
          }
        }
        System.out.println(res);
    }
}