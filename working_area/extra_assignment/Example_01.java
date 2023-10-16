class Patient{
    private int code;
    private String name;

    Patient(int code,String name){
         this.code=code;
         this.name=name;
    }

    public String getPatientDetails(){
         return "["+this.code+"-"+this.name+"]";
    }
}

class PatientQueue{
    private Node front;

    public void enQueue(Patient patient){
         Node temp=new Node(patient);
         if(front == null){
             front=temp;
         }
         else{
             Node lastNode=front;
             while(lastNode.next != null){
                 lastNode=lastNode.next;
             }
             lastNode.next=temp;
         }
    }

    public void printQueue(){
         Node temp=front;
         System.out.print("[");
         while(temp != null){
             System.out.print(temp.patient.getPatientDetails()+", ");
             temp=temp.next;
         }
         System.out.println(front != null ? "\b\b]" : "]");
    }

    class Node{
        Patient patient;
        Node next;

        Node(Patient patient){
            this.patient=patient;
        }
    }
}

class Demo{
    public static void main(String args[]){
         PatientQueue queue=new PatientQueue();
         queue.enQueue(new Patient(101,"Amal"));
         queue.enQueue(new Patient(102,"Nimal"));
         queue.enQueue(new Patient(103,"Namal"));
         queue.enQueue(new Patient(104,"Bimal"));
         queue.printQueue();

         //Patient firstPatient=queue.dequeue();
         //Syetem.out.println(firstPatient.getPatientDetails());
         //queue.printQueue()

         //System.out.println("No of patient of the queue : "+queue.size());
         //queue.clear();
         //queue.printQueue();
         //System.out.println("No of patient of the queue : "+queue.size());
    }
}