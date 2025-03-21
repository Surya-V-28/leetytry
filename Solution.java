
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        // code here
        int right = arr.length - 1;
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        for (right = arr.length - 1; right > 0; right--) {
            q.add(arr[right]);
            if (!(arr[right - 1] > arr[right])) {
                right--;
                break;
            }
        }
        System.out.println(arr[right]);
        if (right == 0) {
            Arrays.sort(arr);
        }
        q.add(arr[right]);
        int currSwiftEle = arr[right];
        int rightMove = right + 1;
        int foundElement = Integer.MAX_VALUE;
        while (rightMove < arr.length) {
            if (currSwiftEle < arr[rightMove]) {
                foundElement = Math.min(foundElement, arr[rightMove]);
            }
            rightMove++;
        }

        System.out.println(foundElement);
        int val = arr.length - 1;
        System.out.println(q);
        while (!q.isEmpty()) {
            if (q.peek() != foundElement) {
                arr[val--] = q.peek();
            }
            q.poll();
        }
        arr[right] = foundElement;
        for (int i : arr) {
            System.out.print(i + " , ");
        }
    }
}
