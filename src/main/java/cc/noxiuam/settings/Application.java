package cc.noxiuam.settings;

import cc.noxiuam.settings.setting.impl.BooleanSetting;

public class Application {

    private final BooleanSetting exampleToggle;

    public Application() {
        exampleToggle = new BooleanSetting("exampleToggle", "Example Toggle", true);
        System.out.println(exampleToggle.toString());
    }

}
