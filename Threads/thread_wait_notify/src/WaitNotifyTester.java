/**
 * Created by Admin on 2016-03-06.
 */
public class WaitNotifyTester {

    public static void main(String [] args){
        Diner diner = new Diner();

        WaitStaff foodServer = new WaitStaff("Give Food",diner);
        Thread foodThread = new Thread(foodServer,"Food Server");

        WaitStaff waterServer = new WaitStaff("Give Water",diner);
        Thread waterThread = new Thread(waterServer,"Water Server");

        WaitStaff drinkServer = new WaitStaff("Give Drinks",diner);
        Thread drinkThread = new Thread(drinkServer,"Drink Server");

        foodThread.start();;
        waterThread.start();
        drinkThread.start();

        diner.start();

    }
}
