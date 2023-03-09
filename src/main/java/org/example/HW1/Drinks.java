package org.example.HW1;

public abstract class Drinks {
    private String name;
    private Integer volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Не существует такого объема.");
    }

}
