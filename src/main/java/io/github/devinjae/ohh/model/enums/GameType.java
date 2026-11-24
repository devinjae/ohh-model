package io.github.devinjae.ohh.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter(onMethod_ = @JsonValue)
public enum GameType {
    HOLDEM("Holdem"),
    OMAHA("Omaha"),
    OMAHA_HI_LO("OmahaHiLo"),
    STUD("Stud"),
    STUD_HI_LO("StudHiLo"),
    DRAW("Draw");

    private final String value;

    GameType(String value) {
        this.value = value;
    }


    @JsonCreator
    public static GameType fromValue(String value) {
        for (GameType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unknown GameType: " + value);
    }
}
