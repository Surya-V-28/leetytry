
// import java.util.Arrays;
// import java.util.*;

class arrayIndexFind {
    public static void main(String[] args) {
        // int[] nums = new int[5];
        // int i;
        // //int target = 9;
        // nums[0] = 2;
        // nums[1] = 7;
        // nums[2] = 11;
        // nums[3] = 15;
        // // int[] result = new int[2];
        int x = 121;
        System.out.print("Working");
        int numbers = 121, output = 0;
        if (x <= -1) {
            System.out.println("Error");
        } else {

            System.out.println("ELSE LOOP ");
            while (numbers != 0) {
                int remainder = numbers % 10;
                output = output * 10 + remainder;
                numbers = numbers / 10;

            }
            if (x == 121) {
                System.out.println("Correct Answer");

            }
        }
    }
}