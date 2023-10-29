import java.util.*;

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
    private Node start;

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
           temp=temp.next;
        }
        System.out.println(start == null ? "empty]" : "\b\b]");
    }

    public void add(int idx,int data){
        if(idx < size()){
           Node n1=new Node(data);
           Node prev=start;
           int i=0;
 
           while(i < idx-1){
              prev=prev.next;
              i++;
           }
           n1.next=prev.next;
           prev.next=n1;
        }
    }

    public void remove(int idx){
        if(idx < size()){
           Node prev=start;
           int i=0;

           while(i < idx-1){
              prev=prev.next;
              i++;
           }
           prev.next=prev.next.next;
        }
    }

    public int get(int idx){
        if(idx < size()){
           Node temp=start;
           int i=0;

           while(i < idx-1){
              temp=temp.next;
              i++;
           }
           return temp.data;
        }
        return -1;
    }

    public int size(){
        Node temp=start;
        int size=0;

        while(temp != null){
            size++;
            temp=temp.next;
        }
        return size;
    }    

    class Node{
        private int data;
        private Node next;
     
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

        l1.add(2,99);
        l1.printList();
        System.out.println("Size of List : "+l1.size());

        l1.remove(2);
        l1.printList();
        System.out.println("Size of List : "+l1.size());

        System.out.println("third position data : "+l1.get(3));
    }
}


















