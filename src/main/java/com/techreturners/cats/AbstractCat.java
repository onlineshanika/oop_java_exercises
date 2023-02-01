package com.techreturners.cats;

public abstract class AbstractCat implements Cat{

    public int averageHeight;
    public boolean isAsleep ;

    public String setting ;

    @Override
    public void goToSleep() {
        isAsleep = true;
    }

    @Override
    public void wakeUp() {
        isAsleep = false;
    }

    @Override
    public boolean isAsleep() {
        return isAsleep;
    }
}
