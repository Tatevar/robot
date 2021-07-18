/*
2)
По аналогии с первым задание делаем след. задание. Интерфейсы:
- Куртка
- Штаны
- Обувь
в каждом интерфейсе есть 2 метода (надеть и снять)
Делаем несколько реализации каждого интерфейса. Создаём класс человек:
У человека поля:
-имя
-куртка -штаны -обувь
У человека есть 2 метода:
- одеться(вызываются методы надетьдеть у всех вещей) - раздеться (вызываются методы снять у всех вещей)
 */
package Interface;

import Interface.Coats.Cat;
import Interface.Coats.Coat;
import Interface.Coats.Cow;
import Interface.Coats.Dog;
import Interface.Pants.Man;
import Interface.Pants.Pant;
import Interface.Pants.Someone;
import Interface.Pants.Woman;
import Interface.Shoes.Anyone;
import Interface.Shoes.Boy;
import Interface.Shoes.GIrl;
import Interface.Shoes.Shoes;

public class Run {
    public static void main(String[] args){
        Coat coat = new Cat();
        Coat coat1 = new Dog();
        Coat coat2 = new Cow();

        Shoes shoes = new Boy();
        Shoes shoes1 = new GIrl();
        Shoes shoes2 = new Anyone();

        Pant pant = new Man();
        Pant pant1 = new Woman();
        Pant pant2 = new Someone();

        Person person = new Person(coat,pant,shoes);
        person.PutOnClothes();
        System.out.println("*************");
        person.TakeOffClothes();
        System.out.println("*************");

        Person person1 = new Person(coat1,pant1,shoes1);
        person1.PutOnClothes();
        System.out.println("*************");
        person1.TakeOffClothes();
        System.out.println("*************");

        Person person2 = new Person(coat2,pant2,shoes2);
        person2.PutOnClothes();
        System.out.println("*************");
        person2.TakeOffClothes();
    }
}
