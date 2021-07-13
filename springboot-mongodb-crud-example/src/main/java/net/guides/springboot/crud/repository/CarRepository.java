package net.guides.springboot.crud.repository;

import net.guides.springboot.crud.model.Car;
import org.bson.types.ObjectId;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CarRepository extends MongoRepository<Car, ObjectId>{

    Slice<Car> findAllByKmGreaterThan (float km, Pageable pageable);
  /*Page<Car> findAllByCar_kmGreaterThan(int car_km, Pageable pageable);*/

}
