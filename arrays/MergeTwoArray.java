
import java.util.Iterator;
import java.util.LinkedList;

public class MergeTwoArray {
    public static void main(String[] args) {
        LinkedList<Integer> lik = new LinkedList<>();
        LinkedList<Integer> finals = new LinkedList<>();
        LinkedList<Integer> liks = new LinkedList<>();
        lik.add(1);
        lik.add(2);
        lik.add(4);
        liks.add(1);
        liks.add(3);
        liks.add(4);
        Iterator<Integer> itr1 = lik.iterator();
        Iterator<Integer> itr2 = liks.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
            if (itr1.next() < itr2.next()) {
                System.out.println("the Term" + itr1.next());
            }
            System.out.println(itr1.next());
        }

    }

}
