package net.guides.springboot.crud.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document (collection = "CarColl")
public class Car {


	@Id
	public ObjectId id;


	private String ad_description;


	private float ad_price;


	private String ad_title;


	private String car_brand;


	private String car_color;


	private String car_consumption;


	private String car_cylinder;


	private String car_energy;

	@Field("car_km")
	private float km;


	private String car_model;


	private String car_nb_doors;


	private String car_nb_seats;


	private String car_options;


	private String car_real_power;


	private String car_transmission;


	private String car_version;


	public Car() {
		
	}

	public Car(ObjectId id,String ad_description, float ad_price, String ad_title,String car_brand,String car_color, String car_consumption,String car_cylinder,String car_energy,float km,String car_model,String car_nb_doors,String car_nb_seats,String car_options,String car_real_power,String car_transmission,String car_version) {
		this.id = id;
		this.ad_description = ad_description;
		this.ad_price = ad_price;
		this.ad_title = ad_title;
		this.car_brand = car_brand;
		this.car_color = car_color;
		this.car_consumption = car_consumption;
		this.car_cylinder = car_cylinder;
		this.car_energy = car_energy;
		this.km = km;
		this.car_model = car_model;
		this.car_nb_doors = car_nb_doors;
		this.car_nb_seats = car_nb_seats;
		this.car_options = car_options;
		this.car_real_power = car_real_power;
		this.car_transmission = car_transmission;
		this.car_version = car_version;
	}

	public ObjectId getId() {
		return id;
	}

	public void setId(ObjectId id) {
		this.id = id;
	}

	public String getAd_description() {
		return ad_description;
	}

	public void setAd_description(String ad_description) {
		this.ad_description = ad_description;
	}

	public float getAd_price() {
		return ad_price;
	}

	public void setAd_price(float ad_price) {
		this.ad_price = ad_price;
	}

	public String getAd_title() {
		return ad_title;
	}

	public void setAd_title(String ad_title) {
		this.ad_title = ad_title;
	}

	public String getCar_brand() {
		return car_brand;
	}

	public void setCar_brand(String car_brand) {
		this.car_brand = car_brand;
	}

	public String getCar_color() {
		return car_color;
	}

	public void setCar_color(String car_color) {
		this.car_color = car_color;
	}

	public String getCar_consumption() {
		return car_consumption;
	}

	public void setCar_consumption(String car_consumption) {
		this.car_consumption = car_consumption;
	}

	public String getCar_cylinder() {
		return car_cylinder;
	}

	public void setCar_cylinder(String car_cylinder) {
		this.car_cylinder = car_cylinder;
	}

	public String getCar_energy() {
		return car_energy;
	}

	public void setCar_energy(String car_energy) {
		this.car_energy = car_energy;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public String getCar_model() {
		return car_model;
	}

	public void setCar_model(String car_model) {
		this.car_model = car_model;
	}

	public String getCar_nb_doors() {
		return car_nb_doors;
	}

	public void setCar_nb_doors(String car_nb_doors) {
		this.car_nb_doors = car_nb_doors;
	}

	public String getCar_nb_seats() {
		return car_nb_seats;
	}

	public void setCar_nb_seats(String car_nb_seats) {
		this.car_nb_seats = car_nb_seats;
	}

	public String getCar_options() {
		return car_options;
	}

	public void setCar_options(String car_options) {
		this.car_options = car_options;
	}

	public String getCar_real_power() {
		return car_real_power;
	}

	public void setCar_real_power(String car_real_power) {
		this.car_real_power = car_real_power;
	}

	public String getCar_transmission() {
		return car_transmission;
	}

	public void setCar_transmission(String car_transmission) {
		this.car_transmission = car_transmission;
	}

	public String getCar_version() {
		return car_version;
	}

	public void setCar_version(String car_version) {
		this.car_version = car_version;
	}



	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", ad_description='" + ad_description + '\'' +
				", ad_price='" + ad_price + '\'' +
				", ad_title='" + ad_title + '\'' +
				", car_brand='" + car_brand + '\'' +
				", car_color='" + car_color + '\'' +
				", car_consumption='" + car_consumption + '\'' +
				", car_cylinder='" + car_cylinder + '\'' +
				", car_energy='" + car_energy + '\'' +
				", km='" + km + '\'' +
				", car_model='" + car_model + '\'' +
				", car_nb_doors='" + car_nb_doors + '\'' +
				", car_nb_seats='" + car_nb_seats + '\'' +
				", car_options='" + car_options + '\'' +
				", car_real_power='" + car_real_power + '\'' +
				", car_transmission='" + car_transmission + '\'' +
				", car_version='" + car_version + '\'' +
				'}';
	}
}
