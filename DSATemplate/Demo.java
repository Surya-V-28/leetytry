


public class Demo {
    public static void main(String args[]) {
        System.out.println("Working won");
        Linked linkeds = new Linked();
        linkeds.addBeginNode(7);
        linkeds.addBeginNode(9);
        linkeds.addBeginNode(2);
        linkeds.addBeginNode(17); 
        linkeds.addBeginNode(2);
        linkeds.display();
        linkeds.removeNodeatPos(2);
        System.out.println("work new line");
        linkeds.display();
    }
}