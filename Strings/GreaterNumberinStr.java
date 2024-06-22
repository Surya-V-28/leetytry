

public class GreaterNumberinStr {
    public static void main(String args[]){
        System.out.println("Wolring");
       String sentence = "This is alpha 5057 and 97";
        int currMax = -1, start;
        String CurrWord ="";
        System.out.println(sentence.length());
        for(int i =0;i<sentence.length()-1;i++){
            if(Character.isDigit(sentence.charAt(i))){
                start =i;
                while(Character.isDigit(sentence.charAt(i))){
                    if(i<sentence.length()-1){
                    i++;
                    } else{
                        break;
                    }
                    System.out.println(i);   
                }
                CurrWord = sentence.substring(start,i+1);
                CurrWord = CurrWord.trim();
                int Numbers =  Integer.parseInt(CurrWord);
                System.out.println(CurrWord);
                if(!CurrWord.contains("9")){
                    currMax = Math.max(Numbers,currMax);
                }
                System.out.println(currMax);
                
            }
        }
        System.out.println(currMax);
    }
}