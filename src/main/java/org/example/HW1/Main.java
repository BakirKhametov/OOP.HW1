package org.example.HW1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HotDrinksVM vm = new HotDrinksVM();
        List<HotDrinks> hd = new ArrayList<>(Arrays.asList(new HotDrinks("tea", 1, 60),
                new HotDrinks("coffee", 2, 70),new HotDrinks("cocoa", 1, 65),
                new HotDrinks("milk", 2, 40)));
        vm.initDrinks(hd);
        System.out.println(vm.getProduct("cocoa", 2, 65));
    }
}
