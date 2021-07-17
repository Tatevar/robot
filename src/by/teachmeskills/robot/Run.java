package by.teachmeskills.robot;

import by.teachmeskills.robot.hands.IHand;
import by.teachmeskills.robot.hands.SamsungHand;
import by.teachmeskills.robot.hands.SonyHand;
import by.teachmeskills.robot.heads.IHead;
import by.teachmeskills.robot.heads.SamsungHead;
import by.teachmeskills.robot.heads.SonyHead;
import by.teachmeskills.robot.heads.ToshibaHead;
import by.teachmeskills.robot.legs.ILeg;
import by.teachmeskills.robot.legs.SamsungLeg;
import by.teachmeskills.robot.legs.SonyLeg;
import by.teachmeskills.robot.legs.ToshibaLeg;

public  class Run {
    public static void main(String[] args) {
        ILeg leg = new SamsungLeg();
        IHand hand = new SonyHand();
        IHead head = new ToshibaHead();

        Robot robot1 = new Robot(head, hand, leg);
        robot1.action();
        robot1.getPrice();
       System.out.println("++++++");

        ILeg leg2 = new SonyLeg();
        IHand hand2 = new SamsungHand();
        IHead head2 = new ToshibaHead();

        Robot robot2 = new Robot(head2, hand2, leg2);
        robot2.action();
        robot2.getPrice();
        System.out.println("++++++");

        ILeg leg3 = new ToshibaLeg();
        IHand hand3 = new SonyHand();
        IHead head3 = new SamsungHead();

        Robot robot3 = new Robot(head3, hand3, leg3);
        robot3.action();
        robot3.getPrice();
        System.out.println("++++++");
        Robot[] robots = {robot1, robot2, robot3};

        int maxPrice = 0;

        for (Robot item : robots) {

            if (item.getPrice() > maxPrice) {
                maxPrice = item.getPrice();
            }

        }


        System.out.println("Самый доргой робот стоит- " + maxPrice);
        }
    }


        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов найдите самого дорогого.
        */



