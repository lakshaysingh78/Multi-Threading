package RailWorldClass;

public class YeildThread extends Thread {
    public void run(){
        for(int i =1;i<3;i++){
            System.out.println(Thread.currentThread().getName()+"my thread");
        }
    }
    public static void main(String[]args){
        YeildThread y1=new YeildThread();
        YeildThread y2=new YeildThread();
y1.start();
y2.start();
for(int i=1;i<3;i++){
    y1.yield();
    System.out.println(Thread.currentThread().getName()+"my thread");
}
    }
}
