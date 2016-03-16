/**
 * Created by Admin on 2016-03-06.
 */
public class DataAccess {
    private String name;
    private String address;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void longRunningMethod(String newName, String newAddress){
        Thread thisThread = Thread.currentThread();
        setName(newName);
        setAddress(newAddress);
        System.out.println("Thread : " + thisThread.getName() + "Name = " +getName() + "Address : " + getAddress());

        try {
            {
                thisThread.sleep(100);

            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Thread : " + thisThread.getName() + "Name = " +getName() + "Address : " + getAddress());

    }
}
