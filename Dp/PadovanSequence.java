



class Solution
{

  public int padovanSequence(int n)
    {
        //code here.
        
        int[] arr  = new int[n+1];
           int m = 1000000007;
        
       
        if(n<=2) return 1;
         arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;
        for(int i=3;i<=n;i++){
            arr[i] = (arr[i-2]%m + arr[i-3]%m)%m;
        }
        
        return arr[n];
        
    
}
}
