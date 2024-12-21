
import java.util.PriorityQueue;

public class SmallestNumberInfiniteSet {

    PriorityQueue<Integer> q = new PriorityQueue<>();

    public SmallestNumberInfiniteSet() {

        for (int i = 0; i < 1001; i++) {
            q.add(i);
        }

    }

    public int popSmallest() {
        return q.poll();
    }

    public void addBack(int num) {
        if(q.peek()>num){
        q.add(num);
        }
    }

    public static void main(String[] args) {

    }
}
