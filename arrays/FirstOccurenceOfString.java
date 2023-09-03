

public class FirstOccurenceOfString {
    public static void main(String[] args) {
        String GiveInputs = "abw",compareInputs= "w";
        int i=0,j1  =0;
        
        boolean check = false;

        // for(i=0;i<GiveInputs.length()-1;i++){
        //     while( compareInputs.charAt(j1) ==GiveInputs.charAt(i) && j1 != compareInputs.length()){
        //         System.out.println("This is invertal components   " + j1+ " this is J1  " + i + "  this is I value");
        //         System.out.println("The lettter in give  " + GiveInputs.charAt(i) +" Is Compared With " + compareInputs.charAt(j1));
        //         i++;
        //         j1++;
        //         if(j1==compareInputs.length() && j1==j1-1){
        //             check = true;
        //             break;
        //         }
        //     }
    
       while(i!=compareInputs.length()) {
        if(compareInputs.length() ==1 && GiveInputs.length() ==1 && compareInputs == GiveInputs){
            check=true;
            break;
        }
        else{
        for(int j=0;j<GiveInputs.length()-1;j++){
            if(compareInputs.charAt(i) == GiveInputs.charAt(j)&& i!=compareInputs.length()){
                i++;
                check = true;
                if(i==compareInputs.length()){
                  break;
                }
            }
            else {
                i=0;
                check=false;
            }
        }
}
        if(check==false){
            break;
        }
       }
       if(check){
        System.out.println("Corrects");
       }
       else {
        System.out.println("Wrong");
       }
    }
}
