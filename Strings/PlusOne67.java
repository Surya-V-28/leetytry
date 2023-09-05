



import java.util.*;

public class PlusOne67 {
    public static void main(String args[]){
        int[] num = {9,8,7,6,5,4,3,2,1,0};
        long count = 0;
        for(int i=0;i<num.length;i++){
            count= count*10+num[i];  
        }
        System.out.println(count);
        String finalans  = String.valueOf(count+1);
        int[] news = new int[finalans.length()];
        for(int j=0;j<finalans.length();j++){
            int vals  = Character.getNumericValue(finalans.charAt(j));
            news[j] = vals;
        }
        StringHelper.arrayPrinter(news);
    }
}