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


class MyClass{
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
}































