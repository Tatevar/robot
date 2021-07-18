package Interface.Pants;

public class Woman implements Pant {
    @Override
    public void PutOn() { System.out.println("Woman is putting on her pant and say 'It's mine'");

    }

    @Override
    public void TakeOff() {  System.out.println("Woman is taking off her pant");

    }
}
