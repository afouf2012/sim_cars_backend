package net.guides.springboot.crud.controller;

import java.util.List;

import net.guides.springboot.crud.model.Car;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import net.guides.springboot.crud.repository.CarRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CarController {

	@Autowired
	private CarRepository carRepository;
	


	@GetMapping("/Cars")
	public List<Car> getAllCars() {
		return carRepository.findAll();
	}

	@GetMapping("/pageablebysalary")
	public Slice<Car> retrieveCustomerBySalaryWithPaging(@Param(value = "km") float km,
														 @Param(value = "page") int page,
														 @Param(value = "size") int size){
		Pageable requestedPage = PageRequest.of(page, size);
		Slice<Car> cars  = carRepository.findAllByKmGreaterThan(km, requestedPage);
		return cars;
	}

/*	@GetMapping("/pageable/byagegreaterthan")
	public Slice<Car> retrieveCustomerByAgeGreaterThan(@Param(value = "car_km") int car_km,
															@Param(value = "page") int page,
															@Param(value = "size") int size){
		Pageable requestedPage = PageRequest.of(page, size);
		Page<Car> cars  = carRepository.findAllByCar_kmGreaterThan(car_km, requestedPage);
		return cars;
	}*/

}
