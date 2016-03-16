/**
 * Created by Admin on 2016-02-29.
 */
public class PersonController {

    private Person personModel;

    public PersonController(Person person){
        setPersonModel(person);
    }

    public Person getPersonModel(){
        return personModel;
    }

    public void setPersonModel(Person personModel){
        this.personModel = personModel;
    }

    public void updatePersonFirstName(String firstName){
        getPersonModel().setFirstName(firstName);
    }

    public void updatePersonLastName(String lastName){
        getPersonModel().setlastName(lastName);

    }
}
