/**
 * Created by Admin on 2016-03-06.
 */
public class WaitStaff implements Runnable {

    private String job;
    private Diner diner;

    public WaitStaff(String thejob, Diner theDiner){
        job = thejob;
        diner = theDiner;

    }

    public void run(){
        while (!diner.isReady()){
            synchronized (diner){
                try {
                    System.out.println(job + " : Waiting on diner");
                    diner.wait();
                    System.out.println(job + " : Diner Ready");


                }
                catch (InterruptedException e){
                    e.printStackTrace();

                }
            }
        }
        diner.recordActivity(job);
    }
}
