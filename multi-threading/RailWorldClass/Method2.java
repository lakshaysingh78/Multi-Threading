package RailWorldClass;

public class Method2 extends Thread {
    public void run(){
        System.out.println("baccha");
        System.out.println(Thread.currentThread().getPriority());

    }
    public static void main(String[]args){
        System.out.println(Thread.currentThread().getPriority());
        Method2 t1=new Method2();
        t1.setPriority(10);
        t1.start();
        }
}
