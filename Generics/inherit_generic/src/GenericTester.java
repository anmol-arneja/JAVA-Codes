/**
 * Created by Admin on 2016-03-04.
 */
public class GenericTester {
    public static void main(String [] args){
        GenericBingoBallbag bingoBallbag = new GenericBingoBallbag();
        bingoBallbag.initialize();
        for (int i =0; i <=30; i++){
            System.out.println(bingoBallbag.removeRandomItem());
        }

        GenericLotteryBallBag lotteryBallBag = new GenericLotteryBallBag(49);
        lotteryBallBag.initialize();
        for (int i = 0; i<10; i++){
            System.out.println(lotteryBallBag.removeRandomItem());
        }

    }


}
