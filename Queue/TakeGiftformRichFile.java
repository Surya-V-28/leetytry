
import java.util.Comparator;
import java.util.PriorityQueue;

public class TakeGiftformRichFile {

    public static void main(String[] args) {
        System.out.print("Working");
        int[] gifts = {25, 64, 9, 4, 100};
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int k = 4;
        for (int i = 0; i < gifts.length; i++) {
            pq.add(gifts[i]);
        }

        while (k > 0) {
            int ans = (int) Math.sqrt(pq.poll());
            pq.add(ans);
            k--;
        }
        int result = 0;
        while (!pq.isEmpty()) {
            result += pq.poll();
        }
        System.out.println(" the answer is " + result);
    }
}
