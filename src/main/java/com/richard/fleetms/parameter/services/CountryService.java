package com.richard.fleetms.parameter.services;

import com.richard.fleetms.parameter.models.Country;
import com.richard.fleetms.parameter.repository.CountryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepo countryRepo;

    public List<Country> getAll(){
        return countryRepo.findAll();
    }

    public void save(Country country){
        countryRepo.save(country);
    }
    public void delete(Integer id){
        countryRepo.deleteById(id);
    }

    public Country getById(Integer id) {
        return countryRepo.findById(id).orElse(null);
    }
//    th:href="@{'/countryEdit/'+${country.id}}"
}
