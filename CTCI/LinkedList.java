import java.util.*;
import java.lang.*;

public class LinkedList 
{
    Node head;
    public LinkedList()
    {
        this.head = null;
    }

    void add(int n)
    {
        
        if(head == null)
        {
            head = new Node(n, head);
        }
        else
        {
            Node p = head;
            while(p.next != null) // p.next will equal null and p will equal last element in LL.
            {
                p = p.next;
            }
            p.next = new Node(n,null);
        }
    }

    void addSorted(int n)
    {  
        if(head == null || head.item >= n)
        {
            head = new Node(n, head);
        }  
        else
        {
            Node p = null;
            Node c = head;

            while(c != null && c.item < n)
            {
                p = c;
                c = c.next;
            }
        
            p.next = new Node(n,p.next);
        }

    }   


    boolean contains(int n)
    {
        Node p = head;
        while(p.next != null)
        {
            if(p.item == n)
            {
                return true;
            }

            p = p.next;
        }

        return false;
    }

    public static LinkedList RemoveDups(LinkedList list) {
        Hashtable table = new Hashtable();
        return list;
    }

    public static void main(String [] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        RemoveDups(list);
    }

}
