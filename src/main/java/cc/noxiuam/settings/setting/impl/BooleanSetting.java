package cc.noxiuam.settings.setting.impl;

import cc.noxiuam.settings.setting.AbstractSetting;

/**
 * An example setting, you can make others just like it!
 */
public class BooleanSetting extends AbstractSetting<Boolean> {

    public BooleanSetting(String name, boolean defaultValue) {
        super(name, defaultValue);
    }

    public BooleanSetting(String id, String name, boolean defaultValue) {
        super(id, name, defaultValue);
    }

}
