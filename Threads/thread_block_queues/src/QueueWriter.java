import java.util.concurrent.BlockingQueue;

/**
 * Created by Admin on 2016-03-09.
 */
public class QueueWriter extends Thread {
    private BlockingQueue<String> queue;
    public QueueWriter(BlockingQueue<String> theQueue){
        queue = theQueue;
    }
    public void run(){
        try{
            sleep(250);
        }
        catch (InterruptedException e1){
            e1.printStackTrace();
        }
        long enqueueStart;
        long enqueueEnd;
        String queueItem;
        for(int i=0; i<10; i++){
            queueItem = "Queue Entry : " +i;
            enqueueStart = System.currentTimeMillis();
            try{
                queue.put(queueItem);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            enqueueEnd = System.currentTimeMillis();
            System.out.println("Item Queued : " + queueItem + "Elapsed time for Queue = " +
                    (enqueueEnd - enqueueStart));
        }
    }
}
