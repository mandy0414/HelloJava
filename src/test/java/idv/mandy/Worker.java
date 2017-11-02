package idv.mandy;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {
    // 實做Multi thread
    public static final int QK_Time = 500;
    private int id;

    public Worker(int id) {
        this.id = id;
    }

    public void run() {
        work();
    }
    //配合Mutli thread

    public void work() {
        try {
            Thread.sleep(QK_Time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Thread.sleep(QK_Time)紅色底線出來，可選擇Expection再往上丟還是try/catch

        System.out.println("Work done:" + id);
    }

    public static void main(String[] args) {
        ExecutorService es = Executors.newSingleThreadExecutor();
        //創線程池 使用fixed工巨集
        for (int i = 0; i < 100; i++) {
            es.submit(new Worker(i));
        }
        es.shutdown();
        try {
            es.awaitTermination(3000, TimeUnit.MICROSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Thread thread = new Thread(new Worker(i));
        //thread.start();
        //規定跑multi thread要start

        //Worker worker = new Worker(i);
        //worker.work();
        //依序
    }
}
