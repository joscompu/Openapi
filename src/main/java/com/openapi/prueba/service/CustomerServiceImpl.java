package com.openapi.prueba.service;

import com.openapi.prueba.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerService data;

    @Override
    public List<Customer> findAll() {
        return data.findAll();
    }

    @Override
    public void save(Customer customer) {
            data.save(customer);

    }

    @Override
    public Customer findOne(Long id) {
        return data.findOne(id);
    }

    @Override
    public void delete(Long id) {
            data.delete(id);
    }
}
