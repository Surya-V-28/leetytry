
import java.util.*;

class Solution {

    public int[] getFloorAndCeil(int x, int[] arr) {
        // Sort the array first
        Arrays.sort(arr);

        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1; // Initialize floor and ceil

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                // If the exact value is found, floor and ceil are the same
                return new int[]{x, x};
            } else if (arr[mid] < x) {
                // Update floor and move the search to the right
                floor = arr[mid];
                low = mid + 1;
            } else {
                // Update ceil and move the search to the left
                ceil = arr[mid];
                high = mid - 1;
            }
        }

        return new int[]{floor, ceil}; // Return the final floor and ceil
    }

}
