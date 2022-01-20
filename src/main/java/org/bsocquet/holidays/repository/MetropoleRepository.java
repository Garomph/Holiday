package org.bsocquet.holidays.repository;

import org.springframework.stereotype.Repository;

@Repository
public class MetropoleRepository extends FileJsonRepository {
    @Override
    String getNameFile() {
        return "metropole.json";
    }
}
