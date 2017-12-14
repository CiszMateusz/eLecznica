package pl.coderslab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	
	@NotNull(message = "Pole nie moze byc puste")
	private String name;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String lastname;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String street;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String place;
	
//	@NotNull(message = "Pole nie moze byc puste")
//	@Pattern(regexp = "[0-9]{2}-[0-9]{3}", message = "Niepoprawny kod pocztowy")
	private String post_code;
	
	@Size(min=7,max	= 10, message = "Niepoprawny numer telefonu")
	private String phone;
	
	@Email(message = "Niepoprawny adres email")
	private String email;
	
	@NotNull(message = "Pole nie moze byc puste")
	private long number_house;
	
//	@Pattern(regexp = "[PL]+[0-9]{12}", message = "Niepoprawny kod gospodarstwa rolnego")
	private String nr_id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getPost_code() {
		return post_code;
	}

	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getNumber_house() {
		return number_house;
	}

	public void setNumber_house(long number_house) {
		this.number_house = number_house;
	}

	public String getNr_id() {
		return nr_id;
	}

	public void setNr_id(String nr_id) {
		this.nr_id = nr_id;
	}

	@Override
	public String toString() {
		return name + lastname  + nr_id;
	}
	
	
	
}
