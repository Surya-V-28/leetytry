
import java.util.HashMap;

public class SlindingWindowArrays {

    public static void longestSubarrayWithSumAtMostK(int[] nums, int k) {
        int MaxLen = 0;
        int currSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum > k) {
                currSum -= nums[left++];
            }
            MaxLen = Math.max(MaxLen, right - left + 1);

            // Update maxLength if sum equals k
            // if (sum == k) { if needed to find only excalty K  sums
            //     maxLength = Math.max(maxLength, right - left + 1);
            // }
        }

        System.out.println("the curr Maximun length of the given sum k is " + MaxLen);
    }

    // calling of these functions shlould be CountNoOfSubarrayWithSumAtMostK(nums, k) - CountNoOfSubarrayWithSumAtMostK(nums, k-1)
    //                          this will give if k=3, 3,2,1     - this will give if k=3 , 2,1 there for sum of this will give k =3
    public static void CountNoOfSubarrayWithSumAtMostK(int nums[], int goal) {

        int count = 0;
        int currSum = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            // condiiton for checking no of elements sums 
            while (currSum > goal) {
                currSum -= nums[left++];
            }

            // here the count is different bcoz we are caculating the number sub arrays can be formed under the goal
            // if k = 3, 3,2, 1 all values sum less then K are added here 
            count += right - left + 1;

        }

        System.out.println("the Count of the Subarrays upto K sums is " + count);

    }

    public static void minSubarrayWithSumAtLeastK(int nums[], int goal) {
        int minLen = Integer.MAX_VALUE;
        int ans = 0, left = 0;
        int currSum = 0;
        for (int right = 0; right < nums.length; right++) {
            currSum += nums[right];

            while (currSum >= goal) {
                minLen = Math.min(minLen, right - left + 1);
                currSum -= nums[left++];

            }
        }

        System.out.println("minSubarrayWithSumAtLeastK is " + minLen);
    }

    public static void longestSubstringWithKDistinct(int[] nums, int k) {
        HashMap<Character, Integer> hash = new HashMap<>();
        int maxLen = 0;
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            char ch = (char) nums[right];
            hash.put(ch, hash.getOrDefault(ch, 0) + 1);

            while (hash.size() > k) {
                char CharLeft = (char) nums[left];
                hash.put(CharLeft, hash.getOrDefault(CharLeft, 0) - 1);
                if (hash.get(CharLeft) == 0) {
                    hash.remove(CharLeft);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);

        }

        System.out.println("longestSubstringWithKDistinct is " + maxLen);
    }

    public static void CountOfSubarrayswithGiveCharacters(String s, int noofCharacter) {
        int[] count = {-1, -1, -1};  // considering the noofCharacter is there
        int total = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            count[s.charAt(right) - 'a']++;

            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                total += s.length() - right; // important condition to note here, check video if neededs or draw in notes
                count[s.charAt(left) - 'a']--;
                left++;
            }
        }
        System.out.println(" the answer for the count of valid String with give Character to be allowed " + total);

    }

    public static void main(String args[]) {
        System.out.println(" Working on the answers");
        // we can have four patterns basically 
        // 1. finding the maximun length of the subarray with a given Sum <=K
        // 2. Finding the count of the Subarrays with given Sum = k
        // 3. Find the Longest Subarray size with given distant characters in it;

    

    /// Number of Substrings Containing All Three Characters or the give characters in Strings

    }


    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private long atLeastK(String word, int k) {
        int n = word.length();
        long ans = 0;
        int consonants = 0;
        int left = 0;
        HashMap<Character, Integer> vowelMap = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char c = word.charAt(right);
            if (isVowel(c)) {
                vowelMap.put(c, vowelMap.getOrDefault(c, 0) + 1);
            } else {
                consonants++;
            }

            while (vowelMap.size() == 5 && consonants >= k) {
                ans += n - right;
                char leftChar = word.charAt(left);
                if (isVowel(leftChar)) {
                    vowelMap.put(leftChar, vowelMap.get(leftChar) - 1);
                    if (vowelMap.get(leftChar) == 0) {
                        vowelMap.remove(leftChar);
                    }
                } else {
                    consonants--;
                }
                left++;
            }
        }
        return ans;
    }

    public long countOfSubstrings(String word, int k) {
        return atLeastK(word, k) - atLeastK(word, k + 1);
    }
}
