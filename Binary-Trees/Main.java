public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        // tree.swapRoot();
        // System.out.println(tree.isBinarySearchTree());
        // System.out.println(tree.getNodesAtDistance(2));
        tree.traverseLevelOrder();
        // Tree tree2 = new Tree();
        // tree2.insert(7);
        // tree2.insert(4);
        // tree2.insert(9);
        // tree2.insert(1);
        // tree2.insert(6);
        // tree2.insert(8);
        // tree2.insert(10);
        // System.out.println(tree.equals(tree2));
        // System.out.println(tree.find(11));
        // tree.traversePreOrder();
        // tree.traverseInOrder();
        // System.out.println(tree.height());
        // System.out.println(tree.min());

        /*
         * 4! = 4 * 3!
         * n! = n * (n - 1)!
         */
        // System.out.println(factorial(5));
    }

    public static int factorial(int n) {
        // Base condition
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }
}