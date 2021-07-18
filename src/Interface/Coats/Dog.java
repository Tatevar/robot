package Interface.Coats;


public class Dog implements Coat {
    @Override
    public void PutOn() { System.out.println("The dog put on his coat ");

    }

    @Override
    public void TakeOff() {System.out.println("The dog take off  his coat smoothly ");

    }
}
