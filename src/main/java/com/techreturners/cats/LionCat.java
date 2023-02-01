package com.techreturners.cats;

public class LionCat extends AbstractCat {

    public LionCat() {
        averageHeight = 1100;
        setting = Setting.WILD;
    }

    @Override
    public String eat() {
        return "Roar!!!!";
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public String run() {
        return null;
    }
}
