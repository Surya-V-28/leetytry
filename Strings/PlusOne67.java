



import java.util.*;

public class PlusOne67 {
    public static void main(String args[]){
        int[] num = {9,9,9,1,9,1,9};
        PlusOneHelper.GoodMethod(num);
        
    }
}


class PlusOneHelper {
    static void ownMethod(int[] num) {
        int[] fakestore = new int[num.length+1];
        int count = 0;
        for(int i=num.length-1;i>=0;i--){
            System.out.println(i+" Loop ");
            int current=i;
            if(num[i]==9){
            num[i] = 0;
            count++;
            }
            if(count==num.length){
                for(int j=0;j<fakestore.length;j++){
                  if(j==0){
                      fakestore[j] = 1;
                      continue;
                  }
                  fakestore[j] = num[j-1];
                }
                StringHelper.arrayPrinter(fakestore);
                break;
            }
            if(num[i]!=9){
                System.out.println(" the ith "+ i);
                num[current] = num[current]+1;
                break;
            }
        }
        StringHelper.arrayPrinter(num);

    }

    static void GoodMethod(int[] num){
        int i = num.length-2;
         num[num.length-1]++;
         int carry  = num[num.length-1]/10;
         num[num.length-1] = num[num.length-1]%10;


         while(carry==1&& i>=0){
            num[i]++;
            carry  = num[i]/10;
            num[i] = num[i]%10;
            i--;
         }

         if(carry==1){
            int[] newDigits = new int[num.length+1];
            newDigits[0] =1;
            StringHelper.arrayPrinter(newDigits);
        }
        StringHelper.arrayPrinter(num);
    }
}