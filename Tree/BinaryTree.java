import java.util.Scanner;

class BinaryTree {

    public BinaryTree() {


    }

    private static class Node {
        private int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
    }

    private Node root;

    // insert elements


    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node , int level){
        if (node == null) {
            return;
        }

        prettyDisplay(node.right , level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        }else{
            System.out.println(node.val);
        }

        prettyDisplay(node.left, level + 1);
    }

    public void populate(Scanner sc){
        System.out.println("Enter the root Node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc,root);
    }
    private void populate(Scanner sc, Node node){
        System.out.println("Do you want to enter left of " + node.val);
        boolean left = sc.nextBoolean();
        if(left) {
            System.out.println("Enter the value of the left of " + node.val);
            int val = sc.nextInt();
            node.left = new Node(val);
            populate(sc,node.left);
        }
        System.out.println("Do you want to enter right of " + node.val);
        boolean right = sc.nextBoolean();
        if(right) {
            System.out.println("Enter the value of the right of " + node.val);
            int val = sc.nextInt();
            node.right = new Node(val);
            populate(sc,node.right);

        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        Scanner sc = new Scanner(System.in);
        tree.populate(sc);
        tree.prettyDisplay();

        
    }
}