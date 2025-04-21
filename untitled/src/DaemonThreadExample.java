public class DaemonThreadExample {

    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
            while (true) {
                System.out.println("Daemon thread is running...");
                try {
                    Thread.sleep(1000); // 每秒打印一次信息
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        daemonThread.setDaemon(true); // 将线程设置为守护线程
        daemonThread.start(); // 启动守护线程

        try {
            Thread.sleep(5000); // 主线程休眠5秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread is ending.");
    }
}