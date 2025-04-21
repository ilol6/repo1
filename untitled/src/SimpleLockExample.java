import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SimpleLockExample {
    // 创建一个 ReentrantLock 对象
    private final Lock lock = new ReentrantLock();

    public void performAction() {
        // 获取锁
        lock.lock();
        try {
            // 受保护的代码块
            System.out.println("Accessing shared resource");
        } finally {
            // 释放锁
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        SimpleLockExample example = new SimpleLockExample();
        
        // 启动线程来演示锁的使用
        new Thread(example::performAction).start();
        new Thread(example::performAction).start();
    }
}