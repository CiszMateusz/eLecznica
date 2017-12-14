package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.Dao.WarehouseDao;
import pl.coderslab.entity.Warehouse;

public class WarehouseConverter implements Converter <String, Warehouse> {

    @Autowired
    private  WarehouseDao warehouseDao;
    @Override
    public Warehouse convert(String source) {
    	Warehouse warehouse = warehouseDao.findById(Integer.parseInt(source));
        return  warehouse;
    }
}
