/*
Problem : Find the Length of the Loop
TC: O(N), we traverse the entire linked list atleast once to find the length of the loop.
SC:  O(1)
 */
package src.LinkedList.MediumProblems_DLL;

public class p013Length_loop_LL {
    public static int loopLength(Node head){
        Node slow =  head;
        Node fast=  head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return countLoopLength(slow);
            }
        }
        return 0;
    }
    public static int countLoopLength(Node meetingPoint){
        Node temp  = meetingPoint;
        int count=1;
        while(temp.next!=meetingPoint){
            temp = temp.next;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);
        Node fifth = new Node(5);


        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;


        fifth.next = second;



        int loopLength = loopLength(head);

        // Printing the result
        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
