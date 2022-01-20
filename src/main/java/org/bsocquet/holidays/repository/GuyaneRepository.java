package org.bsocquet.holidays.repository;

import org.springframework.stereotype.Repository;

@Repository
public class GuyaneRepository extends FileJsonRepository {
    @Override
    String getNameFile() {
        return "guyane.json";
    }
}
