package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price = 900;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public void step()  {
        System.out.println("Sony ходит акуратно");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
