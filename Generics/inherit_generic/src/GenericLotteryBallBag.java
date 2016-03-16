/**
 * Created by Admin on 2016-03-04.
 */
public class GenericLotteryBallBag extends AbstractBag<LotteryBall> {

    int maxNumber;

    public GenericLotteryBallBag(int maxNumber){
        this.maxNumber = maxNumber;


    }

    public void initialize(){
        for (int i = 1; i <= this.maxNumber; i++){
            getT().add(new LotteryBall(i));
        }


    }
}
