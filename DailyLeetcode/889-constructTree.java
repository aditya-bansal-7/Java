
class Solution {
    int preIndex = 0;
    HashMap<Integer, Integer> postMap = new HashMap<>();

    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        for (int i = 0; i < postorder.length; i++) {
            postMap.put(postorder[i], i);
        }
        return buildTree(preorder, postorder, 0, postorder.length - 1);
    }

    public TreeNode buildTree(int[] preorder, int[] postorder, int left, int right) {
        if (left > right || preIndex >= preorder.length) {
            return null;
        }

        TreeNode root = new TreeNode(preorder[preIndex++]);

        if (left == right) {
            return root;
        }

        int postIndex = postMap.get(preorder[preIndex]);

        root.left = buildTree(preorder, postorder, left, postIndex);
        root.right = buildTree(preorder, postorder, postIndex + 1, right - 1);

        return root;
    }
}
