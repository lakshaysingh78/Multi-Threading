class UserThread extends Thread{
    public void run(){
        System.out.println("this is user defined thread.");

    }
}
public class ThreadOp {
    public static void main(String[]args){
        System.out.println("program Started");
        int x=56+34;
        System.out.println("sum is "+ x);
        //Thread
        Thread t=Thread.currentThread();
        //get name
        String tname=t.getName();
        System.out.println("currnet running Thread is"+tname);
        //set name
        t.setName("MyMain");
        System.out.println(t.getName());
         try{Thread.sleep(5000);} 
         catch(Exception e){

         } 
         System.out.println(t.getId());
        System.out.println("program ended...");
        UserThread t1=new UserThread();
        t1.start();

    }
    
}
