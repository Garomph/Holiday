package org.bsocquet.holidays.service;

import lombok.SneakyThrows;
import org.bsocquet.holidays.entity.Area;
import org.bsocquet.holidays.entity.Holiday;
import org.bsocquet.holidays.repository.GuyaneRepository;
import org.bsocquet.holidays.repository.MetropoleRepository;
import org.bsocquet.holidays.repository.ReunionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchHolidayService {

    private final GuyaneRepository guyaneRepository;
    private final MetropoleRepository metropoleRepository;
    private final ReunionRepository reunionRepository;

    public SearchHolidayService(GuyaneRepository guyaneRepository, MetropoleRepository metropoleRepository, ReunionRepository reunionRepository) {
        this.guyaneRepository = guyaneRepository;
        this.metropoleRepository = metropoleRepository;
        this.reunionRepository = reunionRepository;
    }

    @SneakyThrows
    public List<Holiday> getHolidaysForArea(String area) {

        return switch (Area.getFromDescription(area)) {
            case GUYANE -> guyaneRepository.getHolidays();
            case METROPOLE -> metropoleRepository.getHolidays();
            case REUNION -> reunionRepository.getHolidays();
        };

    }


}
