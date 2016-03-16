import java.util.concurrent.BlockingQueue;

/**
 * Created by Admin on 2016-03-10.
 */
public class QueueReader extends Thread{
    private BlockingQueue<String> queue;

    public QueueReader(BlockingQueue<String> theQueue){
        queue = theQueue;
    }

    public void run(){
        try {
            sleep(50);
        }catch (InterruptedException e1){
            e1.printStackTrace();
        }
        long dequeueStart;
        long dequeueEnd;
        String queueItem = null;
        for(int i = 0; i<10; i++){
            dequeueStart = System.currentTimeMillis();
            try {
                queueItem = queue.take();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            dequeueEnd = System.currentTimeMillis();
            System.out.println("Item Dequeued: " + queueItem + "Elapsed Time for Dequeue = " +
            + (dequeueEnd - dequeueStart));
            try {
                sleep(50);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
