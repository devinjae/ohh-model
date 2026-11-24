package io.github.devinjae.ohh.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import io.github.devinjae.ohh.model.enums.TournamentFlag;
import io.github.devinjae.ohh.model.enums.TournamentType;
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
public class TournamentInfo {
    private String tournamentNumber;
    private String name;
    private String startDateUtc;
    private String currency;

    private BigDecimal buyinAmount;
    private BigDecimal bountyFeeAmount;
    private BigDecimal feeAmount;

    private Integer initialStack;
    private TournamentType type;
    private List<TournamentFlag> flags;
    private Speed speed;
}
