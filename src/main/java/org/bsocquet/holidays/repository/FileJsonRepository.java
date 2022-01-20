package org.bsocquet.holidays.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.bsocquet.holidays.entity.Holiday;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;
import java.util.List;

abstract class FileJsonRepository {

    @Autowired
    private ObjectMapper mapper;

    abstract String getNameFile();

    public List<Holiday> getHolidays() throws IOException {
        File file = new ClassPathResource("data/" + getNameFile()).getFile();

        return mapper.readValue(file, new TypeReference<>() {
        });


    }

}
