package Seminar_3.drugs;

import java.util.Iterator;
import java.util.List;

import Seminar_3.NotNull;

public abstract class Drug implements Iterable<Component>, Comparable<Drug> {
    @Override
    public int compareTo(@NotNull Drug o) {
        int power = getDrugPower();
        return Integer.compare(power, o.getDrugPower());
    }

    @NotNull
    @Override
    public Iterator<Component> iterator() {
        return new Iterator<Component>() {
            public boolean hasNext() {
                return index < components.size();
            }
            public Component next() {
                return components.get(index++);
            }
        };
    }
    private List<Component> components;
    int index;

    public Drug(List<Component> component) {
        this.components = component;
        this.index = 0;
    }

    public int getDrugPower(){
        int power = 0;
        for (Component component: components) {
            power += component.getPower();
        }
        return power;
    }

    @Override
    public String toString() {
        return String.format(
                "%s {components: %s, power: %s}%n", this.getClass().getSimpleName(), components, getDrugPower()
        );
    }
}
