import java.util.HashSet;

public class NodeNoWrapper {
    NodeNoWrapper next = null;
    int data;

    public NodeNoWrapper(int d) {
        data = d;
    }

    void appendToTail(int d) {
        NodeNoWrapper end = new NodeNoWrapper(d);
        NodeNoWrapper n = this; //reference to the head i.e first node in linkedlist
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    // Linked Lists - Question 1
    void removeDuplicates() {
        HashSet<Integer> set = new HashSet();
        NodeNoWrapper n = this;
        while(n.next != null) {
            set.add(n.data);
            if(set.contains(n.next.data)) {
                n.next = n.next.next; 
            }
            n = n.next;
        }
        
    }

    // Question 2
    void KthToLast(int kth) {
        NodeNoWrapper n = this;
        while(n != null) {
            kth--;
            if(kth <= 0) {
                System.out.println(n.data);
            }
            n = n.next;
        }
    }

    public static void main(String [] args) {
        NodeNoWrapper head = new NodeNoWrapper(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(2);
        head.appendToTail(4);
        head.removeDuplicates();
        head.KthToLast(3);
        
    }
}

// note:
// seen as the linkedlist gets accessed by the reference it has to the head (Node n = this)
// what if multiple other objects need a reference to the linked list and the head changes.
// this will lead to multiple objects pointing to the old head of the linked list. 
// A way to solve this problem is to have a data structure wrapper class which stores the head as a variable.
// this class will generally be named LinkedList and will be a wrapper for the nodes.