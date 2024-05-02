//creating our thread using runnable interface
public class MyThread implements Runnable {
    public void run()
    {
        for(int i=1;i<=10;i++){
            System.out.println( "value of i"+i);
           try{Thread.sleep(1000);}
           catch(Exception e){}
        }
    }

    public static void main(String[] args){
        MyThread t1= new MyThread();
        Thread thread= new Thread(t1);
        
      
            MyThread2 t2=new MyThread2();
            thread.start();
            t2.start();

    }
    
}
