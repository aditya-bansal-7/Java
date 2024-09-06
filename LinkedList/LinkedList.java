package LinkedList;
/**
 * LinkedList
 */
public class LinkedList {

    public Node head;
    public Node tail;
    public int size = 0;

    /**
     * Node
     */
    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (tail == null) {
            head = tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void add(int data, int index) {
        if (index == 0) {
            add(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node newNode = new Node(data, temp.next);
        temp.next = newNode;

    }

    public int deleteFirst() {
        int val = head.data;

        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {

        if (size <= 1) {
            return deleteFirst();
        }
        int val;

        Node node = get(size - 2);

        val = tail.data;

        tail = node;
        tail.next = null;

        size--;
        return val;

    }

    public int delete(int index) {

        if (index == 0) {
            return deleteFirst();
        }
        if (index == size -1) {
            return deleteLast();
        }

        Node temp = get(index -1);

        int val = temp.next.data;

        temp.next = temp.next.next;
        
        return val;

    }

    public Node find(int data){

        Node temp = head;

        while (temp != null) {
            if (temp.data == data) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public Node get(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(3);
        ll.add(4);
        ll.add(19);
        ll.add(39);
        ll.add(29, 0);
        ll.addLast(0);
        ll.display();

    }
}
