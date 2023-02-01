package com.techreturners.cats;

public class DomesticCat extends AbstractCat {

    public DomesticCat() {
        averageHeight = 23;
        setting = Setting.DOMESTIC;
    }

    @Override
    public String eat() {
        return "Purrrrrrr";
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
