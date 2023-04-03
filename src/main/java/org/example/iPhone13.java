package org.example;

public class iPhone13 extends iPhone {
    private static final int BATTERY_LIFE = 70;
    private String color;
    private String material;

    iPhone13(String IMEI) {
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
