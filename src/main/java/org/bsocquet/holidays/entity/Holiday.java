package org.bsocquet.holidays.entity;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Holiday {

    private LocalDate date;
    private String name;
}
