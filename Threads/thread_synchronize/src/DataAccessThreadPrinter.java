import java.util.Stack;

/**
 * Created by Admin on 2016-03-06.
 */
public class DataAccessThreadPrinter extends Thread{

    private DataAccess data;
    private String name;
    private String address;

    public DataAccessThreadPrinter(DataAccess newData,String threadName){
        super(threadName);
        System.out.println(newData);
        data = newData;
        name = threadName;
        address = threadName + "Address";
    }

    public void run(){
        try {
            synchronized (data) {
                this.sleep(1000);
                data.longRunningMethod(name, address);
            }
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }





}
