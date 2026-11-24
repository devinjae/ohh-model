package io.github.devinjae.ohh.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter(onMethod_ = @JsonValue)
public enum StreetType {
    PREFLOP("Preflop"),
    FLOP("Flop"),
    TURN("Turn"),
    RIVER("River"),
    SHOWDOWN("Showdown");

    private final String value;

    StreetType(String value) {
        this.value = value;
    }


    @JsonCreator
    public static StreetType fromValue(String value) {
        for (StreetType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unknown StreetType: " + value);
    }
}
