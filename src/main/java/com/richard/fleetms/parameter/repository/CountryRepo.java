package com.richard.fleetms.parameter.repository;

import com.richard.fleetms.parameter.models.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepo extends JpaRepository<Country, Integer> {
}
