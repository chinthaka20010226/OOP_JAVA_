// -----> Option 02(OOP object)

import java.util.*;

class Student{
    String stuId;
    String stuName;
    int dbmsMarks;
    int prfMarks;

}

class Example{
    public static void main(String args[]){
         Student s1=new Student();

         s1.stuId = "S001";
         s1.stuName = "Chinthaka";
         s1.dbmsMarks = 89;
         s1.prfMarks = 87;

         System.out.println("Student   Id : "+s1.stuId);
         System.out.println("Student Name : "+s1.stuName);
         System.out.println("Marks   dbms : "+s1.stuId);
         System.out.println("Marks    prf : "+s1.stuId);

    }

}