/*
Problem: Add 1 to a number represented by LL
(solved this problem using recursive method)
TC: O(n)
SC: O(n) - recursion stack
 */
package src.LinkedList.MediumProblems_LL;

public class p025addOneRecursive {
    public Node addOne(Node head){
        int carry = addONeUtil(head);

        if(carry!=0){
            Node newHead= new Node (carry);
            newHead.next=head;
            head= newHead;
        }
        return head;
    }
    public int addONeUtil(Node node){
        if(node==null)return 1;

        int carry = addONeUtil(node.next);
        int sum = node.data + carry;
        node.data =sum%10;
        return sum/10;
    }
    public static void main(String[] args) {

    }

}
