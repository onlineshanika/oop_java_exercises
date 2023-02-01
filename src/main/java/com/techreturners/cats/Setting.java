package com.techreturners.cats;

import java.util.HashMap;
import java.util.Map;

public enum Setting {

    WILD("wild"),
    DOMESTIC("domestic");

    private static final Map<String, Setting> BY_SETTING = new HashMap<>();

    static {
        for (Setting e : values()) {
            BY_SETTING.put(e.getSettingValue(), e);
        }
    }

    private final String settingValue;

    Setting(String settingValue) {
        this.settingValue = settingValue;
    }

    public String getSettingValue() {
        return settingValue;
    }

    public static Setting groupBy(String value) {
        return BY_SETTING.get(value);
    }
}
