import java.util.*;

// ---> step 01

/*class Node{
    int data;
    Node next;

    Node(int data){
       this.data=data;
    }
}

class Queue{
    Node front;
    Node back;

    public void enqueue(int data){
        Node n1=new Node(data);
        if(front == null){
           front=n1;
           back=n1;
        }
        else{
           back.next=n1;
           back=n1;  
        }
    }
}

class Demo{
    public static void main(String args[]){
        Queue q1=new Queue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
    }
}*/

// -------------------------------------------------------------------------------------------------

/*class Node{
    int data;
    Node next;

    Node(int data){
       this.data=data;
    }
}

class Queue{
    Node front;

    public void enqueue(int data){
        Node n1=new Node(data);
        if(front == null){
           front=n1;
        }
        else{
           Node lastNode=front;
           while(lastNode.next != null){
               lastNode=lastNode.next;
           }
           lastNode.next=n1;
        }
    }
}

class Demo{
    public static void main(String args[]){
        Queue q1=new Queue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
    }
}*/


// ---> step 02

class Node{
    int data;
    Node next;

    Node(int data){
       this.data=data;
    }
}

class Queue{
    Node front;

    public void enqueue(int data){
        Node n1=new Node(data);
        if(front == null){
           front=n1;
        }
        else{
           Node lastNode=front;
           while(lastNode.next != null){
               lastNode=lastNode.next;
           }
           lastNode.next=n1;
        }
    }

    public void printQueue(){
        Node temp=front;
        
        System.out.print("[");
        while(temp != null){
            System.out.print(temp.data+", ");
        }
        System.out.println(front == null ? "empty]" : "\b\b]")
    }

    public void dequeue(){
        if(front != null){
           front=front.next;
        }
    }
}

class Demo{
    public static void main(String args[]){
        Queue q1=new Queue();
        q1.enqueue(10);
        q1.enqueue(20);
        q1.enqueue(30);
        q1.enqueue(40);
        q1.enqueue(50);
        q1.printQueue();

        q1.enqueue(60);
        q1.printQueue();

        
    }
}