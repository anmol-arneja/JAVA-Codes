/**
 * Created by Admin on 2016-03-06.
 */
public class Diner extends Thread {
    private boolean ready = false;

    public boolean isReady(){
        return ready;
    }

    public void recordActivity(String activity){
        System.out.println(activity);
        try {
            sleep(100);

        }

        catch (InterruptedException e){
            e.printStackTrace();
        }
    }


    public void run(){
        for(int i = 0; i<3; i++){
            ready = false;
            try {
                sleep(100);

            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            ready = true;
            synchronized (this){
                notify();
            }
        }

    }

}
