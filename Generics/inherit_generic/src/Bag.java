import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Admin on 2016-03-01.
 */
public class Bag<T> {
    private List<T> t = new ArrayList<>();

    public Bag(){

    }
     public Bag(T firstEntry){
         t.add(firstEntry);
     }

    public <U> Bag(T firstEntry, U item){
        t.add(firstEntry);
        System.out.println(item);

    }

    protected List<T> getT(){
        //System.out.println(t);
        return t;

    }

    public void add(T newT){
        t.add(newT);
    }


    public T removeRandomItem(){
        T item = null;
        if (getT().size() > 0){
            int randomNumber = (int) (Math.random() * getT().size());
          //  System.out.println(randomNumber);
            item = getT().remove(randomNumber);
        }
        return item;
    }

    public static <U> void printBagContents(Collection<Bag<U>> bagCollection){
        int bagCounter = 1;
        for (Bag<U> bag : bagCollection){
            System.out.println("Bag " + bagCounter);
            for (U item : bag.getT()){
                System.out.println("item : " + item.toString() + "  ");

            }
            System.out.println();
            bagCounter++;

        }
    }

}
