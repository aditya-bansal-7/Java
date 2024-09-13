public class CycleLinkedLIst {
    
    public Node head;

    public Node tail;


    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        
    }

    public void insert(int data){

        Node node = new Node(data);

        if (head == null) {
            head = tail = node;
            return;
        }

        node.next = head;

        tail.next = node;

        tail = node;

    }

    public void display(){
        Node temp = head;
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        do {

            System.out.println(temp.data + "-->");
            temp = temp.next;
        } while (temp != head);

        System.out.println("Head ");
    }

    public static void main(String[] args) {
        
    }
}
