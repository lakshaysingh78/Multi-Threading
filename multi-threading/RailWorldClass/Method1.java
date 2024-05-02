package RailWorldClass;

public class Method1 extends Thread{
    public void run(){
        System.out.println("this is son of his parent");
    }
    public static void main(String[]args){
        System.out.println("this is the father of upper function");
        Method1 t1=new Method1();
       // t1.run();
       t1.setDaemon(false);
       t1.start();
      
        
    }
    
}
