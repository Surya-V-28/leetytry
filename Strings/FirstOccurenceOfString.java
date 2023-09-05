

public class FirstOccurenceOfString {
    public static void main(String[] args) {
        String intput = "mississippi",compare= "issipi";
       
    
    }
}


class FirstOccurenceOfStringWays  {
    static void myOwnMethod(String intput,String compare) {
        boolean check = false;
        for(int i=0;i<intput.length()-compare.length()+1;i++){
            if(intput.charAt(i) ==compare.charAt(0)){
                int count =0;
                 for(int j=0;j<compare.length();j++){
                    if(intput.charAt(i+j)==compare.charAt(j) &&i+j<intput.length()-1){
                        System.out.println(i);
                        count++;
                    }
                    if(count ==compare.length()) {
                        System.out.println(i);
                        break;
                    }
                 }
            }
            
        }

    }

    static void subStringMethod(String intput, String compare){
        if(intput.length()<compare.length()){
            System.out.println("-1");
        }
        if(intput.equals(compare)){
            System.out.println("0");
        }

        for(int i=0;i<intput.length()-compare.length();i++){
            if(intput.substring(i,i+compare.length()).equals(compare)){
                System.out.println(i);
            }
        }
        System.out.println("False");

    }
}
