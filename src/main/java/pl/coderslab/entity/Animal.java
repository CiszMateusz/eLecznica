package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String type; //Gatunek
	
	//@Pattern(regexp = "[PL]+[0-9]{7,12}", message = "Niepoprawny numer paszportu")
	private String number_passport; // numer paszportu
	
	@NotNull(message = "Pole nie moze byc puste")
	private String name;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String sex;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNumber_passport() {
		return number_passport;
	}

	public void setNumber_passport(String number_passport) {
		this.number_passport = number_passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return  type + number_passport + name;
	}
	
}
