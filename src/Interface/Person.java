package Interface;

import Interface.Coats.Coat;
import Interface.Pants.Pant;
import Interface.Shoes.Shoes;
import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.legs.ILeg;

public class Person implements IPerson {

    private Coat coat;
    private Pant pant;
    private Shoes shoes;

    public Person(Coat coat, Pant pant, Shoes shoes) {
        this.coat = coat;
        this.pant = pant;
        this.shoes = shoes;
    }

    @Override
    public void PutOnClothes() {
        coat.PutOn();
        pant.PutOn();
        shoes.PutOn();
    }

    @Override
    public void TakeOffClothes() {
        coat.TakeOff();
        pant.TakeOff();
        shoes.TakeOff();

    }
}
