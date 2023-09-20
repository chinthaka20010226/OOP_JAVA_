import java.util.*;

class Queue{
    private int[] dataArray;
    private int nextIndex;

    Queue(int size){
       dataArray=new int[size];
       nextIndex=0;
    }

    public void enqueue(int data){
        if(nextIndex == dataArray.length){
           increaArr();
        }
        dataArray[nextIndex++]=data;
    }

    public void increaArr(){
        int[] tempArr=new int[(nextIndex+1)*2];
        for(int i=0;i<dataArray.length;i++){
           tempArr[i]=dataArray[i];  
        }
        dataArray=tempArr;
    }

    public void printQueue(){
        System.out.print("[");
        for(int i=0;i<nextIndex;i++){
           System.out.print(dataArray[i]+", ");
        }
        System.out.println(nextIndex == 0 ? "empty]" : "\b\b]");
    }

    public void dequeue(){
        if(nextIndex == 0){
           System.out.println("[empty]");
        }
        else{
           for(int i=0;i<nextIndex-1;i++){
              dataArray[i]=dataArray[i+1];
           }
           nextIndex--;
        }
    }

    public int size(){
        return nextIndex;
    }

    public int capacity(){
        return dataArray.length;
    }

    public void clear(){
        nextIndex=0;
    }

    public int peek(){
        return nextIndex == 0 ? -1 : dataArray[0];
    }
 
    public int poll(){
        int temp=dataArray[0];
        for(int i=0;i<nextIndex-1;i++){
            dataArray[i]=dataArray[i+1];
        }
        nextIndex--;
        return temp;
    }
 
    public int[] toArray(){
        int[] tempArr=new int[nextIndex];
        for(int i=0;i<nextIndex;i++){
           tempArr[i]=dataArray[i];
        }
        return tempArr;
    }
}

class Demo{
    public static void main(String args[]){
         Queue q1=new Queue(5);
         q1.printQueue();
         System.out.println("Size     of the queue : "+q1.size());
         System.out.println("Capacity of the queue : "+q1.capacity());
         q1.enqueue(10);
         q1.enqueue(20);
         q1.enqueue(30);
         q1.enqueue(40);
         q1.enqueue(50);
         q1.printQueue();
         System.out.println("Size     of the queue : "+q1.size());
         System.out.println("Capacity of the queue : "+q1.capacity());

         q1.enqueue(60);
         q1.printQueue();
         System.out.println("Size     of the queue : "+q1.size());
         System.out.println("Capacity of the queue : "+q1.capacity());
         
         q1.enqueue(70);
         q1.enqueue(80);
         q1.enqueue(90);
         q1.enqueue(100);
         q1.enqueue(110);
         q1.enqueue(120);
         q1.printQueue();
         System.out.println("Size     of the queue : "+q1.size());
         System.out.println("Capacity of the queue : "+q1.capacity());

         q1.enqueue(130);
         q1.printQueue();
         System.out.println("Size     of the queue : "+q1.size());
         System.out.println("Capacity of the queue : "+q1.capacity());
    }
}















