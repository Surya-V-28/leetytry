
class LeastBoundOfBinarySearch {

    public int search(int[] arr, int k) {

        int low = 0;
        int lastLow = -100;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
                lastLow = low;
            }
        }
        if (lastLow >= 0) {
            return lastLow - 1;
        }
        return -1;
    }
}
