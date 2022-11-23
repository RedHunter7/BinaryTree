package tugas2;
import tugas2.BinaryTree;

public class Main {
	public static void main(String[] args) {
        BinaryTree x = new BinaryTree();
        x.insertTree(30);
        x.insertTree(2);
        x.insertTree(4);
        x.insertTree(1);
        x.insertTree(3);
        // x.delete();
        System.out.println(x.getMinimum().data);
        System.out.println(x.find(3).data);
    }
}
