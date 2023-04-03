package org.example;

public class iPhone14 extends iPhone {

    private static final int BATTERY_LIFE = 80;
    private String color;


    iPhone14(String IMEI) {
        setIMEI(IMEI);
        setCurrentBatteryLevel(BATTERY_LIFE);
    }


    public static int getBatteryLife() {
        return BATTERY_LIFE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


}
