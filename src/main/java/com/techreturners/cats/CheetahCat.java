package com.techreturners.cats;

public class CheetahCat extends AbstractCat {

    public CheetahCat() {
        averageHeight = 50;
        setting = Setting.WILD;
    }

    @Override
    public String eat() {
        return "Zzzzzzz";
    }

    @Override
    public int getAverageHeight() {
        return averageHeight;
    }

    @Override
    public String run() {
        return eat();
    }
}
