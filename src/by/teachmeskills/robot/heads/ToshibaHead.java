package by.teachmeskills.robot.heads;

public class ToshibaHead implements IHead {
    private int price = 100;
    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.print(" Голова Тошиба на месте");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
