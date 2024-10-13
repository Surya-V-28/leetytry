
import java.util.logging.Logger;


public class FindPossibleSum {
    private static final Logger logger = Logger.getLogger(FindPossibleSum.class.getName());
    public static void main(String args[]){
        System.out.println("working");
        int[] arr = {1,2,3,4,5,6};
        int div = 3;
        int ans = 0;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[i]+arr[j])%div==0)
                {
                    ans++;
                }
            }
            logger.info(ans);  
        }

    }
}