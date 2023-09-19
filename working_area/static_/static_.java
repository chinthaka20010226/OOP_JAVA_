// ---> 01) static variable(class variable / template variable)

/*class MyClass{
    int a;
  
    static int x;
}

class Demo{
    public static void main(String args[]){
         MyClass c1=new MyClass();
         c1.a=1;
         c1.x=2;

         MyClass c2=new MyClass();
         c2.a=10;
         c2.x=20;

         MyClass c3=new MyClass();
         c3.a=100;
         c3.x=200;

         MyClass.x=0;

         System.out.println("c1 : "+c1.a+" "+c1.x);
         System.out.println("c2 : "+c2.a+" "+c2.x);
         System.out.println("c3 : "+c3.a+" "+c3.x);
    }
}*/


// ---> Template Object(Class) ---> JDK


// ================================================================================================

/*class MyClass{ 
    int a;         // instance / object variable
    static int x;  // template / static variable

}

class Demo{
    public static void main(String args[]){
         Myclass.a=100; // Illegale
         MyClass.x=11;  // Legale
    } 
}*/

// ==========================================================================================

/*class MyClass{
    public void mA(){
         int a;    
         static int x;  // Illegale(local variable can't be static...)
    }
}

class Demo{
    public static void main(String args[]){

    }
}*/

 
// ---> 02) static method / template method

/*class MyClass{
    public void mA(){ }          // instance method
                                  
    public static void mB(){ }   // static method
}

class Demo{
    public static void main(String args[]){
         MyClass.mA();           // Illegale(instance method)
         MyClass.mB();           // Legale(static / template method)

         MyClass c1=new MyClass();
         c1.mA();
         c1.mB();
    }
}*/


// ---> 'NullPointException'

/*class MyClass{
    int a;
    static int x;

    public void mA(){
         System.out.println("Instance method...");
    }

    public static void mB(){
         System.out.println("Static method...");
    }
}

class Demo{
    public static void main(String args[]){
         MyClass c1=null;
         //c1.mA();        // Legale, but, run time error
         c1.mB();          // Legale, but, not run time error
    }
}*/


// ---> method calling

/*class Demo{
    public void mA(){
         System.out.println("not a static method...");
    }

    public static void mB(){
         System.out.println("a static method...");
    }

    public static void main(String args[]){
         //mA();       // Illegale
         //Demo.mA();  // Illegale
         Demo d1=new Demo();
         d1.mA();

         mB();         // Legale
         Demo.mB();
         d1.mB();
    }
}*/


// ---> main method ---> why static ???
// ---> when we compile sourse code, we can't create object for accessing 'main' method ---> 'static'
// ---> we give to our template to the JVM, which take main method in template

/*class Demo{
    public static void main(String args[]){
         
    }
}*/


// ---> 'this' for static

/*class MyClass{
    int a;
    static int x;

    public void mA(){
         System.out.println(this);   // Legale
    }

    public static void mB(){
         System.out.println(this);   // Illegale
    }
}

class Demo{
    public static void main(String args[]){
         
    }
}*/


// ---> Ohhh...my god,

/*class MyClass{
    int a;
    static int x;

    public void mA(){
         System.out.println(a);  
         System.out.println(x);    
    }

    public static void mB(){
         System.out.println(a);    // Illegale
         System.out.println(x);
    }
}

class Demo{
    public static void main(String args[]){
         //MyClass.mB();

         //MyClass c1=new MyClass();
         //c1.mB();
    }
}*/


// ---> static block

/*class MyClass{
    int a;
    static int x;

    //instance block
    {
        System.out.println("Instance  block...");
    }

    //static block
    static{
        System.out.println("Static block...");
    }

    public void mA(){
        System.out.println("Instance Method...");
    }

    public static void mB(){
        System.out.println("Static method...");
    }
}

class Demo{
    public static void main(String args[]){
         MyClass c1=new MyClass();
         MyClass c2=new MyClass();
         MyClass c3=new MyClass();
    }
}*/


// =======================================================================================================

class Date{
    static private int year; 
    static private int month;
    static private int day;

    public void setDate(int y,int m,int d){
         year=y;
         month=m;
         day=d;
    }
   
    public void printDate(){
         System.out.println(year+"-"+month+"-"+day);
    }
}

class Demo{
    public static void main(String args[]){
         Date d1=new Date();
         d1.setDate(1999,12,3);
         d1.printDate();
          
         Date d2=new Date();
         d2.setDate(2001,2,26);
         d2.printDate();

         Date d3=new Date();
         d3.setDate(2023,9,19);
         d3.printDate();
    }
}




















