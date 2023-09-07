class Date{
    private int year;
    private int month;
    private int day;

    public void setDate(int y,int m,int d){
         year=y;
         month=m;
         day=d;
    }
    
    public void setYear(int y){
         year=y;
    }

    public void setMonth(int m){
         month=m;
    }

    public void setDay(int d){
         day=d;
    }
    
    public void printDate(){
         System.out.println(year+"-"+month+"-"+day);
    }
}