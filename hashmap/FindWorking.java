


import java.util.*;

public class FindWorking {

    public static void main(String[] args) {
        System.out.println("Working");
        HashMap<String, Integer> hash  = new HashMap<>();
        String[] given = {"a", "a","a", "d", "e", "e", "e"};
        int k =2;

        for(int i =0; i<given.length;i++) {
            if(hash.containsKey(given[i])){
                hash.put(given[i], hash.get(given[i])+1);
            } else {
                hash.put(given[i], 1);
            }
        }
        for(String i: hash.keySet()){
            if(hash.get(i)<=k) {
                System.out.println(i);
            }
        }
        
    }
}