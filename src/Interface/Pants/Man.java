package Interface.Pants;

public class Man implements Pant{
    @Override
    public void PutOn() {System.out.println("The Man is putting on his pant and say 'hello' ");

    }

    @Override
    public void TakeOff() {System.out.println("The Man is just taking off his pant");

    }
}
