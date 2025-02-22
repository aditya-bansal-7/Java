class Solution {
    private int index = 0;

    public TreeNode recoverFromPreorder(String traversal) {
        return helper(traversal, 0);
    }

    private TreeNode helper(String traversal, int depth) {
        int curDepth = 0;
        
        while (index < traversal.length() && traversal.charAt(index) == '-') {
            curDepth++;
            index++;
        }
        
        if (curDepth != depth) {
            index -= curDepth;
            return null;
        }

        int value = 0;
        while (index < traversal.length() && Character.isDigit(traversal.charAt(index))) {
            value = value * 10 + (traversal.charAt(index) - '0');
            index++;
        }

        TreeNode node = new TreeNode(value);

        node.left = helper(traversal, depth + 1);
        node.right = helper(traversal, depth + 1);

        return node;
    }
}
