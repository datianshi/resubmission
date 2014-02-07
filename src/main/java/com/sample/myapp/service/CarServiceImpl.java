package com.sample.myapp.service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Component;

import com.sample.myapp.form.CarForm;

@Component
public class CarServiceImpl implements CarService{
	
	private AtomicInteger sequenceId = new AtomicInteger(0);
	private final Map<Integer, CarForm> repository = new HashMap<Integer, CarForm>();

	@Override
	public void add(CarForm car) {
		Integer id = sequenceId.addAndGet(1);
		car.setId(id);
		repository.put(id, car);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
