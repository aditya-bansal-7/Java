public class DoubleLinkedList {

    Node head;
    Node tail;

    int size = 0;

    public class Node {
        int data;
        Node next;
        Node pre;
        public Node(int data){
            this.data = data;
            this.next = null;
            this.pre = null;
        }

        public Node(int data , Node next, Node pre){
            this.data = data;
            this.next = next;
            this.pre = pre;
        }
        
    }
    
    public void insertFirst(int data){

        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        
        newNode.next = head;
        head.pre = newNode;
        head = newNode;
        size++;
        
    }
    public void insertLast(int data){
        if (tail == null) {
            insertFirst(data);
            return;
        }

        Node newNode = new Node(data);

        newNode.pre = tail;
        tail.next = newNode;
        tail = newNode;
        size++;

    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void displayRev() {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.pre;
        }
        System.out.println("START");
    }

    public Node find(int val){

        Node temp = head;

        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int data, int after){
        
        
        Node node = find(after);

        if (node == null) {
            System.out.println("does not exist");
            return;
        }

        Node newNode = new Node(data);

        newNode.next = node.next;

        newNode.pre = node;

        if (node.next != null) {
            node.next.pre = newNode;
        }
        
        node.next = newNode;

        
        
    }

    public static void main(String[] args) {
        DoubleLinkedList DLL = new DoubleLinkedList();

        DLL.insertFirst(10);
        DLL.insertFirst(30);
        DLL.insertFirst(440);
        DLL.insertLast(1);
        DLL.insertFirst(120);
        DLL.displayRev();
    }
}
