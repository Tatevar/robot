package by.teachmeskills.robot.legs;

public class SamsungLeg implements ILeg{
    private int price = 700;

    public SamsungLeg(int price) {
        this.price = price;
    }

    public SamsungLeg() {
    }

    @Override
    public void step()

    { System.out.println(" Ходит самсунг красиво");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
