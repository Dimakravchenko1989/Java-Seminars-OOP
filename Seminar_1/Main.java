package Seminar_1;

import Seminar_1.impl.Cat;
import Seminar_1.impl.Dog;
import Seminar_1.impl.Duck;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Animal animal = new Animal(null, null, 1);
//        System.out.println(animal.getColor());

//        Animal animal1 = new Animal("влоы");
//        System.out.println(animal1.getPawsCount());
//        Object animal3 = new Animal();

//        Cat cat1 = new Cat("Мурзик");
//        System.out.println(animal1.getType());
//        System.out.println(cat1.getType());

        Cat cat2 = new Cat("Котик");
//        cat2.speak();
//        animal1.speak();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat2);
        animals.add(new Dog("Бобик"));
        animals.add(new Duck("Дональд"));

//        animals.forEach(Animal::speak);

//        for (Animal a: animals) {
//            System.out.println(a);
//            if(a instanceof Duck) ((Duck) a).fly();
//        }

        cat2.hunt();
    }

}