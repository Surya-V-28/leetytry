
import java.util.ArrayList;

public class RatoateNumber {
    public static void main(String args[]){
       // System.out.println("Working with surya");
        String bits16 = "0000000000000000";
        int num = 28;
        int roate = 2;
        roate = roate%16;
        ArrayList<Integer> list = new ArrayList<>();
        String numcon = Integer.toBinaryString(num);
        bits16 = bits16.substring(0,bits16.length()-numcon.length()) + numcon;
        String numcona= bits16.substring(roate,bits16.length()) + bits16.substring(0,roate);
        list.add(Integer.parseInt(numcona,2));
        String nums = bits16.substring(bits16.length()-roate,bits16.length()) + bits16.substring(0,bits16.length()-roate);
        list.add(Integer.parseInt(nums,2));
        System.out.println(list);
    }
}


