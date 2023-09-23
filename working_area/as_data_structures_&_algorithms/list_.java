class List{
    private int[] dataArray;
    private int nextIndex;

    List(int size){
        dataArray=new int[size];
        nextIndex=0;
    }

    public void add(int data){
         if(nextIndex == dataArray.length){
            System.out.println("List is full...");
         }
         else{
            dataArray[nextIndex++]=data;
         }
    }

    public void addFront(int data){
         if((nextIndex == 0) | (nextIndex == dataArray.length)){
            add(data);
         }
         else{
            for(int i=nextIndex-1;i>=0;i--){
               dataArray[i+1]=dataArray[i];
            }
            dataArray[0]=data;
            nextIndex++;
         }
    }      
         
    public void remove(){
         if(nextIndex == 0){
            System.out.println("List is empty...");
         }
         else{
            nextIndex--;
         }
    }

    public void removeFront(){
         if((nextIndex == 0) | (nextIndex == 1)){
            remove();
         }
         else{
            for(int i=0;i<nextIndex-1;i++){
               dataArray[i]=dataArray[i+1];
            }
            nextIndex--;
         }
         
    }

    public void addPosition(int data,int pos){
         if((pos >= 1) & (pos <= nextIndex)){
            if((nextIndex == 0) | (nextIndex == dataArray.length) | (pos == nextIndex)){
               add(data);
            }
            else{
               for(int i=pos-1;i<nextIndex;i++){
                  dataArray[i+1]=dataArray[i];
               }
               dataArray[pos-1]=data;
               nextIndex++;
            }
         }
         else{
            System.out.println("Invalid position...");
         }
    }

    public void removePosition(int pos){
         if((pos >= 1) & (pos < nextIndex)){
            if((nextIndex == 0) | ((nextIndex == 1) & (pos == 1))){
               remove();
            }
            else{
               for(int i=pos-1;i<nextIndex-1;i++){
                  dataArray[i]=dataArray[i+1];
               }
               nextIndex--;
            }
         }
         else{
            System.out.println("Invalid position...");
         }
    }

    public void printList(){
         System.out.print("[");
         for(int i=0;i<nextIndex;i++){
            System.out.print(dataArray[i]+", ");
         }
         System.out.println(nextIndex == 0 ? "empty]" : "\b\b]");
    }

    public int size(){
         return nextIndex;
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
         List l1=new List(10);

         l1.add(10);
         l1.add(20);
         l1.add(30);
         l1.printList();

         l1.addFront(99);
         l1.printList();

         l1.remove();
         l1.printList();

         l1.removeFront();
         l1.printList();

         l1.addPosition(99,2);
         l1.printList();

         l1.removePosition(2);
         l1.printList();
    }
}