package io.github.devinjae.ohh.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum SpeedType {
    NORMAL("Normal"),
    SEMI_TURBO("Semi-Turbo"),
    TURBO("Turbo"),
    SUPER_TURBO("Super-Turbo"),
    HYPER_TURBO("Hyper-Turbo"),
    ULTRA_TURBO("Ultra-Turbo");

    private final String value;

    SpeedType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static SpeedType fromValue(String value) {
        for (SpeedType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unknown SpeedType: " + value);
    }
}
