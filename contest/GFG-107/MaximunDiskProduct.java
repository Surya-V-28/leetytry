



// Disk Placement

// You are given n disks and your task is to split them between two stands or towers such that the product of the number of disks in each tower is maximized. Formally, if the first tower contains a disks and the second tower contains b disks, you need to maximize the product a *b, where a + b = n.
// Example 1:
// Input:
// n=7
// Output:
// 12
// Explanation:
// It can be shown that placing 3 disks in the first stand and the remaining 4 disks in the second stand will maximize the product a*b=3*4=12.


class Solution {
    public static long maxProduct(int n) {
        // code here
        long ans;
        if(n%2==1){
          long a = (long)(n + 1) / 2;
            long b = (long)(n - 1) / 2;
            ans = a * b;
        } else {
            long a = (long)(n + 1) / 2;
            ans = a*a;
            
        }
        return ans;
    }
}
