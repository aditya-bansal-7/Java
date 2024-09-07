import org.w3c.dom.Node;

public class RemoveDuplicates {
    Node removeDuplicates(Node head) {
        
        Node temp = head;
        // your code here
        while(temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }
}
