

public class DataoScen {
    public static void main(String args[]) {


        System.out.println("Wokring");
        senate = "RD";
        Queue<Character> radiant = new LinkedList<Character>();
        Queue<Character> dire = new LinkedList<Character>();


        for(int i=0;i<senate.length();i++){
            if(senate.charAt(i)=='R') {
             radiant.add(senate.charAt(i));
            }
            else{
                dire.add(senate.charAt(i));
            }
        }
        while(!radiant.isEmpty() && !dire.isEmpty()) {
            
        }
    }
}