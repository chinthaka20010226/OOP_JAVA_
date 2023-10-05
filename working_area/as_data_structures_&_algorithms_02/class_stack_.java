import java.util.*;

// --> step 01

/*class Node{
    int data;
    Node next;
}

class Demo{
    public static void main(String args[]){
        Node n1=new Node();
    }
}*/


// --> step 02

/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class Demo{
    public static void main(String args[]){
        Node n1=new Node(10);
    }
}*/


// --> step 03

/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top;
}

class Demo{
    public static void main(String args[]){
        Stack s1=new Stack();
    }
}*/


// --> step 04

/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top;

    public void push(int data){
       Node n1=new Node(data);
       top=n;  
    }
}

class Demo{
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(10);
    }
}*/


// --> step 05


/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top;

    public void push(int data){
       Node n1=new Node(data);
       n1.next=top;
       top=n1;  
    }
}

class Demo{
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
    }
}*/


// --> step 06

/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top;

    public void push(int data){
       Node n1=new Node(data);
       n1.next=top;
       top=n1;  
    }

    public void printStack(){
       Node temp=top;

       System.out.print("[");
       while(temp != null){
          System.out.print(temp.data+", ");
          temp=temp.next;
       }
       System.out.println(top == null ? "empty]" : "\b\b]");
    }
}

class Demo{
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.printStack();
 
        s1.push(40);
        s1.push(50);
        s1.printStack();
    }
}*/


// --> step 07

/*class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }
}

class Stack{
    Node top;

    public void push(int data){
       Node n1=new Node(data);
       n1.next=top;
       top=n1;  
    }

    public void printStack(){
       Node temp=top;

       System.out.print("[");
       while(temp != null){
          System.out.print(temp.data+", ");
          temp=temp.next;
       }
       System.out.println(top == null ? "empty]" : "\b\b]");
    }

    public void pop(){
       if(top != null){
          //Node temp=top;
          top=top.next;
          //temp.next=null;  // ---> Not consizer that(garbage collection)
       }
    }

    public int size(){
       Node temp=top;
       int size=0;
      
       while(temp != null){
          size++;
          temp=temp.next;
       }
       return size;
    }

    public void clear(){
       if(top != null){
          top=null;
       }
    }

    public int peek(){
       return top == null ? -1 : top.data;
    }

    public int poll(){
       if(top != null){
          Node temp=top;
          top=top.next;
          return temp.data;
       }
       return -1; 
    }

    public int[] toArray(){
        int[] arr=new int[size()];
        Node temp=top;

        for(int i=0;i<arr.length;i++){
           arr[i]=temp.data;
           temp=temp.next;
        }
        return arr;
    }
}

class Demo{
    public static void main(String args[]){
        Stack s1=new Stack();
        s1.printStack();
        System.out.println("Size of Sstack : "+s1.size());
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.printStack();

        int topElement;
        topElement=s1.peek();
        System.out.println("Top Element : "+topElement);
        System.out.println("After calling peek().......");
        s1.printStack();

        topElement=s1.poll();
        System.out.println("Top Element : "+topElement);
        System.out.println("After calling poll().......");
        s1.printStack();
  
        s1.push(40);
        s1.push(50);
        s1.printStack();

        int[] arr=s1.toArray();
        System.out.println(Arrays.toString(arr));

        s1.pop();
        s1.printStack();

        s1.clear();
        s1.printStack();
        System.out.println("Size of Sstack : "+s1.size());
    }
}*/















