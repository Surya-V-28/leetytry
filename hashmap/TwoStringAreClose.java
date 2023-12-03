
import java.util.*;


public class TwoStringAreClose {
    public static void main(String args[]){
        System.out.println("Working");
        String name1 = "abc";
        String name2 ="ac";
        int[] arr= new int[26];
        int[] arr2 = new int[26];
        HashSet<Character> hashset = new HashSet<>();
        HashSet<Character> hashset1 = new HashSet<>();

        for(int i=0;i<name1.length();i++){
            hashset.add(name1.charAt(i));
            arr[name1.charAt(i)-'a']++;
        }
        for(int i=0;i<name2.length();i++){
            hashset1.add(name2.charAt(i));
            arr2[name2.charAt(i)-'a']++;
        }

        Arrays.sort(arr);
        Arrays.sort(arr2);

        if(hashset.equals(hashset1) && Arrays.equals(arr,arr2)){
            System.out.println("Wokring teer");
        }
        else {
            System.out.println("False");
        }
    }
}
