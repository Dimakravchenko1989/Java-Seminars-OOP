package Seminar_3.veterinary;

import Seminar_1.Animal;

import java.util.ArrayList;
import java.util.List;

public class VetClinic {
    private final List<Animal> animals;

    public List<Animal> getAnimals() { return animals; }

    public VetClinic addAnimal(Animal animal) {
        this.animals.add(animal);
        return this;
    }

    public VetClinic() { this.animals = new ArrayList<>(); }
}
