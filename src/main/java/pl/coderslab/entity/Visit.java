package pl.coderslab.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Visit {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "visit_customer")
	private Customer customer;
	

	private Date reporting_data;
	
	private Date visit_data;
	
	@ManyToOne
	@JoinColumn(name = "visit_animal")
	private Animal animal;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String recognition;
	
	@NotNull(message = "Pole nie moze byc puste")
	private String intervention;
	
	@ManyToOne
	@JoinColumn(name = "visit_warehouse")
	Warehouse warehouse;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getReporting_data() {
		return reporting_data;
	}

	public void setReporting_data(Date reporting_data) {
		this.reporting_data = reporting_data;
	}

	public Date getVisit_data() {
		return visit_data;
	}

	public void setVisit_data(Date visit_data) {
		this.visit_data = visit_data;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public String getRecognition() {
		return recognition;
	}

	public void setRecognition(String recognition) {
		this.recognition = recognition;
	}

	public String getIntervention() {
		return intervention;
	}

	public void setIntervention(String intervention) {
		this.intervention = intervention;
	}

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}
	
	
}
