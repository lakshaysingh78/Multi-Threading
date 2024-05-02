package RailWorldClass;


public class Method extends Thread {
    public void run(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Thread task");
        System.out.println(Thread.currentThread().getName());    
    
}
public void run1(){
    System.out.println(Thread.currentThread().getName());
    System.out.println("Thread task again");


}
public static void main(String[] args){
    Method m1=new Method();
    m1.start();
    m1.run1();
    System.out.println(Thread.currentThread().getName());
}
}
