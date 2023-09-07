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

class Demo{
    public static void main(String args[]){
         Box b1=new Box();
         
         b1.setSize(10,5,3);
        
         int vol=b1.findVolume();
         System.out.println("Volume is "+vol);

         int area=b1.findArea();
         System.out.println("Area is "+area);
    }
}






















