package RailWorldClass;

public class Interupt extends Thread {
    public void run(){
        try{
            for(int i=0;i<=5;i++){
                System.out.println(i);
                Thread.sleep(500);
            }
        }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        
        }
            public static void main(String[]args){
                Interupt i1=new Interupt();
                i1.start();
                i1.interrupt();
            }
    
}
