package org.example.builder;

public class Computer {

    public static class ComputerBuilder {

    }

    private HDD diskSize;
    private RAM ramSize;
    private boolean hasUsbc;
    private boolean hasGigabitWifi;

    public Computer(ComputerBuilder builder) {
    }

    public HDD getDiskSize() {
        return diskSize;
    }


    public RAM getRamSize() {
        return ramSize;
    }



    public boolean hasUsbc() {
        return hasUsbc;
    }

    public void setHasUsbc(boolean hasUsbc) {
        this.hasUsbc = hasUsbc;
    }

    public boolean hasGigabitWifi() {
        return hasGigabitWifi;
    }

    public void setHasGigabitWifi(boolean hasGigabitWifi) {
        this.hasGigabitWifi = hasGigabitWifi;
    }
}
