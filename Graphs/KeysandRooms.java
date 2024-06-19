
import java.util.*;

public class KeysandRooms {
    public static void main(String[] args){
        System.out.println("Working");
        //  List<List<Integer>> rooms = Arrays.asList(
        //     Arrays.asList(1, 3),
        //     Arrays.asList(3, 0, 1),
        //     Arrays.asList(2),
        //     Arrays.asList(0)
        // );
        List<List<Integer>> rooms = Arrays.asList(
            Arrays.asList(1),
            Arrays.asList(1)
            Arrays.asList(3),
            Arrays.asList()
        );
        HashMap<Integer,Integer> hash = new HashMap<>();
        int i1=0,j=0;
        int roomsize = rooms.size();
        int checker = 1;
        while(i1<rooms.get(0).size()){
            hash.put(rooms.get(0).get(i1),hash.getOrDefault(rooms.get(0).get(i1),0)+1);
            i1++;
        }
        for(int i =1;i<rooms.size();i++){
            checker++;
            if(hash.containsKey(i)){
                 j=0;
                while(j<rooms.get(i).size()){
                    hash.put(rooms.get(i).get(j),hash.getOrDefault(rooms.get(i).get(j),0)+1);
                    j++;
                }
            }
            if(rooms.get(i).size()==0){
                roomsize--;
                checker--;
            }
        }
        if(hash.size()==checker){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }

        System.out.println(hash);
        System.out.println(rooms);

    }
}