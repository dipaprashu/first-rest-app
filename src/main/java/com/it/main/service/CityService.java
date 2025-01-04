package com.it.main.service;

import java.util.List;

import com.it.main.entity.City;

public interface CityService {
	
	public List<City> getAllCitys();
	
	public City getCityById(int cityCode);
	
	public void saveOrUpdate(City city);
	
	public void delete(int cityCode);

}
