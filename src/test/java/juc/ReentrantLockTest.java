package juc;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        try {
            lock.lock();
        } finally {
            lock.unlock();
        }
    }
}
