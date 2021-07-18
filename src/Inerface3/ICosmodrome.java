package Inerface3;

import java.util.Random;

public class ICosmodrome implements IStart {
    @Override
    public boolean preStart() {
        Random randon = new Random();
        int number = randon.nextInt(10);
        if (number > 5) {
            return true;
        } else {
            return false;
        }

    }


    @Override
    public void launchEngines() { System.out.println("Двигатели запущены");


    }

    @Override
    public void start() { System.out.println("Запуск...");

    }
}
