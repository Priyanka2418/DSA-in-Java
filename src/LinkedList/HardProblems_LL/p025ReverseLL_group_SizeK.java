/*
Problem : Reverse Linked List in groups of Size K
SC: O(N),We visit each node exactly once during reversal and during group detection
TC:  O(1),The algorithm uses a constant amount of extra memory for pointers and dummy node.
 */
package src.LinkedList.HardProblems_LL;
class  Node {
    int data;
    Node next;

    Node(int val){
        val = data;
        next = null;
    }
}
public class p025ReverseLL_group_SizeK {
    public Node reverseInGroupSizeK(Node head , int k){
        Node dummy = new Node(0);
        dummy.next = head;

        Node prevGroup  =dummy;

        while (true){
            Node kth = getKthNode(prevGroup , k);
            if(kth==null)break;

            Node nextGroup = kth.next;

            Node prev = nextGroup;
            Node curr = prevGroup.next;

            for(int i =0;i<k;i++){
                Node temp = curr.next;
                curr.next= prev;
                prev = curr;
                curr= temp;
            }

            Node temp  = prevGroup.next;
            prevGroup.next = kth;
            prevGroup = temp;
        }
        return dummy.next;
    }
    private Node getKthNode(Node curr , int k ){
        while (curr!=null && k>0){
            curr=curr.next;
            k--;
        }
        return curr;
    }
    public static void main(String[] args) {

    }
}
