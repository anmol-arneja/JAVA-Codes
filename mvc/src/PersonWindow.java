import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by Admin on 2016-02-29.
 */
public class PersonWindow implements Observer {

    private Person modelPerson;
    private final JFrame mainWindow = new JFrame("MVC Window");
    private final JLabel firstNameLabel = new JLabel("First Name");
    private final JLabel lastNameLabel = new JLabel("Last Name");
    private final JTextField firstName = new JTextField();
    private final JTextField lastname = new JTextField();
    private KeyListener personChangedListener;
    private PersonController personController;

    public PersonWindow(Person person,PersonController controller){
        setModelPerson(person);
        getModelPerson().addObserver(this);
        personChangedListener = new StringChangedListener(this);
        firstName.setText(getModelPerson().getFirstName());
        lastname.setText(getModelPerson().getLastName());
        personController = controller;
        initializeWindow();

    }

    public Person getModelPerson(){
        return modelPerson;
    }

    public void setModelPerson(Person modelPerson){
        this.modelPerson = modelPerson;

    }

    public void update(Observable o, Object arg){
        firstName.setText(getModelPerson().getFirstName());
        lastname.setText(getModelPerson().getLastName());
    }

   private void initializeWindow(){
       mainWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
       mainWindow.setLayout(new GridLayout(2,2));
       firstName.addKeyListener(personChangedListener);
       lastname.addKeyListener(personChangedListener);
       mainWindow.add(firstNameLabel);
       mainWindow.add(firstName);
       mainWindow.add(lastNameLabel);
       mainWindow.add(lastname);
       mainWindow.pack();
       mainWindow.setVisible(true);
   }


    void dataHasChanged(){
        personController.updatePersonFirstName(firstName.getText());
        personController.updatePersonLastName(lastname.getText());
    }

}
