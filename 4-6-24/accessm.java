// access modifiers- public,private,protected
//non-access modifiers- static,final, abstract

class value{
    public int x=100;
    private int y=200;
    private static int q = 0;

    private static void increment(){
        q++;
    }

    /*void data(){
        private int q= 50;
    }*/
    void show(){
        System.out.println("the value of x:"+x);
        System.out.println("the value of y:"+y);
        value.increment();
        System.out.println("The value of q:"+ q);
    }

}

public class accessm {
    public static void main(String[] args) {
        value obj = new value();
        obj.show();
        
    }
}
