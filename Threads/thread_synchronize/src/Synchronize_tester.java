/**
 * Created by Admin on 2016-03-06.
 */
public class Synchronize_tester {
    public static void main(String [] args){
        DataAccess data = new DataAccess();
        data.setName("Preet");
        data.setAddress("Milton");

        DataAccessThreadPrinter p1 = new DataAccessThreadPrinter(data,"Bob 1");
        DataAccessThreadPrinter p2 = new DataAccessThreadPrinter(data,"John 2");
        DataAccessThreadPrinter p3 = new DataAccessThreadPrinter(data,"Jane 3");

        p1.start();
        p2.start();
        p3.start();



    }
}
