package io.github.devinjae.ohh.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.devinjae.ohh.model.enums.GameType;
import io.github.devinjae.ohh.model.enums.HandFlag;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName("ohh")
public class OHH {
    private String specVersion;
    private String siteName;
    private String networkName;
    private String internalVersion;

    private Boolean tournament;
    private TournamentInfo tournamentInfo;

    private String gameNumber;
    private String startDateUtc;

    private String tableName;
    private String tableHandle;
    private String tableSkin;

    private GameType gameType;
    private BetLimit betLimit;

    private Integer tableSize;
    private String currency;
    private Integer dealerSeat;

    private BigDecimal smallBlindAmount;
    private BigDecimal bigBlindAmount;
    private BigDecimal anteAmount;

    private Integer heroPlayerId;

    private List<HandFlag> flags;
    private List<Player> players;
    private List<Round> rounds;
    private List<Pot> pots;
    private List<TournamentBounty> tournamentBounties;
}
