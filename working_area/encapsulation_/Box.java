/*class Box{
     //----------- Attributes Declaration ------------
     int length;
     int width;
     int height;

     //----------- Method Declaration ----------------
     public void setSize(int l,int w,int h){
          length=l;
          width=w;
          height=h;
     }

     public void printVolume(){
          int volume=length*width*height;
          System.out.println("Volume is "+volume);
     }     
           
     public void printArea(){
          int area=2*(length*width+length*height+height*width);
          System.out.println("Area is "+area);
     }
}*/


// =============================== To Encapsulation =====================================

/*class Box{
     //----------- Attributes Declaration ------------
     private int length;
     private int width;
     private int height;

     //----------- Method Declaration ----------------
     public void setSize(int l,int w,int h){
          length=l;
          width=w;
          height=h;
     }
 
     public void setLength(int l){
          length=l;
     }

     public void setWidth(int w){
          width=w;
     }
 
     public void setHeight(int h){
          height=h;
     }

     public void printVolume(){
          int volume=length*width*height;
          System.out.println("Volume is "+volume);
     }     
           
     public void printArea(){
          int area=2*(length*width+length*height+height*width);
          System.out.println("Area is "+area);
     }
}*/


// =====================================================================================

class Box{
    private int length;
    private int width;
    private int height;
 
    public void setSize(int l,int w,int h){
         length=l;
         width=w;
         height=h;
    }

    public void printVolume(){
         System.out.println("Volume is "+findVolume());
    }
    public int findVolume(){
         return length*width*height;
    }

    public void printArea(){
         System.out.println("Area is "+findArea());
    }
    public int findArea(){
         return 2*(length*width+length*height+width*height);
    }

    public void setLength(int l){
         length=l;
    }
    public int getLength(){
         return length;
    }

    public void setWidth(int w){
         width=w;
    }
    public int getWidth(){
         return width;
    }

    public void setHeight(int h){
         height=h;
    }
    public int getHeight(){
         return height;
    }

}




















