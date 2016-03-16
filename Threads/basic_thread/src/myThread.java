/**
 * Created by Admin on 2016-03-04.
 */
public class myThread extends Thread {

    public myThread(){
        this("Thread." + System.currentTimeMillis());
    }
    public myThread(String name){
        super(name);
    }
    public void run(){
        Thread currentThread = Thread.currentThread();
        System.out.println(currentThread.getName());
        try {
            Thread.sleep(10);
            for (int i =0; i<10; i++){
                System.out.println("MyThread : " + currentThread.getName() +"i" +i);
            }


        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
