
import java.util.*;
public class logs {
    public static void main(String args[]){
        System.out.println("working");
        String[] log=  {"d1/" , "d2/", "../", "d21/", "./"};
        int ans =0;
        for(int i=0;i<log.length;i++){
            if(log[i].equals("../")) {
                if (ans > 0) {
                    ans--;
                }
            }
            else if(log[i].equals("./")) {
        
            } else {
                  ans++;
            }
        }
        System.out.println(ans);
    }
}