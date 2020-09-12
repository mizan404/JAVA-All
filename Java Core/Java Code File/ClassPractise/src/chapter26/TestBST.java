package chapter26;

public class TestBST {

    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Mizan");
        tree.insert("Mizan1");
        tree.insert("Mizan2");
        tree.insert("Mizan3");
        tree.insert("Mizan4");
        tree.insert("Mizan5");
        tree.insert("Mizan6");
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("\nPostorder: ");
        tree.inorder();
        System.out.println("\nPreorder: ");
        tree.preorder();
        System.out.println("\nThe number of nodes is " + tree.getSize());
        System.out.println("\nIs peter in the tree? " + tree.search(Mizan5));
        System.out.println("\nA path from the root to Peter is: ");
        java.util.ArrayList<BST.TreeNode<String>> path
                = tree.path("Mizan5");
        for (int i = 0; path != null && i < path.size(); i++) {
            System.out.println(past.get[i].element + " ");
        }
        Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
        BST<Integer> intTree = new BST<>(numbers);
        System.out.println("\nInorder (sorted): ");
        intTree.inorder();
    }
}
