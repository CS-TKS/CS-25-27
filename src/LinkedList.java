public class LinkedList {
    private class Node{
        int data;
        Node next;

        public Node( int data){

            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public LinkedList(){
        this.head = null;
    }


    public void addNode(int data){
        Node newNode = new Node(data);
        Node current = head;
        if(head == null){
            head = newNode;
            return;
        }
        if (newNode.data < head.data){
            newNode.next = head;
            head = newNode;
        }

        if(current.next == null){
            current.next = newNode;
            System.out.println("Added node " + newNode.data);
        }else if(newNode.data < current.next.data)
            {
            newNode.next = current.next;
            current.next = newNode;
        }

        while (current.next != null) {
            current = current.next;
            System.out.println("In the While loop");
        }
        current.next = newNode;
        return;
    }



    private void deleteNode(int data) {
        Node current = head;
        Node previous = null;
        if(current==null){
            System.out.println("Nothing to Delete");
            return;
        }
        while(current.data != data){
            previous = current;
            current = current.next;
        }

        previous.next = current.next;

    }


    public String toString()
    {
        String myReturn = "HEAD\n";
       // myReturn += "|\n";
        myReturn +="\u2193\n";  // to print this ↓
        Node current = head;
        while(current != null)
        {
            myReturn += current.data;
            myReturn += " -> ";
            current = current.next;
        }

        myReturn += "NULL";

        return myReturn;
    }


    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();

        myList.addNode(5);
        System.out.println("Added 5");
        System.out.println(myList);
        myList.addNode(10);
        System.out.println("Added 10");
        System.out.println(myList);
        myList.addNode(7);
        System.out.println("Added 7");
        System.out.println(myList);



        myList.addNode(20);
        System.out.println("Added 20");
        System.out.println(myList);



        //myList.deleteNode(10);

        System.out.println(myList);

    }

}
