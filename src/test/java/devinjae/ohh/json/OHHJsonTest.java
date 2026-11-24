package devinjae.ohh.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.devinjae.ohh.json.OHHJson;
import io.github.devinjae.ohh.model.OHH;
import io.github.devinjae.ohh.model.enums.GameType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public final class OHHJsonTest {
    @Test
    void testSerialization() throws Exception {
        OHH ohh = new OHH();
        ohh.setSpecVersion("1.4.9");
        ohh.setSiteName("PokerStars");
        ohh.setGameNumber("123456789");
        ohh.setGameType(GameType.HOLDEM);

        String json = OHHJson.toJson(ohh);

        JsonNode root = new ObjectMapper().readTree(json);

        assertEquals("1.4.9", root.path("ohh").path("spec_version").asText());
        assertEquals("PokerStars", root.path("ohh").path("site_name").asText());
        assertEquals("Holdem", root.path("ohh").path("game_type").asText());
    }

    @Test
    void testDeserialization() throws Exception {
        String json = """
                {
                  "ohh": {
                    "spec_version": "1.4.9",
                    "site_name": "PokerStars",
                    "game_number": "123456789",
                    "game_type": "Holdem"
                  }
                }
                """;

        OHH ohh = OHHJson.fromJson(json);

        assertEquals("1.4.9", ohh.getSpecVersion());
        assertEquals("PokerStars", ohh.getSiteName());
        assertEquals("123456789", ohh.getGameNumber());
        assertEquals(GameType.HOLDEM, ohh.getGameType());
    }

    @Test
    void testRoundTrip() throws Exception {
        OHH original = new OHH();
        original.setSpecVersion("1.4.9");
        original.setGameType(GameType.HOLDEM);

        String json = OHHJson.toJson(original);
        OHH restored = OHHJson.fromJson(json);

        assertEquals(original.getSpecVersion(), restored.getSpecVersion());
        assertEquals(original.getGameType(), restored.getGameType());
    }
}
