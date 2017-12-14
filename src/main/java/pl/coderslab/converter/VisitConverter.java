package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.Dao.VisitDao;
import pl.coderslab.entity.Visit;

public class VisitConverter implements Converter <String, Visit> {

    @Autowired
    private VisitDao visitDao;
    
    @Override
    public Visit convert(String source) {
        Visit visit = visitDao.findById(Integer.parseInt(source));
        return  visit;
    }
}
