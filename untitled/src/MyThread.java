import java.util.concurrent.Callable;

public class MyThread extends Thread{
    static int ticket;

    public  synchronized void  run (){
        while (ticket < 100){
                System.out.println(Thread.currentThread().getName()+"卖出第"+ticket+"张票");
                ticket++;
                Thread.yield();

        }
    }
}
