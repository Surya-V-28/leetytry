


import java.util.*;

import java.lang.*; 
public class LengthOfLastWord {
    public static void main(String args[]){
        String got =  "  luffy   chi   is still joyboy                Helks      dema   ";
        LengthOfLastWordWays.someNewWayWithSplit(got);
        
        
    }
}


class LengthOfLastWordWays {
     static void myOwnMethod(String got){
        int count =0,flag=0;
        char[] chars =  got.toCharArray();
        
        for(int i=chars.length-1;i>=0;i--){
            if(chars[i] !=' '){
                count++;
                flag=1;
            }
            if(chars[i]==' '&& flag == 1){
                break;
            }
        }
        System.out.println(count);

     }

     static void someNewWayWithSplit(String got){ 
        String[] revi = got.split(" ");
        StringHelper.StringPrinterS(revi);
        System.out.println(revi[revi.length-1].length());
     }
}