package src.day10;

public class Task1 {
    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        bst.add(20);
        bst.add(14);
        bst.add(11);
        bst.add(5);
        bst.add(8);
        bst.add(16);
        bst.add(15);
        bst.add(18);
        bst.add(22);
        bst.add(23);
        bst.add(27);
        bst.add(24);
        bst.add(150);

        System.out.println("Содержимое дерева в отсортированном порядке по левым узлам");
        bst.inOrderTraversal(bst.root);
        System.out.println();


    }
}
