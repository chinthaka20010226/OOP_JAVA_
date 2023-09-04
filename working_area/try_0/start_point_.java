import java.util.*;

/*class Example{
    public static void printStuDetails(String[] stuIdArray,String[] stuNameArray,int[] dbmsMarksArray,int[] prfMarksArray){
        for(int i=0;i<stuIdArray.length;i++){
           System.out.println("\tId : "+stuIdArray[i]);
           System.out.println("\tName : "+stuNameArray[i]);
           System.out.println("\tDBMS marks : "+dbmsMarksArray[i]);
           System.out.println("\tPRF marks : "+prfMarksArray[i]);
           System.out.println();
        }

    }

    public static void addNewStudent(String[] stuIdArray,String[] stuNameArray,int[] dbmsMarksArray,int[] prfMarksArray){
        Scanner input = new Scanner(System.in);
        String[] tempStuIdArray = new String[stuIdArray.length+1];
        String[] tempStuNameArray = new String[stuNameArray.length+1];
        int[] tempdbmsMarksArray = new int[dbmsMarksArray.length+1];
        int[] tempPrfMarksArray = new int[prfMarksArray.length+1];
         
        for(int i=0;i<stuIdArray.length;i++){
           tempStuIdArray[i] = stuIdArray[i];
           tempStuNameArray[i] = stuNameArray[i];
           tempdbmsMarksArray[i] = dbmsMarksArray[i];
           tempPrfMarksArray[i] = prfMarksArray[i];
        }

        System.out.println("Enter a new student id : ");
        tempStuIdArray[stuIdArray.length] = input.nextLine();
        System.out.println("Enter a new student name : ");
        tempStuNameArray[stuNameArray.length] = input.nextLine();
        System.out.println("Enter a new student dbms marks : ");
        tempdbmsMarksArray[dbmsMarksArray.length] = input.nextInt();
        System.out.println("Enter a new student prf marks : ");
        tempPrfMarksArray[prfMarksArray.length] = input.nextInt();
        
        stuIdArray = tempStuIdArray;
        stuNameArray = tempStuNameArray;
        dbmsMarksArray = tempdbmsMarksArray;
        prfMarksArray = tempPrfMarksArray;

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        String[] stuIdArray = new String[0];
        String[] stuNameArray = new String[0];
        int[] dbmsMarksArray = new int[0];
        int[] prfMarksArray = new int[0];

        do{
           System.out.println("\t1.Add new student :");
           System.out.println("\t2.Delete student :");
           System.out.println("\t3.Search student :");
           System.out.println("\t4.Print student details :");
           System.out.println("\t5.Exit :");
          
           System.out.println("input your option>>>:");
           int num = input.nextInt();

           switch(num){
               case 1:
                  addNewStudent(stuIdArray,stuNameArray,dbmsMarksArray,prfMarksArray);
                  break;
               case 2:
                  //deleteStudent();
                  break;
               case 3:
                  //searchStudent();
                  break;
               case 4:
                  printStuDetails(stuIdArray,stuNameArray,dbmsMarksArray,prfMarksArray);
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


// ===================================================================================================================

// -----> Option 01 - Using 'static',

/*class Example{
    public static String[] stuIdArray = new String[0]; 
    public static String[] stuNameArray = new String[0];
    public static int[] dbmsMarksArray = new int[0];
    public static int[] prfMarksArray = new int[0];

    public static void printStuDetails(){
        for(int i=0;i<stuIdArray.length;i++){
           System.out.println("\tId : "+stuIdArray[i]);
           System.out.println("\tName : "+stuNameArray[i]);
           System.out.println("\tDBMS marks : "+dbmsMarksArray[i]);
           System.out.println("\tPRF marks : "+prfMarksArray[i]);
           System.out.println();
        }

    }

    public static void addNewStudent(){
        Scanner input = new Scanner(System.in);
        String[] tempStuIdArray = new String[stuIdArray.length+1];
        String[] tempStuNameArray = new String[stuNameArray.length+1];
        int[] tempdbmsMarksArray = new int[dbmsMarksArray.length+1];
        int[] tempPrfMarksArray = new int[prfMarksArray.length+1];
         
        for(int i=0;i<stuIdArray.length;i++){
           tempStuIdArray[i] = stuIdArray[i];
           tempStuNameArray[i] = stuNameArray[i];
           tempdbmsMarksArray[i] = dbmsMarksArray[i];
           tempPrfMarksArray[i] = prfMarksArray[i];
        }

        System.out.println("Enter a new student id : ");
        tempStuIdArray[stuIdArray.length] = input.nextLine();
        System.out.println("Enter a new student name : ");
        tempStuNameArray[stuNameArray.length] = input.nextLine();
        System.out.println("Enter a new student dbms marks : ");
        tempdbmsMarksArray[dbmsMarksArray.length] = input.nextInt();
        System.out.println("Enter a new student prf marks : ");
        tempPrfMarksArray[prfMarksArray.length] = input.nextInt();
        
        stuIdArray = tempStuIdArray;
        stuNameArray = tempStuNameArray;
        dbmsMarksArray = tempdbmsMarksArray;
        prfMarksArray = tempPrfMarksArray;

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        do{
           System.out.println("\t1.Add new student :");
           System.out.println("\t2.Delete student :");
           System.out.println("\t3.Search student :");
           System.out.println("\t4.Print student details :");
           System.out.println("\t5.Exit :");
          
           System.out.println("input your option>>>:");
           int num = input.nextInt();

           switch(num){
               case 1:
                  addNewStudent();
                  break;
               case 2:
                  //deleteStudent();
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


// ==========================================================================================================

// -----> Option 02 - Using 'OOP object',

// -----> NullPointerException

/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

}


class Example{
    public static void printStuDetails(Student[] arr){
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].stuId+"\t"+arr[i].stuName+"\t"+arr[i].dbmsMarks+"\t"+arr[i].prfMarks);
          
         }

         //for(Student[] i:arr){
         //   System.out.println(i.stuId+" "+i.stuName+" "+i.dbmsMarks+" "+i.prfMarks);
         //
         //}

         //for(int i=0;i<arr.length;i++){
         //   Student s1=arr[i];
         //   System.out.println(s1.stuId+"\t"+s1.stuName+"\t"+s1.dbmsMarks+"\t"+s1.prfMarks);
         //}

    }

    public static Student[] addNewStudent(Student[] arr){
         Scanner input=new Scanner(System.in);

         Student[] tempArr = new Student[arr.length+1];
            
         for(int i=0;i<arr.length;i++){
            tempArr[i].stuId = arr[i].stuId;
            tempArr[i].stuName = arr[i].stuName;
            tempArr[i].dbmsMarks = arr[i].dbmsMarks;
            tempArr[i].prfMarks = arr[i].prfMarks;
         }
            
         System.out.print("input your id        :");
         String id=input.nextLine();
         System.out.print("input your name      :");
         String name=input.nextLine();
         System.out.print("input your dbms marks:");
         int dbms=input.nextInt();
         System.out.print("input your prf marks :");
         int prf=input.nextInt();
            
         tempArr[arr.length].stuId = id;
         tempArr[arr.length].stuName = name;
         tempArr[arr.length].dbmsMarks = dbms;
         tempArr[arr.length].prfMarks = prf;

         return tempArr;

    }

    public static void main(String args[]){
         Scanner input=new Scanner(System.in);

         Student[] stuArr = new Student[0];

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
                  stuArr = addNewStudent(stuArr);
                  break;
               case 2:         
                  //deleteStudent(stuArr);
                  break;
               case 3:
                  //searchStudent(stuArr);
                  break;
               case 4:
                  printStuDetails(stuArr);
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



// =========================================================================================================================================

// -------> NullPointerException


/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

}


class Example{
    public static void printStuDetails(Student[] arr){
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].stuId+"\t"+arr[i].stuName+"\t"+arr[i].dbmsMarks+"\t"+arr[i].prfMarks);
          
         }

         //for(Student[] i:arr){
         //   System.out.println(i.stuId+" "+i.stuName+" "+i.dbmsMarks+" "+i.prfMarks);
         //
         //}

         //for(int i=0;i<arr.length;i++){
         //   Student s1=arr[i];
         //   System.out.println(s1.stuId+"\t"+s1.stuName+"\t"+s1.dbmsMarks+"\t"+s1.prfMarks);
         //}

    }

    public static Student[] addNewStudent(Student[] arr){
         Scanner input=new Scanner(System.in);

         Student[] tempArr = new Student[arr.length+1];
            
         for(int i=0;i<arr.length;i++){
            tempArr[i].stuId = arr[i].stuId;
            tempArr[i].stuName = arr[i].stuName;
            tempArr[i].dbmsMarks = arr[i].dbmsMarks;
            tempArr[i].prfMarks = arr[i].prfMarks;
         }
            
         System.out.print("input your id        :");
         String id=input.nextLine();
         System.out.print("input your name      :");
         String name=input.nextLine();
         System.out.print("input your dbms marks:");
         int dbms=input.nextInt();
         System.out.print("input your prf marks :");
         int prf=input.nextInt();
            
         Student s=new Student();
         s.stuId = id;
         s.stuName = name;
         s.dbmsMarks = dbms;
         s.prfMarks = prf;

         tempArr[arr.length]=s;

         return tempArr;

    }

    public static void main(String args[]){
         Scanner input=new Scanner(System.in);

         Student[] stuArr = new Student[0];

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
                  stuArr = addNewStudent(stuArr);
                  break;
               case 2:         
                  //deleteStudent(stuArr);
                  break;
               case 3:
                  //searchStudent(stuArr);
                  break;
               case 4:
                  printStuDetails(stuArr);
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



// ==================================================================================================================================


/*class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

}


class Example{
    public static void printStuDetails(Student[] arr){
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].stuId+"\t"+arr[i].stuName+"\t"+arr[i].dbmsMarks+"\t"+arr[i].prfMarks);
          
         }

         //for(Student[] i:arr){
         //   System.out.println(i.stuId+" "+i.stuName+" "+i.dbmsMarks+" "+i.prfMarks);
         //
         //}

         //for(int i=0;i<arr.length;i++){
         //   Student s1=arr[i];
         //   System.out.println(s1.stuId+"\t"+s1.stuName+"\t"+s1.dbmsMarks+"\t"+s1.prfMarks);
         //}

    }

    public static Student[] deleteStudent(Student[] arr){
         Scanner input=new Scanner(System.in);
         System.out.print("Input id for delete : ");
         String id=input.nextLine();
         int index = searchStudent(arr,id);

         if(index != -1){
            for(int i=index;i<arr.length-1;i++){
               arr[i]=arr[i+1];
            }
            
            Student[] tempArr=new Student[arr.length-1];

            for(int i=0;i<tempArr.length;i++){
               tempArr[i]=arr[i];
            }

            return tempArr;

            //Student[] tempArr=new Student[arr.length-1];
            //
            //for(int i=0;i<tempArr.length;i++){
            //   tempArr[i]=new Student();
            //}
            //   
            //int j=0;
            //for(int i=0;i<arr.length;i++){
            //   if(arr[i].stuId.equalsIgnoreCase(id) != true){
            //      tempArr[j].stuId=arr[i].stuId;
            //      tempArr[j].stuName=arr[i].stuName;
            //      tempArr[j].dbmsMarks=arr[i].dbmsMarks;
            //      tempArr[j].prfMarks=arr[i].prfMarks;
            //      j++;
            //   }
            //  
            //}
            // 
            //return tempArr;
         }
         else{
             System.out.println(id+" is not exsits....");
             return arr;
 
         }

    }

    public static int searchStudent(Student[] arr,String id){
         for(int i=0;i<arr.length;i++){
            Student s=arr[i];
            if(s.stuId.equalsIgnoreCase(id)){  // NOT use -----> if(arr[i].stuId == id)
               return i; //return index,
            }
         }
         return -1;

    }

    public static Student[] addNewStudent(Student[] arr){
         Scanner input=new Scanner(System.in);

         System.out.print("input your id        :");
         String id=input.nextLine();
         if(searchStudent(arr,id) != -1){
            System.out.println("Duplicate id");
            return arr;

         }
         else{
            System.out.print("input your name      :");
            String name=input.nextLine();
            System.out.print("input your dbms marks:");
            int dbms=input.nextInt();
            System.out.print("input your prf marks :");
            int prf=input.nextInt();

            Student[] tempArr = new Student[arr.length+1];
 
            for(int i=0;i<arr.length;i++){
               tempArr[i] = arr[i];
                   
            }
            
            // ----> Now, to assign value to you new created Student object array
            //for(int i=0;i<arr.length;i++){
            //   tempArr[i].stuId = arr[i].stuId;
            //   tempArr[i].stuName = arr[i].stuName;
            //   tempArr[i].dbmsMarks = arr[i].dbmsMarks;
            //   tempArr[i].prfMarks = arr[i].prfMarks;
            //}
            
            Student s=new Student();
            s.stuId = id;
            s.stuName = name;
            s.dbmsMarks = dbms;
            s.prfMarks = prf;
            tempArr[arr.length]=s;

            return tempArr;

         }
         

    }

    public static void main(String args[]){
         Scanner input=new Scanner(System.in);

         Student[] stuArr = new Student[0];

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
                  stuArr = addNewStudent(stuArr);
                  break;
               case 2:         
                  stuArr = deleteStudent(stuArr);
                  break;
               case 3:
                  //searchStudent(stuArr);
                  break;
               case 4:
                  printStuDetails(stuArr);
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

// ------>> by using 'static'

class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

}


class Example{
    public static Student[] stuArr = new Student[0];

    public static void printStuDetails(){
         for(int i=0;i<stuArr.length;i++){
            System.out.println(stuArr[i].stuId+"\t"+stuArr[i].stuName+"\t"+stuArr[i].dbmsMarks+"\t"+stuArr[i].prfMarks);
          
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
            s.stuId = id;
            s.stuName = name;
            s.dbmsMarks = dbms;
            s.prfMarks = prf;
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

}

















