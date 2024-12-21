
import java.util.Scanner;

public class ClassWork {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = sc.nextLine();
        String backWord = "";
        String preWord = "";

        int slashCounter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '_') {
                slashCounter++;
            } else {
                backWord += input.charAt(i) + "";
            }
        }
        for (int i = 0; i < slashCounter; i++) {
            preWord += '_' + "";
        }
        System.out.println(preWord + backWord);
    }
}
