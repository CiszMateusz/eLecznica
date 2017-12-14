package pl.coderslab.entity;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.validation.constraints.Future;
//import javax.validation.constraints.NotNull;

@Entity
public class Warehouse {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@NotNull(message = "Pole nie moze byc puste")
	private String drugs;
	
	//@NotNull
	private LocalDateTime date_purchases;
	
	//@NotNull(message = "Pole nie moze byc puste")
	private long packages;
	
	//@NotNull(message = "Pole nie moze byc puste")
	private String nr_invoice;
	
	//@NotNull(message = "Pole nie moze byc puste")
	private long series;
	
	//@Future
	private Date expiration_date ;
	
	//@NotNull(message = "Pole nie moze byc puste")
	private long dose;
	
	//@NotNull(message = "Pole nie moze byc puste")
	private long price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDrugs() {
		return drugs;
	}

	public void setDrugs(String drugs) {
		this.drugs = drugs;
	}

	public LocalDateTime getDate_purchases() {
		return date_purchases;
	}

	public void setDate_purchases(LocalDateTime date_purchases) {
		this.date_purchases = date_purchases;
	}

	public long getPackages() {
		return packages;
	}

	public void setPackages(long packages) {
		this.packages = packages;
	}

	public String getNr_invoice() {
		return nr_invoice;
	}

	public void setNr_invoice(String nr_invoice) {
		this.nr_invoice = nr_invoice;
	}

	public long getSeries() {
		return series;
	}

	public void setSeries(long series) {
		this.series = series;
	}

	public Date getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}

	public long getDose() {
		return dose;
	}

	public void setDose(long dose) {
		this.dose = dose;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return  drugs + dose;
	}
	
	
}
