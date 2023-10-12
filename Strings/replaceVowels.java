


import java.util.*;


public class replaceVowels { 
    public static void main(String args[]){ 
        System.out.println("Working surya ");
        String h = "hello";
       boolean right = false, left= false;
        char[] carray = h.toCharArray();
        int i=0, j = carray.length-1;
        while(i<j){
            if(carray[i]!='a'||carray[i]!='e'||carray[i]!='i'||carray[i]!='o'||carray[i]!='u'){
                i++;
            }
             else if(carray[j]!='a'||carray[j]!='e'||carray[j]!='i'||carray[j]!='o'||carray[j]!='u'){ 
                j--;
             }
            else {
                char temp = carray[i];
                carray[i] = carray[j];
                carray[j] = temp;
                i++;
                j--;
            }
        }
        for(char hell: carray){
            System.out.println(hell);
        }
    }
}