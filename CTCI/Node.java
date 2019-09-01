import java.util.*;
import java.lang.*;

public class Node
{
    Node next;
    int item;

    public Node(int item, Node next) 
    {
        this.item = item;
        this.next = next;
    }
}