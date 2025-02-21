/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {

    public TreeNode root1;

    public FindElements(TreeNode root) {
        root1 = root;
        addValue(root,0);
    }

    public void addValue(TreeNode r, int val){
        if(r == null){
            return;
        }
        r.val = val;
        addValue(r.left , 2*val + 1);
        addValue(r.right, 2*val + 2);
    }
    
    public boolean find(int target) {
        TreeNode temp = root1;

        return isFind(temp,target);
    }

    public boolean isFind(TreeNode temp , int target){
        if(temp == null){
            return false;
        }
        if(temp.val == target){
            return true;
        }

        return (isFind(temp.left,target) || isFind(temp.right,target));
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */