package org.bsocquet.holidays.entity;

import lombok.Getter;

import java.util.Arrays;

public enum Area {

    GUYANE("Guyane"),
    METROPOLE("Metropole"),
    REUNION("Reunion");

    @Getter
    private final String description;

    Area(String description) {
        this.description = description;
    }

    public static Area getFromDescription(String description) {
        return Arrays.stream(Area.values())
                .filter((a) -> a.description.equalsIgnoreCase(description))
                .findFirst()
                .orElse(null);
    }
}
