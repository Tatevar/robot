package Inerface3;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean preStart() {
        Random random = new Random();
        int number = random.nextInt(10);
        if (number > 3) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void launchEngines() {
        System.out.println("«Двигатели Шатла запущены.Все системы в норме.»");

    }

    @Override
    public void start() {
        System.out.println("«Старт Шатла»");

    }

    public void LaunchShuttle(IStart item) {
        if (item.preStart() == false) {
            System.out.println("Запуск не удался");
        } else {
            item.launchEngines();

            for (int i = 10; i >= 0; i--) {
                System.out.print(i + " ");
            }

            System.out.println();
            item.start();
        }
    }
}

/*Создаем класс Шатл. Шатл реализует интерфейс IStart.
• В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет не
успешно.
• В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены.
Все системы в норме.»
• В методе старт выводим строку в консоль. «Старт Шатла»
По аналогии создайте еще пару классов реализующих интерфейс Istart(например SpaceX).
Для предстартовой проверки можете придумать совою логику, главное что бы метод
возвращал true либо false в зависимости от того прошла ли она успешно.
 Запустите в космос созданные вами космические корабли используя созданный вами
космодром и его метод старт.

 */