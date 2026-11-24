package io.github.devinjae.ohh.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.github.devinjae.ohh.model.OHH;

public final class OHHJson {
    private static final ObjectMapper MAPPER = new ObjectMapper()
            .enable(SerializationFeature.WRAP_ROOT_VALUE)
            .enable(DeserializationFeature.UNWRAP_ROOT_VALUE);

    private OHHJson() {}

    public static String toJson(OHH ohh) throws JsonProcessingException {
        return MAPPER.writeValueAsString(ohh);
    }

    public static OHH fromJson(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, OHH.class);
    }
}
