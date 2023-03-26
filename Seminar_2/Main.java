package Seminar_2;

import Seminar_1.Flyable;
import Seminar_1.Illable;
import Seminar_1.impl.Cat;
import Seminar_1.impl.Dog;
import Seminar_1.impl.Duck;
import Seminar_1.Animal;
import Seminar_1.impl.Eagle;
import Seminar_3.veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мјрзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"));

//        for (Animal a:
//             vetClinic.getAnimals()) {
//               a.getIll();
//        }

        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("Барјик"));
        illables.add(new Human());

        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle());
        flyables.add(new Duck("Donald"));

        for (Flyable f:
             flyables) {
            System.out.println(f.getFlightSpeed());
        }

        Animal.getAnimalsCount();
    }
}
