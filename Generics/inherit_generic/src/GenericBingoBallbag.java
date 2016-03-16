/**
 * Created by Admin on 2016-03-04.
 */
public class GenericBingoBallbag extends AbstractBag<BingoBall> {


    public void initialize(){
        for (int i = 1;i <= 15; i++){
            getT().add(new BingoBall("B",i));
        }
        for (int i = 16; i <= 30; i++){
            getT().add(new BingoBall("I",i));
        }
        for (int i = 31; i <= 45; i++){
            getT().add(new BingoBall("N",i));
        }
        for(int i = 46; i <= 60; i++){
            getT().add(new BingoBall("G",i));
        }
        for (int i = 61; i <= 75; i++){
            getT().add(new BingoBall("O",i));
        }
    }
}
