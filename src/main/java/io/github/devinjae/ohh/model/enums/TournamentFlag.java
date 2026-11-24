package io.github.devinjae.ohh.model.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import lombok.Getter;

@Getter(onMethod_ = @JsonValue)
public enum TournamentFlag {
    SNG("SNG"),
    DON("DON"),
    BOUNTY("Bounty"),
    SHOOTOUT("Shootout"),
    REBUY("Rebuy"),
    MATRIX("Matrix"),
    PUSH_OR_FOLD("Push_Or_Fold"),
    SATELLITE("Satellite"),
    STEPS("Steps"),
    DEEP("Deep"),
    MULTI_ENTRY("Multi-Entry"),
    FIFTY50("Fifty50"),
    FLIPOUT("Flipout"),
    TRIPLE_UP("TripleUp"),
    LOTTERY("Lottery"),
    RE_ENTRY("Re-Entry"),
    POWER_UP("Power_Up"),
    PROGRESSIVE_BOUNTY("Progressive-Bounty");

    private final String value;

    TournamentFlag(String value) {
        this.value = value;
    }


    @JsonCreator
    public static TournamentFlag fromValue(String value) {
        for (TournamentFlag type : values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }

        throw new IllegalArgumentException("Unknown TournamentFlag: " + value);
    }
}