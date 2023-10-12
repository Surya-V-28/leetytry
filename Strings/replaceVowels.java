


import java.util.*;


public class replaceVowels { 
    public static void main(String args[]){ 
        System.out.println("Working surya ");
        String h = "leetcode";
       
       boolean right = false, left= false;
        char[] carray = h.toCharArray();
        int i=0, j = carray.length-1;
        while(i<j){
            if(carray[i]=='a'||carray[i]=='e'||carray[i]=='i'||carray[i]=='o'||carray[i]=='u'){
               // System.out.println("workied found");
                left = true;
            }
            if(carray[j]=='a'||carray[j]=='e'||carray[j]=='i'||carray[j]=='o'||carray[j]=='u'){
                //System.out.println("workied found here");
                right=true;
            }
            if(right==true && left==true){
                char temp = carray[i];
                carray[i] = carray[j];
                carray[j] = temp;
                right = false;
                left = false;
            }
                i++;
                j--;
        }
        for(char hell: carray){
            System.out.println(hell);
        }
    }
}