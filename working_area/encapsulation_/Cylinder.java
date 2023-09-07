class Cylinder{
     private double length;
     private double radius;

     public void setSize(double l,double r){
          length=l;
          radius=r;
     }
 
     public void printVolume(){
          double volume=Math.PI*radius*radius*length;
          System.out.println("Volume is "+volume);
     }

     public void printArea(){
          double area=2*Math.PI*radius*radius+2*Math.PI*radius*length;
          System.out.println("Area is "+area);
     }

}