package cc.noxiuam.settings.setting;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@ToString
@Accessors(fluent = true)
public abstract class AbstractSetting<T> {

    private String id;
    private final String name;

    private final T defaultValue;
    @Setter private T value;

    // In case somebody does not want it to have an ID, however I recommend this for easier tracking.
    public AbstractSetting(String name, T defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
    }

    // This should be used in most cases.
    public AbstractSetting(String id, String name, T defaultValue) {
        this.id = id;
        this.name = name;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
    }

}
