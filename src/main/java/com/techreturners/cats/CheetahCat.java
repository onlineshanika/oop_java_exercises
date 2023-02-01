package com.techreturners.cats;

public class CheetahCat extends AbstractCat {

    public int averageHeight = 50;

    @Override
    public String eat() {
        return "Zzzzzzz";
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
