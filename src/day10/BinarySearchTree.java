package src.day10;

public class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // метод для добавления
    public void add(int value) {
        root = addRecursive(root, value);
    }

    private TreeNode addRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.value) {
            current.right = addRecursive(current.right, value);
        }
        return current;

    }

    //метод для поиска элемента
    public boolean containsNode(int value) {
        return containsNodeRecursive(root, value);
    }

    private boolean containsNodeRecursive(TreeNode current, int value) {
        if (current == null) {
            return false;
        }

        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);

    }

    // метод удаления
    public void remove(int value) {
        root = removeRecursive(root, value);
    }

    private TreeNode removeRecursive(TreeNode current, int value) {
        if (current == null) {
            return null;
        }
        if (value == current.value) {

            //узел без дочерних узлов
            if (current.left == null && current.right == null) {
                return null;
            }

            // узел в 1 дочерним
            if (current.right == null) {
                return current.left;
            }
            if (current.left == null) {
                return current.right;
            }

            // узел с двумя дочерними узлами
            int smallestValue = findSmallestValue(current.right); //ниже в методе
            current.value = smallestValue;
            current.right = removeRecursive(current.right, smallestValue);
            return current;
        }
        if (value < current.value) {
            current.left = removeRecursive(current.left, value);
            return current;
        }
        current.right = removeRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(TreeNode root) {
        return root.left == null ? root.value : findSmallestValue(root.left);

    }

    public void inOrderTraversal (TreeNode node){
        if (node != null){
            inOrderTraversal(node.left);
            System.out.println(" " + node.value);
            inOrderTraversal(node.right);

        }
    }
}


