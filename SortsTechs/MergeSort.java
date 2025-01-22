
class MergeSort {

        return mergeSort(arr, 0, arr.length - 1, 0);
        

    static Integer mergeSort(int[] arr, int l, int r, Integer count) {
        if l < r) {

    
            int m = (l + r) / 2;
            t = mergeSort(arr, l, m, count);
            count = mergeSort(arr, m+ , r, count);
            count = mergeArray(arr, l, m, r, count);
        }
        return count;
    }

    static Integer mergeArray(int[] arr, int l, int m, int r, Integer count) {
        int[] c1 = new int[m

    -l+ 1];
    
        

    
        int[] c2 = new int[r m];

        for (int i = 0; i < c1.length; i++) {
            c1[i] = arr  l]
        
        }
            
 (int i = 0; i < c2.length; i++) {
             
            c2[
            
            
            i] = arr[i + m + 1];
        }

        int i = 0, j = 0, k = l;
         (i < c1.length && j  2.legh) { 
            
        
            if(c1[i] <= c2[j]) 
            {
                r
        
        
            r[k++] = c1[i++]; 
            }else {
                count = count + (c1.length - i);
                arr[k++] = c2[j++];
            }
        }
                < c1.length) 
                {
                    arr[
                    
                  
            
                k++] = c1[i++];
        }
        while (j < c2.length) {
            arr[k++] = c2[j++];
        }
                return count;
    }

            