
import java.util.PriorityQueue;

public class TotalCostToHireKworkers {

    public static void main(String args[]) {
        System.out.println("Wokring on the answers");
        int[] costs = {17, 12, 10, 2, 7, 2, 11, 20, 8};
        int k = 3, candidates = 4;
        PriorityQueue<Integer> minHeapLeft = new PriorityQueue<>();
        PriorityQueue<Integer> minHeapRight = new PriorityQueue<>();

        // Handle scenario where candidates exceed available workers
        if (2 * candidates >= costs.length) {
            PriorityQueue<Integer> allWorkers = new PriorityQueue<>();
            for (int cost : costs) {
                allWorkers.add(cost);
            }
            long sum = 0;
            for (int i = 0; i < k; i++) {
                sum += allWorkers.poll();
            }
            System.out.println("the ansewrr is " + sum);
        }

        // Add candidates from both ends
        for (int i = 0; i < candidates; i++) {
            minHeapLeft.add(costs[i]);
            minHeapRight.add(costs[costs.length - i - 1]);
        }

        int currLeftIndex = candidates;
        int currRightIndex = costs.length - 1 - candidates;
        long sum = 0;

        for (int j = 0; j < k; j++) {
            if (minHeapRight.isEmpty() || (!minHeapLeft.isEmpty() && minHeapLeft.peek() <= minHeapRight.peek())) {
                sum += minHeapLeft.poll();
                if (currLeftIndex <= currRightIndex) {
                    minHeapLeft.add(costs[currLeftIndex++]);
                }
            } else {
                sum += minHeapRight.poll();
                if (currRightIndex >= currLeftIndex) {
                    minHeapRight.add(costs[currRightIndex--]);
                }
            }
        }

        System.out.println("the answer is " + sum);

    }
}
