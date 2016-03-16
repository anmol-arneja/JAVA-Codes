/**
 * Created by Admin on 2016-03-04.
 */
public class ThreadTester {
    public static void main(String [] args){
        Runnable r;
        for( int i =0; i<20; i++){
            r = new myRunnable();
            new Thread(r,"T" + i).start();
            new myThread("myThread" + i).start();
        }
        System.out.println("Main Thread has ended");
    }
}
