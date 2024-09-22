

// Maximum Sum
// You are given an array arr of integers, where n is the length of the array. Your task is to find the maximum sum of two distinct numbers from the array such that for a given bit position x.
// the x-th bit of one number is set (i.e., equals 1), and the x-th bit of the other number is unset (i.e., equals 0).
// If no such pair of distinct numbers exists, where one has the x-th bit set and the other has the x-th bit unset, return -1.
// Example 1:
// Input:  n=5
// arr[]={1,5,9,23,12}
// x=3
// Output:
// 32
// Explanation:
// 9(1001) and 23(10111) yields the maximum sum.



class Solution {
    public static long maxSum(int n, int x, int[] arr) {
        // code here
        ArrayList<Integer> set = new ArrayList<>();
        ArrayList<Integer> unset = new ArrayList<>();
        for(int num :arr){
            int mask = 1 << (x-1);
            if((num & mask)!=0) {
                set.add(num);
            } else {
                unset.add(num);
            }
        }
        if(set.size()==0 || unset.size()==0) return -1;
        Collections.sort(set);
        Collections.sort(unset);
        return set.get(set.size()-1) + unset.get(unset.size()-1);
    }
}
