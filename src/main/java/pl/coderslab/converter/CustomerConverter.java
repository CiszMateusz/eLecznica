package pl.coderslab.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import pl.coderslab.Dao.CustomerDao;
import pl.coderslab.entity.Customer;

public class CustomerConverter implements Converter <String, Customer> {

    @Autowired
    private CustomerDao customerDao;
    
    @Override
    public Customer convert(String source) {
        Customer customer = customerDao.findById(Integer.parseInt(source));
        return  customer;
    }
}