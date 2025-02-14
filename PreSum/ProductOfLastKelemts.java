
class ProductOfNumbers {

    int[] zeros;
    long[] prodArr;
    int counter;

    public ProductOfNumbers() {
        zeros = new int[100000];
        prodArr = new long[100000];
        prodArr[0] = 1;
        counter = 0;
    }

    public void add(int num) {
        if (num == 0) {
            prodArr[counter + 1] = 1;
            zeros[counter + 1] = zeros[counter] + 1;
        } else {
            prodArr[counter + 1] = prodArr[counter] * num;
            zeros[counter + 1] = zeros[counter];
        }
        counter++;
    }

    public int getProduct(int k) {
        if (k > counter || zeros[counter] != zeros[counter - k]) {
            return 0;
        }
        return (int) (prodArr[counter] / prodArr[counter - k]);
    }

    void printing() {
        System.out.println("current Arrays");
        for (int i = 0; i < counter; i++) {
            System.err.print(prodArr[i] + " , ");
        }
        System.out.println("");
    }
}

public class ProductOfLastKelemts {

    public static void main(String args[]) {
        ProductOfNumbers obj = new ProductOfNumbers();
        obj.add(3);
        obj.add(4);
        obj.add(5);
        obj.add(2);
        obj.add(6);
        obj.printing();
        int param1 = obj.getProduct(2);
        System.out.println(param1);

        int param2 = obj.getProduct(3);
        System.out.println(param2);

        int param3 = obj.getProduct(4);
        System.out.println(param3);
    }

}
