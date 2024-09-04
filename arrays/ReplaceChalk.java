
import java.util.*;
public class ReplaceChalk {
    public static void main(String[] args){
        System.out.println("Working");
        int[] chalk = {3,4,1,2};
        int k = 25;
        int totalSum =0;
        for(int i=0;i<chalk.length;i++){ totalSum= totalSum+chalk[i];
        }
         k= k%totalSum;
        
        for(int i=0;i<chalk.length;i++){
            k=k-chalk[i];
            if(k<0){
                System.out.println(chalk[i] + " worked here " + i);
                break;
            }
        }

    }
}