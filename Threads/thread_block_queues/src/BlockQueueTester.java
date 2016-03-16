import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Admin on 2016-03-09.
 */
public class BlockQueueTester {
    public static void main(String[] args){
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
        QueueReader reader = new QueueReader(queue);
        QueueWriter writer = new QueueWriter(queue);

        reader.start();
        writer.start();
    }
}
