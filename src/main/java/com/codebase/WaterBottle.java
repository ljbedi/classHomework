package com.codebase;

public class WaterBottle {

    public int volume;

    public WaterBottle(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int drinkBottle() {
        return getVolume() - 10;
    }

    public void fillBottle() {
        setVolume(100);
    }

    public void emptyBottle() {
        setVolume(0);
    }
}
