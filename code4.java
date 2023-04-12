import java.util.*;

class Node
{
    int d;
    Node n;

    Node(int d)
    {
        this.d = d;
        this.n = null;
    }
}


class LinkedList {

    Node h;

    public void ie(int d){

        Node n1 = new Node(d);

        if(h == null){
            h = n1;
            return;
        }

        Node iterate = h;

        while(iterate.n != null){
            iterate = iterate.n;
        }
        iterate.n = n1;
    }

    public void printll(){

        if(h == null){
            System.out.println("List is empty");
            return;
        }

        Node iterate = h;
        while(iterate != null){
            System.out.print(iterate.d + " -> ");
            iterate =iterate.n;
        }
        System.out.println("NULL");

    }

}

public class q4 {
    
    public static void main(String args[]) {
        
    LinkedList list = new LinkedList();
    Random rd = new Random();
    
    for(int i=0; i<100; i++) {
        list.ie(rd.nextInt(51));
    }
    
    System.out.println("A Linked List of size 100 with range 1-50 is generated");
    list.printll();
    
    Node a = list.h;
    Node b = null;
    
    while(a != null) 
    {
        
        if(a.d > 25) 
        {
            
            if(b == null) 
            {
                list.h = list.h.n;
                a = list.h;
            }
            
            else 
            {
                b.n = a.n;
                a = a.n;
            }
        }
        
        else 
        {
            b = a;
            a = a.n;
        }
        
    }
    System.out.println("Linked list after deletion of all nodes over 25.");
    list.printll();
    }
}