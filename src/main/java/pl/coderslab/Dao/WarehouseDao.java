package pl.coderslab.Dao;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import pl.coderslab.entity.Animal;
import pl.coderslab.entity.Warehouse;

@Component
@Transactional
public class WarehouseDao {
	@PersistenceContext
    EntityManager entityManager;
    
	public List<Warehouse> getList(){
    	Query query = entityManager.createQuery("SELECT w FROM Warehouse w");
    	List<Warehouse> warehouses = query.getResultList();
    	return warehouses;
	}
//    public void saveWarehouse(Warehouse warehouse){
//    	warehouse.setDate_purchases(LocalDateTime.now());
//    	entityManager.persist(warehouse);
//    	}	
    public void saveWarehouse(Warehouse entity) {
        entityManager.persist(entity);
    }
    public void delete(Warehouse entity) {
		entityManager.remove(entityManager.contains(entity) ? entity : entityManager.merge(entity));
	}
	public Warehouse findById(long id) {
	    return entityManager.find(Warehouse.class, id);
	}
}








