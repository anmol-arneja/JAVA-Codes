import java.util.Observable;

public class Person extends Observable {

    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
        //this.firstName = "ERROR DETECTED";
        this.setChanged();
        notifyObservers(this);

    }

    public String getLastName(){
        return lastName;
    }

    public void setlastName(String lastName){
        this.lastName = lastName;
        this.setChanged();
        notifyObservers(this);


    }
}
