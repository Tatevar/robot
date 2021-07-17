package by.teachmeskills.robot.legs;

public class ToshibaLeg implements ILeg{
    private int price = 200;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public void step()
    { System.out.println("Тошиба ходит медленно");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
