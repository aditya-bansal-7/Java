/**
 * BST
 */
class BST {

    public class Node {
        private int val;
        private Node left;
        private Node right;
        private int height;

        public Node (int val){
            this.val = val;
        }

        public int getValue() {
            return val;
        }
    }

    private Node root;

    public BST() {

    }

    public int height(Node node){
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void insert(int val ){
        root = insert(val,root);
    }

    private Node insert(int val , Node node){
        if (node == null) {
            Node newNode = new Node(val);
            return newNode;
        }

        if (node.val > val) {
            node.left = insert(val, node.left);
        }
        if (node.val < val) {
            node.right = insert(val, node.right);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balance(){
        return balance(root);
    }

    private boolean balance(Node node){
        if (node == null) {
            return true;
        }
        return (Math.abs(height(node.left) - height(node.right)) <= 1 && balance(node.left) && balance(node.right));
    }


    public void populate(int[] nums){
        for(int num : nums){
            insert(num);
        }
    }

    public void display() {
        display(root,0);
    }

    private void display(Node node,int level){
        if (node == null) {
            return;
        }

        display(node.right , level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        }else{
            System.out.println(node.val);
        }

        display(node.left, level + 1);
    }
    
}