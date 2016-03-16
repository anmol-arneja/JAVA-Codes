/**
 * Created by Admin on 2016-03-04.
 */
public class myRunnable implements Runnable {
    public  void run(){
        Thread currentThread = Thread.currentThread();
        try{
            Thread.sleep(10);
            for (int i=0; i<10; i++){
                System.out.println("Thread : " + currentThread.getName() + "i =" +i);
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();

        }
    }
}
