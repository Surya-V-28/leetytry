


import java.util.*;


public class ReverseOfAString {
    public static void main(String args[]){
        String name= "a good                 example"        ;

        name = name.trim();
        name = name.replaceAll("\\s+"," ");
        String[] arrays = name.split(" ");
        String na = "";

        for(int i=arrays.length-1;i>=0;i--){
           System.out.print(arrays[i]);
        }

        System.out.println(na.trim());

    }
}