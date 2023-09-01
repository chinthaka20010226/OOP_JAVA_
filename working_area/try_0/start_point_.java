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


























