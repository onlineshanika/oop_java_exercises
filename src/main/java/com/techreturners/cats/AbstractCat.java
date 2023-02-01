package com.techreturners.cats;

public abstract class AbstractCat implements Cat {

    public int averageHeight;
    public Setting setting;

    public boolean isAsleep;

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

    @Override
    public String getSetting() {
        return setting.getSettingValue();

    }
}
