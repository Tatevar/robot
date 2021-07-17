package by.teachmeskills.robot.heads;

public class SamsungHead implements IHead{
    private int price = 400;
    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }
    @Override
    public  void speak()
    { System.out.println(" Samsung Голова рулит");

    }

    @Override
    public int getPrice() {

        return price;
    }
}
