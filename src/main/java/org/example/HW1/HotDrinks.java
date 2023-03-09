package org.example.HW1;

public class HotDrinks extends Drinks {
    private String name;
    private Integer volume;
    private Integer temperature;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getVolume() {
        return volume;
    }

    public Integer getTemperature() {
        return temperature;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public void setTemperature(Integer temperature) {
        if (temperature > 0) this.temperature = temperature;
        else System.out.println("В данном автомате не продается лёд.");
    }

    @Override
    public String toString() {
        return "HotDrinks{" +
                "name='" + name + '\'' +
                ", volume=" + volume +
                ", temperature=" + temperature +
                '}';
    }
    public HotDrinks(String name, Integer volume, Integer temperature){
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;

    }
}
