package Seminar_4;

import Seminar_4.gb.GBList;
import Seminar_4.gb.list.GBArrayList;

public class Main {
    public static void main(String[] args) {
        GBList<Integer> gbList = new GBArrayList<>();
        gbList.add(2);
        gbList.add(1);
        gbList.add(3);
        // System.out.println(gbList.size());
        // System.out.println(gbList.get(0));
        gbList.remove(2);
        
        for (Integer integer : gbList) {
            System.out.print(integer + " ");
        }
    }
}