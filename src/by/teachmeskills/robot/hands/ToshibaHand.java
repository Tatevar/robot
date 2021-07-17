package by.teachmeskills.robot.hands;

public class ToshibaHand implements IHand{
    private int price = 800;
    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }
    @Override
    public void upHand()
    { System.out.println(" У Тошибы нет рук");

    }

    @Override
    public int getPrice() {

        return price;
    }
}
