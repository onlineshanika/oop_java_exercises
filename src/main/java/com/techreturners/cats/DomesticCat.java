package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    public final int averageHeight =23;

    public boolean isAsleep =false;
    public String setting ="domestic";

    @Override
    public String eat() {
        return "Purrrrrrr";
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public String getSetting() {
        return setting;
    }

    @Override
    public String run() {
        return null;
    }
}
