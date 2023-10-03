package com.richard.fleetms.parameter.controllers;

import com.richard.fleetms.parameter.models.Country;
import com.richard.fleetms.parameter.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries")
    public String getAll(Model model){
        List<Country> countries = countryService.getAll();
        model.addAttribute("countries", countries);
        return "/parameter/countryList";
    }
    @GetMapping("/countryAdd")
    public String addCountry(){
        return "/parameter/countryAdd";
    }
    @PostMapping("/countries")
    public String saveCountry(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }
    @RequestMapping(value="/countries/delete/{id}", method= {RequestMethod.GET, RequestMethod.DELETE})
    public String delete(@PathVariable Integer id){
        countryService.delete(id);
        return "redirect:/countries";
    }
    @GetMapping("/countryEdit/{id}")
    public String editCountry(@PathVariable Integer id, Model model){
        Country country = countryService.getById(id);
        model.addAttribute("country",country);
        return "/parameter/countryEdit";
    }
    @RequestMapping(value="/countries/update/{id}", method= {RequestMethod.GET, RequestMethod.PUT})
    public String update(Country country){
        countryService.save(country);
        return "redirect:/countries";
    }

    @GetMapping("/countryDetails/{id}")
    public String countryDetails(@PathVariable Integer id, Model model){
        Country country = countryService.getById(id);
        model.addAttribute("country",country);
        return "/parameter/countryDetails";
    }
}
