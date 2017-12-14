package pl.coderslab.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Animal;
import pl.coderslab.entity.Customer;
@Component
@Transactional
public class CustomerDao {
	
		@PersistenceContext
	    EntityManager entityManager;
		
		public void saveCustomer(Customer entity) {
	        entityManager.persist(entity);
	    }
		public List<Customer> getList(){
	    	Query query = entityManager.createQuery("SELECT c FROM Customer c");
	    	List<Customer> customers = query.getResultList();
	    	return customers;
		}
		public void delete(Customer entity) {
			entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
		}
		public Customer findById(long id) {
		    return entityManager.find(Customer.class, id);
		}
		public void update(Customer entity) {
		        entityManager.merge(entity);
		    }
	}

