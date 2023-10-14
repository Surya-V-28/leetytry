


import java.util.*;


public class StringCompression {
    public static void main(String args[]) {
        System.out.println("Working the fine");

        String[] nums  = {"f","a","a","a","b","b","c","c","c","d"};
        StringBuilder stringBuilder = new StringBuilder();
        int count=0;
        String c =nums[0];
        for(int i=1;i<nums.length;i++){
            if(c==nums[i]){
                count++;
            }
            else if (c!=nums[i]){
                count++;
                stringBuilder.append(c);
                stringBuilder= checkForSingleDigit(count,stringBuilder);
                count=0;
                c= nums[i];
            } else {
                System.out.println("Workied in else");

            } 
        }
        count++;
        stringBuilder.append(c);
        stringBuilder= checkForSingleDigit(count,stringBuilder);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);

        for(int i=0;i<stringBuilder.length();i++){
            nums[i] = ""+stringBuilder.charAt(i);
        }
        for(String vals : nums){
            System.out.println(vals);
        }
    }
    static StringBuilder checkForSingleDigit(int num,StringBuilder stringBuilder){
        String finas = Integer.toString(num);
        if(num==1){
            System.out.println(num);
        } else  {
             for(int i =0; i<finas.length();i++){
                stringBuilder.append(finas.charAt(i));
             }
        }
        return stringBuilder;
    }
}