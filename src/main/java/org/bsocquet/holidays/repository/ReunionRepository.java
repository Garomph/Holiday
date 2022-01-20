package org.bsocquet.holidays.repository;

import org.springframework.stereotype.Repository;

@Repository
public class ReunionRepository extends FileJsonRepository {
    @Override
    String getNameFile() {
        return "la-reunion.json";
    }
}
