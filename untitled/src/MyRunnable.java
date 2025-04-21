public class MyRunnable implements Runnable{
    int ticket;

    @Override
    public  void run() {
        while (ticket < 100){
            method1();
        }
    }

    synchronized void method1(){
        System.out.println(Thread.currentThread().getName()+"卖出第"+ticket+"张票");
        ticket++;
    }
}
