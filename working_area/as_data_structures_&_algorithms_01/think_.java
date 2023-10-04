
/*class Student{
    int code;
    String name;
  
}

class Demo{
    public static void main(String args[]){
         Student s1;
         System.out.println(s1);
    }
}*/


// ====================================================================================================

/*class StudentMarks{
    int dbms;
    int prf;
}

class Student{
    int code;
    String name;
    StudentMarks marks;

    Student(int code,String name){
       this.code=code;
       this.name=name;
    }
}

class Demo{
    public static void main(String args[]){
         Student s1=new Student(214189,"Danapala");

         System.out.println("code : "+s1.code);
         System.out.println("name : "+s1.name);
         System.out.println("marks : "+s1.marks);
    }
}*/


// ===============================================================================================

class StudentMarks{
    int dbms;
    int prf;

    StudentMarks(int dbms,int prf){
       this.dbms=dbms;
       this.prf=prf;
    }
}

class Student{
    int code;
    String name;
    StudentMarks mark;

    Student(int code,String name,StudentMarks mark){
       this.code=code;
       this.name=name;
       this.mark=mark;
    }    
}

class Demo{
    public static void main(String args[]){
        Student s1=new Student(1001,"Danapala",new StudentMarks(70,80));

        System.out.println("code : "+s1.code);
        System.out.println("name : "+s1.name);
        System.out.println("dbms : "+s1.mark.dbms);
        System.out.println("prf : "+s1.mark.prf);
    }
}




















