package by.teachmeskills.robot.hands;

public class SonyHand implements IHand{
    private int price = 600;
    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand()
    { System.out.println(" Руки Сони красивые");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
