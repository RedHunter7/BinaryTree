package tugas2;
import tugas2.BinaryTree;

public class Main {
	public static void main(String[] args) {
        BinaryTree x = new BinaryTree(20);
        // x.insertTree(30);
        x.insertTree(2);
        x.insertTree(1);
        x.delete(1);
        System.out.println(x.getMinimum().data);
        System.out.println(x.find(20).data);
    }
}
