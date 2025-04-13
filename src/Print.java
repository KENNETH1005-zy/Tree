public class Print {
    public static <T> void displayTree(TreeNode<T> node) {
        if (node == null) return;
        displayTreeHelper(node, "", true);
    }

    private static <T> void displayTreeHelper(TreeNode<T> node, String prefix, boolean isTail) {
        if (node == null) return;
        System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);

        if (node.left != null || node.right != null) {
            if (node.right != null)
                displayTreeHelper(node.right, prefix + (isTail ? "    " : "│   "), node.left == null);
            if (node.left != null)
                displayTreeHelper(node.left, prefix + (isTail ? "    " : "│   "), true);
        }
    }
}