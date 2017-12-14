package pl.coderslab.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Animal;

@Component
@Transactional
public class AnimalDao {
	
	@PersistenceContext
    EntityManager entityManager;
	
	public void saveAnimal(Animal entity) {
        entityManager.persist(entity);
    }
	public List<Animal> getList(){
    	Query query = entityManager.createQuery("SELECT a FROM Animal a");
    	List<Animal> animals = query.getResultList();
    	return animals;
	}
	public void delete(Animal entity) {
		entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
	}
	public Animal findById(long id) {
	    return entityManager.find(Animal.class, id);
	}
	 public void update(Animal entity) {
	        entityManager.merge(entity);
	    }
}	

