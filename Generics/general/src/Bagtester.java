import java.util.ArrayList;
import java.util.List;

/**
 * Created by Admin on 2016-03-01.
 */
public class Bagtester {
    public final static void main(String[] args){
        Bag<BingoBall> bingoBag = new Bag<>();
        bingoBag.add(new BingoBall("B",1));
        bingoBag.add(new BingoBall("B",2));
        //System.out.println(bingoBag);
        //System.out.println(bingoBag.removeRandomItem());
        //System.out.println(bingoBag.removeRandomItem());

        Bag<LotteryBall> bag2 = new Bag<>();
        bag2.add(new LotteryBall(1));
        bag2.add(new LotteryBall(2));
        System.out.println(bag2.removeRandomItem());
        System.out.println(bag2.removeRandomItem());

        Bag<BingoBall> bingoBag1 = new Bag<>(new BingoBall("O",75));
        bingoBag1.add(new BingoBall("I",16));
        bingoBag1.add(new BingoBall("T",12));
        bingoBag1.add(new BingoBall("O",19));

        Bag<BingoBall> bingoBag2 = new Bag<>(new BingoBall("P",12),"First Entry");
        bingoBag2.add(new BingoBall("Z",19));
        bingoBag2.add(new BingoBall("K",17));
        bingoBag2.add(new BingoBall("G",2));

        List<Bag<BingoBall>> bagList = new ArrayList<>();
        bagList.add(bingoBag);
        bagList.add(bingoBag1);
        bagList.add(bingoBag2);

        Bag.printBagContents(bagList);



    }
}
