/**
 * Created by Admin on 2016-02-29.
 */


public class mvc {
    public final static void main (String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                runWindow();
            }
        });
    }

    private static void runWindow(){
        Person person = new Person();
        person.setFirstName("Preet");
        person.setlastName("Arneja");

        PersonController controller = new PersonController(person);
        PersonWindow window = new PersonWindow(person, controller);
        PersonWindow window2 = new PersonWindow(person,controller);


    }
}

