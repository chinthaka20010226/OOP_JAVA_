import java.util.*;

/*
class StudentMark{
    int dbms;
    int prf;
}

class Student{
    int code;
    String name;
    StudentMark marks;

    Student(int code,String name){
        this.code=code;
        this.name=name;
    }
}

class Demo{
    public static void main(String args[]){
        Student s1=new Student(1001,"Chinthaka");
        s1.marks=new StudentMark();
    }
}
*/


// ================================================================================================

class Student{
    int code;
    String name;
    Student next;

    Student(int code,String name){
        this.code=code;
        this.name=name;
    }
}

class Demo{
    public static void main(String args[]){
        Student s1=new Student(1001,"Prabath");
        s1.next=new Student(1002,"Chinthaka");
        s1.next.next=new Student(1003,"Senarathna");
        s1.next.next.next=s1;
    }
}






