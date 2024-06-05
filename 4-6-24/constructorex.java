class rectangle{
    public int length, breadth, area;


    rectangle(int length, int breadth){     
        this.length=length;
        this.breadth=breadth;
    }


    void calarea(){
        area=length*breadth;
        System.out.println("The area of the rectangle is :"+ area);
    }
}

public class constructorex {
    public static void main(String[] args){
       
       rectangle rect=new rectangle(12,5);
        
        rect.calarea();
    }
}
