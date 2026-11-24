package io.github.devinjae.ohh.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum HandFlag {
    RUN_IT_TWICE("Run_It_Twice"),
    ANONYMOUS("Anonymous"),
    OBSERVED("Observed"),
    FAST("Fast"),
    CAP("Cap"),
    BOMB_POT("Bomb_Pot");

    private final String value;

    HandFlag(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static HandFlag fromValue(String value) {
        for (HandFlag type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unknown HandFlag: " + value);
    }
}
