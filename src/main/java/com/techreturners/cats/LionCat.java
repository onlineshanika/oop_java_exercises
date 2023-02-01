package com.techreturners.cats;

public class LionCat extends AbstractCat {

    @Override
    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public int getAverageHeight() {
        return 1100;
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
