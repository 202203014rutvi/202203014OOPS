import java.util.*;

class LinkedL
{
  Node h;

  class Node
  {
    int d;
    Node n;

      Node (int x)
    {
      d = x;
      n = null;
    }
  }
  public void sn (int d)
  {
    Node current = h;
    int i = 1;
    int flag = 0;


    if (h == null)
      {
System.out.println ("List is empty");
      }
    else
      {
while (current != null)
 {
   if (current.d == d)
     {
flag = 1;
break;
     }
   i++;
   current = current.n;
 }
      }
    if (flag==1)
      System.out.println ("Element is present in the list at the position : " + i);
    else
      System.out.println ("Element is not present in the list");
  }

   public void ie(int d){

        Node newNode = new Node(d);

        if(h == null){
            h = newNode;
            return;
        }

        Node a = h;

        while(a.n != null){
            a = a.n;
        }
        a.n = newNode;
    }
}
public class Main
{
  public static void main (String args[])
  {
    LinkedL ll = new LinkedL();

      ll.ie(1);
      ll.ie (5);
      ll.ie(7);
      ll.ie(3);
      ll.ie(8);
      ll.ie(2);
      ll.ie(3);
      ll.sn(5);
  }
}
