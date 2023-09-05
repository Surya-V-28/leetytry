
import java.util.*;

public class LargestCommmonPrefix {
    public static void main(String[] args) {
        String[] inputs = {"reflower","flow","flight"};
        

    }
}


class LargestCommmonPrefixWays {
    static void halfWaySolution(String[] inputs){
        Arrays.sort(inputs,new Comparator<String>(){
            @Override
            public int compare(String st1,String st2){
                return Integer.compare(st1.length(),st2.length());
            }
        });
        int leng = inputs[0].length()-1;
        System.out.println(leng);
        for(int j=1;j<inputs.length;j++){
            if(inputs[0].substring(0,leng).equals(inputs[j].substring(0,leng))){
                continue;
            }
            else {
                leng--;
            }
            if(leng==-1){
                break;
            }
        
        }
        System.out.println(inputs[0].substring(0,leng));
    }



    static void BetterCompareTwoSolution(String strs){
        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs);
        int leng = strs[0].length()-1;
        if(leng==-1){
            return "";
        }
        if(strs.length==1){
            return strs[0];
        }
        for(int j=0;j<strs[0].length();j++){
            if(strs[0].charAt(j)!=strs[strs.length-1].charAt(j)){
                return  ans.toString();
            }
            ans.append(strs[0].charAt(j));
        }
        return ans.toString();
    }
}