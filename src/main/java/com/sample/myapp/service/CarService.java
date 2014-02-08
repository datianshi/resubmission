package com.sample.myapp.service;

import com.sample.myapp.form.CarForm;

public interface CarService {
	public int add(CarForm car);
	public CarForm get(int id);
}
