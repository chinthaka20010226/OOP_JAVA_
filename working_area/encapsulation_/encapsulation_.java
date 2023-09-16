import javax.swing.*;

/*class Demo{
    public static void main(String args[]){
         JFrame f1=new JFrame();
         f1.setSize(300,300);
         f1.setTitle("Calculator");
         f1.setDefaultCloseOperation(3);
         f1.setVisible(true);
    }
}*/


// ============================================================================================

/*class Demo{
    public static void main(String args[]){
         int length;
         int width;
         int height;

         length=10;
         width=5;
         height=7;

         int volume=length*width*height;
         System.out.println("Volume is "+volume);

         int are=length*width;
          

    }
}*/

// -------------------------------------------

/*class Demo{
    public static void main(String args[]){
         //int length;
         //int width;
         //int height;
         Box b1=new Box();

         //length=10;
         //width=5;
         //height=7;
         b1.setSize(10,5,7);

         //int volume=length*width*height;
         //System.out.println("Volume is "+volume);
         b1.printVolume();

         //int are=2(length*width+length*height+height*width);
         //System.out.println("Area is "+area);
         b1.printArea();

    }
}*/


// ----------------------------------------------------------------------------


/*class Demo{
    public static void main(String args[]){
         Box b1=new Box();
 
         b1.setSize(10,5,7);

         b1.printVolume();

         b1.printArea();

    }
}*/


// ==============================================================================================

/*class Demo{
    public static void main(String args[]){
         Box b1=new Box();
 
         b1.setSize(10,5,7);

         b1.printVolume();
         b1.printArea();

         //b1.length=10;  // ---> Illegal ---> private access
         //b1.width=5;    // ---> Illegal ---> privete access
         //b1.height=7;   // ---> Illegal ---> private access

         b1.setLength(11);
         b1.setWidth(3);
         b1.setHeight(7);

         b1.printVolume();
         b1.printArea();

    }
}*/


// ===============================================================================================

/*class Demo{
    public static void main(String args[]){
         Cylinder c1=new Cylinder();

         c1.setSize(12.5,2.5);
         c1.printVolume();
         c1.printArea();
    }
}*/


// ================================================================================================

/*class Demo{
    public static void main(String args[]){
         Date d1=new Date();
         
         d1.setDate(1999,12,26);
         d1.printDate();

         //d1.year=2001;
         d1.setYear(2001);
         d1.setMonth(02);
         d1.setDay(26);
         d1.printDate();

    }
}*/


// ================================================================================================

/*class Demo{
    public static void main(String args[]){
         Box b1=new Box();
         
         b1.setSize(10,5,3);
        
         b1.printVolume();
         int vol=b1.findVolume();
         System.out.println("Volume is "+vol);

         b1.printArea();
         int area=b1.findArea();
         System.out.println("Area is "+area);

         b1.setLength(11);
         b1.setWidth(7);
         b1.setHeight(5);
         System.out.println("Length is "+b1.getLength()+"\n"+
                            "Width is "+b1.getWidth()+"\n"+
                            "Height is "+b1.getHeight());
    }
}*/


// ======================================================================================================

// ----> Case 01

/*class Box{
    int length;
    int width;
    int height;
}

class Demo{
    public static void main(String args[]){
         Box b1;        //Create a refference variable type 'Box'       ===> int[] arr,
         b1=new Box();  //Create an object and assign the address to b1 ===> arr=new int[];
         b1.length=12;  //Access the propertice
    }
}*/


// ----> Case 02

/*class Box{
    int length;
    int width;
    int height;

    public void printVolume(){
         int volume;                              //local variable
         volume = length*width*height;            //find 'length','width','height' in this method,
         System.out.println("Volume is "+volume);
    }

}

class Demo{
    public static void main(String args[]){
         Box b1;
         b1=new Box();
         b1.length=12;
         b1.width=5;
         b1.height=3;
         b1.printVolume();
    }   

}*/


// ----> Case 03(parameterized method)

/*class Box{
    int length;
    int width;
    int height;

    public void setSize(int l,int w,int h){
         length=l;
         width=w;
         height=h;
    }

    public void printVolume(){
         int volume;
         volume=length*width*height;
         System.out.println("Volume is "+volume);
    }
}

class Demo{
    public static void main(String args[]){
         Box b1=new Box();
         
         b1.setSize(12,5,3);

         b1.printVolume();
    }
}*/


// ----> Case 04(return type method)

/*class Box{
    int length;
    int width;
    int height;

    public void setSize(int l,int w,int h){
         length=l;
         width=w;
         height=h;
    }

    public int getVolume(){
         int volume;
         volume=length*width*height;
         return volume;
    }
}

class Demo{
    public static void main(String args[]){
         Box b1=new Box();
         
         b1.setSize(12,5,3);

         int vol = b1.getVolume();
         System.out.println("Volume is "+vol);
    }
}*/


// ----> Case 05(Default value)

/*class Box{
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;
     
    String s;
    int[] xr;
    Date d1;
    Box b_;

}

class Demo{
    public static void main(String args[]){
         Box b1=new Box();

         System.out.println("byte :"+b1.a);       //0
         System.out.println("short :"+b1.b);      //0
         System.out.println("int :"+b1.c);        //0
         System.out.println("long :"+b1.d);       //0
         System.out.println("float :"+b1.e);      //0.0
         System.out.println("double :"+b1.f);     //0.0
         System.out.println("char :"+b1.g);       //
         System.out.println("boolean :"+b1.h);    //false
         System.out.println("String :"+b1.s);     //null
         System.out.println("int[] xr :"+b1.xr);  //null
         System.out.println("Date :"+b1.d1);      //null
         System.out.println("Box :"+b1.b_);       //null

    }
}*/


// ----> Case 06(keyword 'this')

/*class Box{
    int length;
    int width;
    int height;

    public void setSize(int length,int width,int height){
         length=length;
         width=width;
         height=height;
    }

    public void printVolume(){
         int volume;
         volume = length*width*height;
         System.out.println("Volume is "+volume);
    }
}

class Demo{
    public static void main(String args[]){
         Box b1=new Box();

         b1.setSize(12,5,3);
         b1.printVolume();

    }
}*/



/*class MyClass{
    int a;

    public void myMethod(){
         System.out.println(this);
    } 

}

class Demo{
    public static void main(String args[]){
         MyClass m1=new MyClass();
         System.out.println(m1);
         m1.myMethod();

    }
}*/



/*class Box{
    int length;
    int width;
    int height;

    public void setSize(int length,int width,int height){
         this.length=length;
         this.width=width;
         this.height=height;
    }

    public void printVolume(){
         int volume;
         volume = this.length*this.width*this.height;
         System.out.println("Volume is "+volume);
    }
}

class Demo{
    public static void main(String args[]){
         Box b1=new Box();

         b1.setSize(12,5,3);
         b1.printVolume();

    }
}*/


// ----> Case 07(null Referencing)

/*class Box{
    int length;
    int width;
    int height;

    public void setSize(int length,int width,int height){
         this.length=length;
         this.width=width;
         this.height=height;
    }

    public void printVolume(){
         int volume;
         volume = this.length*this.width*this.height;
         System.out.println("Volume is "+volume);
    }
}

class Demo{
    public static void main(String args[]){
         //Box b2=new Box();

         Box b2=null;

         b2.length=12;
         b2.width=5;
         b2.height=3;
         //b2.x;

         b2.printVolume();
         b2.setSize(12,5,3);
         //b2.copy();      
    }
}*/


// ----> Case 08

/*class Cat{

}

class Dog{

}

class Demo{
    public static void main(String args[]){
         Cat c1=new Cat();
         Dog d1=new Dog();

         //c1=d1;
         //d1=c1;

         Cat c2=new Dog();
         Dog d2=new Cat();
    }
}*/


// ----> Case 09(passing Object to method)

/*class Box{
    int length;
    int width;
    int height;

    public void setSize(int length,int width,int height){
         this.length=length;
         this.width=width;
         this.height=height;
    }
  
    public void printVolume(){
         System.out.println("Volume is "+(this.length*this.width*this.height));
    }

    public void copyValuesFrom(Box b){
         this.length=b.length;
         this.width=b.width;
         this.height=b.height;
    }
}

class Demo{
    public static void main(String args[]){
         Box b1=new Box();
         b1.setSize(12,5,3);
         b1.printVolume();
 
         Box b2=new Box();
         b2.copyValuesFrom(b1);
         b2.printVolume();

    }
}*/


// ----> Case 10(return object)

/*class Date{
    private int year;
    private int month;
    private int day;

    public void setDate(int year,int month,int day){
         this.year=year;
         this.month=month;
         this.day=day;
    }

    public void printDate(){
         System.out.println(this.year+"-"+this.month+"-"+this.day);
    }

    public void setYear(int year){
         this.year=year;
    }

    public void setMonth(int month){
         this.month=month;
    }

    public void setDay(int day){
         this.day=day;
    }

    public Date getCopy(){
         Date d=new Date();
         d.setDate(this.year,this.month,this.day);
         //d.year=this.year;
         //d.month=this.month;
         //d.day=this.day;
         return d;
    }

}

class Demo{
    public static void main(String args[]){
         Date d1=new Date();
         d1.setDate(2001,02,26);
         d1.printDate();
         System.out.println(d1);

         Date d2=d1.getCopy();
         d2.printDate();
         System.out.println(d2);
    }    

}*/


// ===============================================================================================================

// ----> Object Initialization(Constructor)

/*class Box{
    int length;
    int width;
    int height;

    //compiler insert,
    public Box(){       //class name, No return type,
         length=0;
         width=0;
         height=0;
    }
}

class Demo{
    public static void main(String args[]){
         Box b1=new Box(); // ---> "Box()"

    }
}*/


// ----> Case 01(Default Constructor)

/*class Box{
    int length;
    int width;
    int height;

    //we create default constructor
    public Box(){
        length=1;
        width=1;
        height=1;
    }
}

class Demo{
    public static void main(String []args){
         Box b1=new Box();
    }
}*/


// ----> Case 02(Parameterize Constructor)

/*class Box{
    int length;
    int width;
    int height;

    public Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
}

class Demo{
    public static void main(String []args){
         Box b1=new Box(10,5,3);
    }
}*/


// ----> Case 03(Constructor Overloading)

/*class Box{
    int length;
    int width;
    int height;

    public Box(){
        length=0;
        width=0;
        height=0;
    }

    public Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }

    public Box(int x){
        length=x;
        width=x;
        height=x;
    }
}

class Demo{
    public static void main(String []args){
         Box b1=new Box();
         Box b2=new Box(10,5,3);
         Box b3=new Box(3);
    }
}*/


// ---->Case 04(Illegale Calling)

/*class Box{
    int length;
    int width;
    int height;

    public Box(){
        length=0;
        width=0;
        height=0;
    }

    public Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }
}

class Demo{
    public static void main(String []args){
         Box b1=new Box(10,5,3);

         b1.Box(); //think a littel bit,
    }
}*/


// ---->Case 05(Constructor ---> Method)

/*class Box{
    int length;
    int width;
    int height;

    public void Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }

    public void printValue(){
         System.out.println("length : "+this.length+"\n"+"width : "+this.width+"\n"+"heigth : "+this.height);
    }
}

class Demo{
    public static void main(String []args){
         //Box b1=new Box(10,5,3); //Now, Not a Constructor, it has 'void' return type
         Box b1=new Box();
         b1.Box(10,5,3);
         b1.printValue();
    }
}*/


// ----> Case 06(If we create default OR parameterize constructor, 
//               compiler not add default constructor)
 

/*class Box{
    int length;
    int width;
    int height;

    public Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
    }

    public void printValue(){
         System.out.println("length : "+this.length+"\n"+"width : "+this.width+"\n"+"heigth : "+this.height);
    }
}

class Demo{
    public static void main(String []args){
         //Box b1=new Box(); //Illegale ---> compiler not add default constructor

         b1.printValue();
   
    }
}*/


// ---->Case 07(Calling to the constructor in another constructor)

/*class Box{
    int length;
    int width;
    int height;

    public Box(int l,int w,int h){
        length=l;
        width=w;
        height=h;
        System.out.println("Box(int,int,int)");
    }

    public Box(int x){
        //length=x;
        //width=x;
        //height=x;
        
        //Box(x,x,x);  //Illegale
        //System.out.println("Box(int)");  //Illegale

        this(x,x,x);
        System.out.println("Box(int)");  //Legale
    }

    public Box(){
        //length=1;
        //width=1;
        //height=1;

        //Box(1);  //Illegale
        //System.out.println("Box()");  //Illegale

        this(1); 
        System.out.println("Box()");    //Legale       
    }

    public void printValue(){
         System.out.println("length : "+this.length+"\n"+"width : "+this.width+"\n"+"heigth : "+this.height);
    }
}

class Demo{
    public static void main(String []args){
         Box b1=new Box();
         b1.printValue();
    }
}*/


// ---->Case 08(Declaration Value)

/*class Box{
    int length=10;
    int width=5;
    int height;
    
    //Compiler Insert
    //Box(){
    //    length=l;
    //    width=w;
    //    height=h;
    //}

    public void printValue(){
         System.out.println("length : "+this.length+"\n"+"width : "+this.width+"\n"+"heigth : "+this.height);
    }
}

class Demo{
    public static void main(String []args){
         Box b1=new Box();

         b1.printValue();
   
    }
}*/


/*class A{
    int a=10;
    int b=5;
    int c;

    A(){

    }

    A(int i,int j,int k){
        a=i;
        b=j;
        c=k;
    }

}

class Demo{
    public static void main(String args[]){
         A b1=new A();
         System.out.println("b1 : "+b1.a+" "+b1.b+" "+b1.c);

         A b2=new A(100,50,20);
         System.out.println("b2 : "+b2.a+" "+b2.b+" "+b2.c);
 
    }
}*/


// ---->Case 09(Instance Block)

























