package pl.coderslab.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Animal;
import pl.coderslab.entity.Customer;
import pl.coderslab.entity.Visit;

@Component
@Transactional
public class VisitDao {
	
		@PersistenceContext
	    EntityManager entityManager;
		
		public void saveVisit(Visit entity) {
	        entityManager.persist(entity);
	    }
		public List<Visit> getList(){
	    	Query query = entityManager.createQuery("SELECT v FROM Visit v");
	    	List<Visit> visits = query.getResultList();
	    	return visits;
		
		}
		public Visit findById(long id) {
		    return entityManager.find(Visit.class, id);
		}
		public void update(Visit entity) {
			entityManager.merge(entity);
		}
}