package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.Dao.AnimalDao;
import pl.coderslab.entity.Animal;

public class AnimalConverter implements Converter <String, Animal> {

    @Autowired
    private  AnimalDao animalDao;
    @Override
    public Animal convert(String source) {
        Animal animal = animalDao.findById(Integer.parseInt(source));
        return  animal;
    }
    
    public static void main(String[] args) {
    	StringBuilder a = new StringBuilder();
    	String b = "";
    	System.out.println(5 / 0);
    	
	}
    
    static final int a(){
    	return 0;
    }
}