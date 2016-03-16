/**
 * Created by Admin on 2016-03-01.
 */
public class BingoBall {
    private String letter;
    private int number;

    public BingoBall(){

    }

    public BingoBall(String newLetter, int newNumber ){
        letter = newLetter;
        number = newNumber;
    }

    public String toString(){
        return letter + ":" + number;
    }

    public String getLetter(){
        return letter;
    }

    public void setLetter(String letter){
        this.letter = letter;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
}
