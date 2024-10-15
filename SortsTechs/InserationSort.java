

public class InserationSort {
    public static void main(String arg[]){
        System.out.println("Working");
        int[] arrs = {5, 3, 8, 6, 2};

       // first loop to run through all the elements in the arrays 
       for(int i=1;i<arrs.length;i++){
        // take the element x which needs to placed at the right position after the  ilteration
        int x = arrs[i];
        // now set the J to i so that we will check the values form the right j to left till j=0;
        int j=i;
        //  run a loop to compare wheather is that x is smaller than any elements in previous of it

        while( j>0 && arrs[j-1]>x ){
            //if so make a copy of the elements in right is of it like this a = [5, 5, 8, 6, 2]
            arrs[j]=arrs[j-1];
            //decerment the J values
            j--;
        }

        // when there is no less values the update the j position with x
        arrs[j] = x; // it will ve a = [3, 5, 8, 6, 2]
       }

       for(int i=0;i<arrs.length;i++){
        System.out.print(arrs[i] + ", ");
        
       }
    }
}