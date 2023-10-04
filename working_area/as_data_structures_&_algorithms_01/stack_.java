import java.util.*;

// ---> step 01

/*class Stack{}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack();
    }
}*/



// ================================================================================================
// ---> step 02

/*class Stack{
    private int[] dataArray;
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack();
         //System.out.println(s1.dataArray); // null
    }
}*/


// ================================================================================================
// ---> step 03

/*class Stack{
    private int[] dataArray;

    Stack(int size){
        dataArray = new int[size];
    }
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack(10);

         
    }
}*/


// =================================================================================================
// ---> step 04

/*class Stack{
    private int[] dataArray;
    private int nextIndex;

    Stack(int size){
        dataArray = new int[size];
        nextIndex=0;
    }
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack(10);

    }
}*/


// ======================================================================================================
// ---> step 05

/*class Stack{
    private int[] dataArray;
    private int nextIndex;

    Stack(int size){
        dataArray = new int[size];
        nextIndex=0;
    }

    public void push(int data){
        //dataArray[nextIndex++]=data;      
  
        dataArray[nextIndex]=data;
        nextIndex++;
    }
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack(10);

         s1.push(10);
         s1.push(20);
         s1.push(30);
         s1.push(40);
    }
}*/


// ===================================================================================
// ---> step 06

/*class Stack{
    private int[] dataArray;
    private int nextIndex;

    Stack(int size){
        dataArray = new int[size];
        nextIndex=0;
    }

    public void push(int data){
        dataArray[nextIndex++]=data;      
    }

    public void printStack(){
        System.out.print("[");
        for(int i=nextIndex-1;i>=0;i--){
           System.out.print(dataArray[i]+", ");
        }
        System.out.print("\b\b]\n");
    }
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack(10);

         s1.push(10);
         s1.push(20);
         s1.push(30);
         s1.push(40);
         s1.printStack();

         s1.push(50);
         s1.printStack();
    }
}*/


// =========================================================================================
// ---> step 07

/*class Stack{
    private int[] dataArray;
    private int nextIndex;

    Stack(int size){
        dataArray = new int[size];
        nextIndex=0;
    }

    public void push(int data){
        dataArray[nextIndex++]=data;      
    }

    public void pop(){
        nextIndex--;
    }

    public void printStack(){
        System.out.print("[");
        for(int i=nextIndex-1;i>=0;i--){
           System.out.print(dataArray[i]+", ");
        }
        System.out.print("\b\b]\n");
    }
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack(10);

         s1.push(10);
         s1.push(20);
         s1.push(30);
         s1.push(40);
         s1.printStack();

         s1.push(50);
         s1.printStack();

         s1.pop();
         s1.printStack();
    }
}*/


// ==================================================================================================
// ---> step 08

class Stack{
    private int[] dataArray;
    private int nextIndex;

    Stack(int size){
        dataArray = new int[size];
        nextIndex=0;
    }

    public void push(int data){
        if(nextIndex >= dataArray.length){
           System.out.println("Stack is full...");
        }
        else{
           dataArray[nextIndex++]=data;
        }      
    }

    public void pop(){
        if(nextIndex == 0){
           System.out.println("Stack is empty...");
        }
        else{
           nextIndex--;
        }
    }

    public void printStack(){
        System.out.print("[");
        for(int i=nextIndex-1;i>=0;i--){
           System.out.print(dataArray[i]+", ");
        }
        System.out.println(nextIndex == 0 ? "empty]" : "\b\b]");
    }

    public int size(){
        return nextIndex;
    }

    public void clear(){
        nextIndex=0;
    }

    public int peek(){
        return nextIndex<=0 ? -1 : dataArray[nextIndex-1];
    }

    public int poll(){
        return nextIndex<=0 ? -1 : dataArray[--nextIndex];
    }

    public int[] toArray(){
        int[] tempArr=new int[nextIndex];
        for(int i=0;i<nextIndex;i++){
           tempArr[i]=dataArray[nextIndex-i-1];
        }
        return tempArr;
    }
}

class Demo{
    public static void main(String args[]){
         Stack s1=new Stack(10);
         s1.printStack();  //[empty]
         System.out.println("Size of the stack : "+s1.size());
         s1.push(10);
         s1.push(20);
         s1.push(30);
         s1.push(40);
         s1.push(50);
         s1.printStack();
         System.out.println("Size of the stack : "+s1.size());
         System.out.println("Peek value is : "+s1.peek());

         s1.push(60);
         s1.push(70);
         s1.push(80);
         s1.push(90);
         s1.push(100);
         s1.printStack();
         System.out.println("Size of the stack : "+s1.size());
         System.out.println("Peek value is : "+s1.peek());

         s1.push(111);
         // ------------------------------------------------------------------
         s1.clear();
         s1.printStack();
         System.out.println("Size of the stack : "+s1.size());

         s1.pop();
         System.out.println("Peek value is : "+s1.peek());

         int[] arr=s1.toArray();
         System.out.println(Arrays.toString(arr));
    }
}



































