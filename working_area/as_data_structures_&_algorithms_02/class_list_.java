import java..util.*;

// ---> step 01

/*class List{
    Node start;

    class Node{
        int data;
        Node next;
     
        Node(int data){
           this.data=data;
        }
    }
}

class Demo{
    public static void main(String args[]){
        List l1=new List();
    }
}*/


// ---> step 02

class List{
    Node start;

    public void add(int data){
        Node n1=new Node(data);

        if(start == null){
           start=n1;
        }
        else{
           Node lastNode=start;
           
           while(lastNode.next != null){
              lastNode=lastNode.next;
           }
           lastNode.next=n1;
        }
    }

    public void printList(){
        Node temp=start;

        System.out.print("[");
        while(temp != null){
           System.out.print(temp.data+", ");
        }
        System.out.print(start == null ? "empty]" : "\b\b]");
    }

    class Node{
        int data;
        Node next;
     
        Node(int data){
           this.data=data;
        }
    }
}

class Demo{
    public static void main(String args[]){
        List l1=new List();
         
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        l1.add(50);
        l1.printList();
    }
}


















