


public class SelectionSort {
    public static void main(String args[]){
        System.out.println("Working");
        int[] arrs = {5, 3, 8, 6, 2};
        // this sort is not stable and its best and worst is always the O(N) and O(N^2)

        for(int i=0;i<arrs.length-1;i++){
            // swaping the first elemeent with other elemenets if we find anything min then that 
            int min =i;
            for(int j=i+1;j<arrs.length;j++){
                if(arrs[j]<arrs[min]){
                    min=j;
                }
            }
            int temp = arrs[i];
            arrs[i]= arrs[min];
            arrs[min] = temp;
        }

        for(int i=0;i<arrs.length;i++){
            System.out.print(arrs[i] + " , ");
        }

        }
}