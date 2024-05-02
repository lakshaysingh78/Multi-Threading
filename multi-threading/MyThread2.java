//creating thread using Thread class
public class MyThread2 extends Thread {
    public void run(){
        for(int i=10; i>=1;i--){
            System.out.println("another thread"+i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){
                
            }
        }

    }
    public static void main(String[]args){
        MyThread2 t2=new MyThread2();
        t2.start();
    }
    
}
