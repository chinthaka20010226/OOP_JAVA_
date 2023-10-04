// -----> Option 02(OOP object)

import java.util.*;

/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

}    

class Example{
    public static void main(String args[]){
         //Student[] strArr = new Student[5];         
         Student[] stuArr;               //create a reference variable type "Student object array type"
         stuArr = new Student[5];        //create an array object type "Student"

         //Student s1 = new Student();
         Student s1;                     //create a reference variable type "Student object" 
         s1 = new Student();             //create an object type "Student"

         s1.stuId = "S001";
         s1.stuName = "Chinthaka";
         s1.dbmsMarks = 89;
         s1.prfMarks = 87;

         System.out.println("Student   Id : "+s1.stuId);
         System.out.println("Student Name : "+s1.stuName);
         System.out.println("Marks   dbms : "+s1.stuId);
         System.out.println("Marks    prf : "+s1.stuId);

    }

}*/



// =======================================================================================================================================

// ------------> NullPointerException,


/*class Student{
    String name;
    int age;

}

class Example{
    Student s1=null;

    s1.name = "chinthaka";
       

}*/


// ======================================================================================

// -----> Propertice(attributes) & Methods(behaviorals)

/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

    public void setStudentDetails(String id,String name,int dbms,int prf){
         stuId = id;
         stuName = name;
         dbmsMarks = dbms;
         prfMarks = prf;
    }

    public void printStudentDetails(){
         System.out.println(stuId+"\t"+stuName+"\t"+dbmsMarks+"\t"+prfMarks);
    }      

}

class Example{
    public static void main(String args[]){
         Student s=new Student();

         //s.stuId = "S001";
         //s.stuName = "Chinthaka";
         //s.dbmsMarks = 78;
         //s.prfMarks = 79;

         s.setStudentDetails("S001","Chinthaka",78,67);
         s.printStudentDetails();

    }

}*/


//====================================================================================================================


/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

    public void setStudentDetails(String id,String name,int d,int p){
         stuId = id;
         stuName = name;
         dbmsMarks = d;
         prfMarks = p;

    }

    public void printStudentDetails(){
         System.out.println(stuId+"\t"+stuName+"\t"+dbmsMarks+"\t"+prfMarks);

    }

}


class Example{
    public static Student[] stuArr = new Student[0];

    public static void printStuDetails(){
         for(int i=0;i<stuArr.length;i++){
             stuArr[i].printStudentDetails();

            //System.out.println(stuArr[i].stuId+"\t"+stuArr[i].stuName+"\t"+stuArr[i].dbmsMarks+"\t"+stuArr[i].prfMarks);
          
         }

    }

    public static void deleteStudent(){
         Scanner input=new Scanner(System.in);
         System.out.print("Input id for delete : ");
         String id=input.nextLine();
         int index = searchStudent(id);

         if(index != -1){
            for(int i=index;i<stuArr.length-1;i++){
               stuArr[i]=stuArr[i+1];
            }
            
            Student[] tempArr=new Student[stuArr.length-1];

            for(int i=0;i<tempArr.length;i++){
               tempArr[i]=stuArr[i];
            }

            stuArr = tempArr;
         }
         else{
             System.out.println(id+" is not exsits....");
 
         }

    }

    public static int searchStudent(String id){
         for(int i=0;i<stuArr.length;i++){
            Student s=stuArr[i];
            if(s.stuId.equalsIgnoreCase(id)){  // NOT use -----> if(arr[i].stuId == id)
               return i; //return index,
            }
         }
         return -1;

    }

    public static void addNewStudent(){
         Scanner input=new Scanner(System.in);

         System.out.print("input your id        :");
         String id=input.nextLine();
         if(searchStudent(id) != -1){
            System.out.println("Duplicate id");

         }
         else{
            System.out.print("input your name      :");
            String name=input.nextLine();
            System.out.print("input your dbms marks:");
            int dbms=input.nextInt();
            System.out.print("input your prf marks :");
            int prf=input.nextInt();

            Student[] tempArr = new Student[stuArr.length+1];
 
            //referencess of object copy to temp array
            for(int i=0;i<stuArr.length;i++){
               tempArr[i] = stuArr[i];
                   
            }
            
            //create new object
            Student s=new Student();
            s.setStudentDetails(id,name,dbms,prf);
            
            //s.stuId = id;
            //s.stuName = name;
            //s.dbmsMarks = dbms;
            //s.prfMarks = prf;

            tempArr[stuArr.length]=s;

            stuArr = tempArr;

         }
         

    }

    public static void main(String args[]){
         Scanner input=new Scanner(System.in);

         do{
            System.out.println("\t1.Add new student :");
            System.out.println("\t2.Delete student :");
            System.out.println("\t3.Search student :");
            System.out.println("\t4.Print students :");
            System.out.println("\t5.Exit :");

            System.out.print("Input option>>>");
            int op=input.nextInt();

            switch(op){
               case 1:
                  addNewStudent();
                  break;
               case 2:         
                  deleteStudent();
                  break;
               case 3:
                  //searchStudent();
                  break;
               case 4:
                  printStuDetails();
                  break;
               case 5:
                  System.exit(0);
                  break;
               default:
                   System.out.println("Wrrong input number, try again");
            }
            

         }while(true);

    }

}*/



// =======================================================================================================

// -----> Constructor......(Default)

/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

    Student(){ //No return type(void) ---> Default Constructor
       System.out.println("Hey, I am Constructor");

    }

}

class Example{
    public static void main(String argd[]){
         Student s1=new Student(); //Calling Default Constructor
         Student s2=new Student();

    }

}*/


// ==================================================================================================

// ------> Constructor.......(Parameterize)

/*class Student{
    String stuId;
    String stuName;
    int dbms;
    int prf;

    Student(){ // ------------> Default
       System.out.println("This is a Default Constructor");
    }

    Student(String id,String name,int d,int p){ // --------------> Parameterize
       System.out.println("This is a Parameterize Constructor");
       stuId = id;
       stuName = name;
       dbms = d;
       prf = p;
    }

    public void printStudentDetails(){
       System.out.println(stuId+" "+stuName+" "+dbms+" "+prf);
    }

}

class Example{
    public static void main(String args[]){
       Student s1=new Student();
       s1.printStudentDetails();

       Student s2=new Student("S001","Nimal",73,88);
       s2.printStudentDetails();

    }

}*/


// ==============================================================================================================

/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

    Student(){
         System.out.println("This is a Default Constructor");
    }

    Student(String id,String name,int d,int p){
         System.out.println("This is a Parameterize Constructor");
         stuId = id;
         stuName = name;
         dbmsMarks = d;
         prfMarks = p;
    }

    public void setStudentDetails(String id,String name,int d,int p){
         stuId = id;
         stuName = name;
         dbmsMarks = d;
         prfMarks = p;
    }

    public void printStudentDetails(){
         System.out.println(stuId+"\t"+stuName+"\t"+dbmsMarks+"\t"+prfMarks);
    }

    public boolean equals(String id){
         return id.equalsIgnoreCase(stuId);
    }

    public String getStudentDetals(){
         return stuId+" "+stuName+" "+dbmsMarks+" "+prfMarks;         
    }

}


class Example{
    public static Student[] stuArr = new Student[0];

    public static void printStuDetails(){
         for(int i=0;i<stuArr.length;i++){
             stuArr[i].printStudentDetails();

            //System.out.println(stuArr[i].stuId+"\t"+stuArr[i].stuName+"\t"+stuArr[i].dbmsMarks+"\t"+stuArr[i].prfMarks);
          
         }

    }

    public static void deleteStudent(){
         Scanner input=new Scanner(System.in);
         System.out.print("Input id for delete : ");
         String id=input.nextLine();
         int index = searchStudent(id);

         if(index != -1){
            for(int i=index;i<stuArr.length-1;i++){
               stuArr[i]=stuArr[i+1];
            }
            
            Student[] tempArr=new Student[stuArr.length-1];

            for(int i=0;i<tempArr.length;i++){
               tempArr[i]=stuArr[i];
            }

            stuArr = tempArr;
         }
         else{
             System.out.println(id+" is not exsits....");
 
         }

    }

    public static int searchStudent(String id){
         for(int i=0;i<stuArr.length;i++){
            Student s=stuArr[i];
            if(s.equals(id)){  // NOT use -----> if(arr[i].stuId == id)
               return i; //return index,
            }
         }
         return -1;

    }

    public static void addNewStudent(){
         Scanner input=new Scanner(System.in);

         System.out.print("input your id        :");
         String id=input.nextLine();
         if(searchStudent(id) != -1){
            System.out.println("Duplicate id");

         }
         else{
            System.out.print("input your name      :");
            String name=input.nextLine();
            System.out.print("input your dbms marks:");
            int dbms=input.nextInt();
            System.out.print("input your prf marks :");
            int prf=input.nextInt();

            Student[] tempArr = new Student[stuArr.length+1];
 
            //referencess of object copy to temp array
            for(int i=0;i<stuArr.length;i++){
               tempArr[i] = stuArr[i];
                   
            }
            
            //create new object
            Student s=new Student(id,name,dbms,prf);
            //s.setStudentDetails(id,name,dbms,prf);
            
            //s.stuId = id;
            //s.stuName = name;
            //s.dbmsMarks = dbms;
            //s.prfMarks = prf;

            tempArr[stuArr.length]=s;

            stuArr = tempArr;

         }
         

    }

    public static void main(String args[]){
         Scanner input=new Scanner(System.in);

         do{
            System.out.println("\t1.Add new student :");
            System.out.println("\t2.Delete student :");
            System.out.println("\t3.Search student :");
            System.out.println("\t4.Print students :");
            System.out.println("\t5.Exit :");

            System.out.print("Input option>>>");
            int op=input.nextInt();

            switch(op){
               case 1:
                  addNewStudent();
                  break;
               case 2:         
                  deleteStudent();
                  break;
               case 3:
                  //searchStudent();
                  break;
               case 4:
                  printStuDetails();
                  break;
               case 5:
                  System.exit(0);
                  break;
               default:
                   System.out.println("Wrrong input number, try again");
            }
            

         }while(true);

    }

}*/



// ==============================================================================================================================

/*class Example{
    public static boolean checkDuplicatesInOff(int[][] arr){
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length-1;j++){
               if(arr[i][arr.length-1-i] == arr[j+1][arr.length-1-j]){
                  return true;
               }
            }
         }
         return false;

    }

    public static boolean checkDuplicatesInPrinciple(int[][] arr){
         for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[i].length-1;j++){
               if(arr[i][i] == arr[j+1][j+1]){
                  return true;
               }
            }
         }
         return false;
 
    }

    public static boolean checkSumOff(int[][] arr){
         int sum=0;

         for(int i=0;i<arr.length;i++){
            sum += arr[i][arr.length-1-i];
         }
         return sum != 15 ? true : false;
        
    }

    public static boolean checkSumPrinciple(int[][] arr){
         int sum=0;

         for(int i=0;i<arr.length;i++){
            sum += arr[i][i];
         }
         return sum != 15 ? true : false;

    }

    public static boolean chechSumCol(int[][] arr){
         int sum=0;

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               sum += arr[j][i];
            }
            if(sum != 15){
              return true;
            }
            sum=0;
         }
         return false;

    }

    public static boolean checkSumRow(int[][] arr){
         int sum=0;

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               sum += arr[i][j];
            }
            if(sum != 15){
               return true;
            }
            sum=0;
         }
         return false;
    }

    public static boolean checkDuplicates(int[][] arr){
         int sum=0;
 
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               for(int k=j;k<arr[i].length-1;k++){
                  if(arr[i][j] == arr[i][k+1]){
                    return true;
                  }
               }
            }
         }
         return false;

    }

    public static void writeRandomInput(int[][] arr){
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
         }
         System.out.println();
    }

    public static void readRandomInput(int[][] arr){
         Random r=new Random();

         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
               arr[i][j]=r.nextInt(9)+1; //1 to 9
            }
         }
    }

    public static void main(String args[]){
         int[][] arr=new int[3][3];

         readRandomInput(arr);
         writeRandomInput(arr);

         while(checkDuplicates(arr) || checkSumRow(arr) || chechSumCol(arr) || checkSumPrinciple(arr) || checkSumOff(arr) || checkDuplicatesInPrinciple(arr) || checkDuplicatesInOff(arr)){
             readRandomInput(arr);
         }
         writeRandomInput(arr);

    }
}*/


// =======================================================================================================


class Example{
    public static void main(String args[]){
         int num=12;

         for(int i=0;i<num;i++){
            System.out.println(i);
         }
    }
}



























