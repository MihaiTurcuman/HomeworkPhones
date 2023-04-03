package org.example;

public class HuaweiP40Pro extends Huawei {


    private static final int BATTERY_LIFE = 100;
    private String color;

    HuaweiP40Pro(String IMEI) {
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