package org.example.HW1;

import java.util.ArrayList;
import java.util.List;

public  class HotDrinksVM extends VendingMachine{

    List<HotDrinks> hotDrinks = new ArrayList<>();

    void initDrinks(List<HotDrinks> drinks) {
        this.hotDrinks = drinks;
    }
    @Override
    String getProduct(String name, Integer volume) {
        for (HotDrinks hd: hotDrinks) {
            if (hd.getName().contains(name) && hd.getVolume().equals(volume))
                return hd.getName() + " " + hd.getVolume() + " " + hd.getTemperature();
        }
        return new HotDrinks("Не найдено!", 0, 0).toString();

    }
    String getProduct(String name, int volume, int temperature) {
        List <HotDrinks> bottleOfWaterList = new ArrayList<>();
        for (HotDrinks hd: hotDrinks) {
            if (hd.getName().contains(name) && hd.getVolume().equals(volume) && hd.getTemperature().equals(temperature) ){
                bottleOfWaterList.add(hd);
            }
        }
        return bottleOfWaterList.toString();
}
}
