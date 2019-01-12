package algorithm2;

import java.util.LinkedList;

public class Algorithm2 {

    LinkedList<BinaryTree> fifo = new LinkedList<BinaryTree>();
    private int value = 0;


    public Algorithm2(BinaryTree binaryTree) {
        fifo.add(binaryTree);
    }

    public Integer sumTree() {
        while (!fifo.isEmpty()) {
            BinaryTree tree = fifo.removeFirst();
            value = value + tree.valor;

            if (tree.left != null)
                fifo.add(tree.left);
            if (tree.right != null)
                fifo.add(tree.right);
        }


        return value;
    }


}
