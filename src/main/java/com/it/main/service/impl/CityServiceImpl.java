package com.it.main.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.it.main.entity.City;
import com.it.main.repository.CityRepository;
import com.it.main.service.CityService;

@Service
@Transactional
public class CityServiceImpl implements CityService {

	@Autowired
	private CityRepository cityRepository;

	// getting all student records
	@Override
	public List<City> getAllCitys() {
		List<City> citys = new ArrayList<>();
		cityRepository.findAll().forEach(city -> citys.add(city));
		return citys;
	}

	// getting a specific record
	@Override
	public City getCityById(int cityCode) {
		Optional<City> optionalCity = cityRepository.findById(cityCode);
		if (optionalCity.isPresent()) {
			return optionalCity.get();
		}
		return null;
	}

	@Override
	public void saveOrUpdate(City city) {
		cityRepository.save(city);
	}

	// deleting a specific record
	@Override
	public void delete(int cityCode) {
		cityRepository.deleteById(cityCode);
	}
}
