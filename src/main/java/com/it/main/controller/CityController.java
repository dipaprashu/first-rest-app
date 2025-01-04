package com.it.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.it.main.entity.City;
import com.it.main.service.CityService;

@RestController
public class CityController {

	@Autowired
	private CityService cityService;

	// creating a get mapping that retrieves all the students detail from the
	// database
	@GetMapping("/citys")
	public List<City> getAllCitys() {
		return cityService.getAllCitys();
	}

	// creating a get mapping that retrieves the detail of a specific student
	@GetMapping("/city/{id}")
	public City getCity(@PathVariable("id") int id) {
		return cityService.getCityById(id);
	}

	// creating a delete mapping that deletes a specific student
	@DeleteMapping("/city/{id}")
	public void deleteCity(@PathVariable("id") int id) {
		cityService.delete(id);
	}

	// creating post mapping that post the student detail in the database
	@PostMapping("/city")
	public int saveCity(@RequestBody City city) {
		cityService.saveOrUpdate(city);
		return city.getCityCode();
	}

}
