package RailWorldClass;

public class Join extends Thread {
    public void run(){ 
        for(int i=1;i<5;i++){
            try{
                Thread.sleep(500);

            }
             catch(Exception e){

                System.out.println(e.getMessage());

             }
             System.out.println(i);
        }
       

    }
    public static void main(String[]args){
        Join j1=new Join();
        Join j2=new Join();
        Join j3=new Join();
        j1.start();
        try{
            j1.join();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        j2.start();
        j3.start();

    }
    
}
