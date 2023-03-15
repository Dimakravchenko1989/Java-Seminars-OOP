package Seminar_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Seminar_3.drugs.Component;
import Seminar_3.drugs.impl.CatDrug;
import Seminar_3.drugs.impl.components.Azitron;
import Seminar_3.drugs.impl.components.Pinecilin;
import Seminar_3.drugs.impl.components.Water;

public class Main {
    public static void main(String[] args) {
        List<Component> componentsCat = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));
        CatDrug drug = new CatDrug(componentsCat);
        for (Component component : drug) {
            System.out.println(component);
        }
        List<Component> componentCat2 = List.of(new Azitron("Азитрон","4",4),
                new Pinecilin("Пинецилин", "18", 6));
        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));
        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 100));
        List<Component> componentCat5 = List.of(new Water("Вода", "21", 13),
                new Azitron("Азитрон", "11", 101));
        CatDrug drug1 = new CatDrug(componentCat2);
        CatDrug drug2 = new CatDrug(componentCat3);
        CatDrug drug4 = new CatDrug(componentCat4);
        CatDrug drug5 = new CatDrug(componentCat5);

        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug);
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug4);
        drugs.add(drug5);
//        System.out.println(drugs);

        Collections.sort(drugs);
        System.out.println(drugs);
    }
}
