class Node{
    char d;
    Node n;

    Node(char d){
        this.d = d;
        this.n = null;
    }
}


class Linkedl {

    Node b;

    public void insertb(char d){

        Node newNode = new Node(d);

        if(b == null)
        {
            b = newNode;
            return;
        }

        newNode.n = b;
        b = newNode;
    }


    public void ie(char d){

        Node newNode = new Node(d);

        if(b == null){
            b = newNode;
            return;
        }

        Node iterate = b;

        while(iterate.n != null){
            iterate = iterate.n;
        }
        iterate.n = newNode;
    }

    public void ii(char d, int index) {


        if (index == 1) {
            insertb(d);
            return;
        }

        Node temp = b;
        int i = 1;
        Node newNode = new Node(d);

        while (i < index - 1) {
            temp = temp.n;
            i++;
        }

        if (temp.n == null) {
            temp.n = newNode;
        }

        newNode.n = temp.n;
        temp.n = newNode;
    }


    public void db(){

        if(b == null){
            System.out.println("The list is empty");
            return;
        }
        b = b.n;
    }

    public void de(){

        if(b == null){
            System.out.println("The list is empty");
            return;
        }

        if(b.n == null){
            b = null;
            return;
        }

        Node secondLast = b;
        Node lastNode = b.n;
        while(lastNode.n != null){
            lastNode = lastNode.n;
            secondLast = secondLast.n;

        }

        secondLast.n = null;
    }

    public void di(int index) {

        if(b == null) {
            db();
            return;
        }

        Node temp = b;
        int i = 1;

        while(i != index - 1) {
            temp = temp.n;
            i++;
        }

        if(temp.n == null) {
            de();
            return;
        }

        temp.n = (temp.n).n;
    }

    public void printLinkedL(){

        if(b == null){
            System.out.println("List is empty");
            return;
        }

        Node iterate = b;
        while(iterate != null){
            System.out.print(iterate.d + " -> ");
            iterate =iterate.n;
        }
        System.out.println("NULL");

    }
}

public class Q2 {

    public static void main(String[] args) {

        Linkedl list = new Linkedl();

        list.printLinkedL();

        list.insertb('a');
        list.printLinkedL();

        list.insertb('b');
        list.printLinkedL();

        list.ie('c');
        list.printLinkedL();

        list.ii('a', 3);
        list.printLinkedL();

        list.di(2);
        list.printLinkedL();

        list.de();
        list.printLinkedL();

       
    }
}
