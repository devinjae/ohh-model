package io.github.devinjae.ohh.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ActionType {
    DEALT_CARDS("Dealt Cards"),
    MUCKS_CARDS("Mucks Cards"),
    SHOWS_CARDS("Shows Cards"),

    POST_ANTE("Post Ante"),
    POST_SB("Post SB"),
    POST_BB("Post BB"),
    STRADDLE("Straddle"),
    POST_DEAD("Post Dead"),
    POST_EXTRA_BLIND("Post Extra Blind"),

    FOLD("Fold"),
    CHECK("Check"),
    BET("Bet"),
    RAISE("Raise"),
    CALL("Call"),

    ADDED_CHIPS("Added Chips"),
    SITS_DOWN("Sits Down"),
    STANDS_UP("Stands Up"),
    ADD_TO_POT("Add to Pot"),
    PLAYER_ADJUSTMENT("Player Adjustment");

    private final String value;

    ActionType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }

    @JsonCreator
    public static ActionType fromValue(String value) {
        for (ActionType type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        throw new IllegalArgumentException("Unknown ActionType: " + value);
    }
}
