package com.openapi.prueba.service;

import com.openapi.prueba.entity.Customer;

import java.util.List;

public interface CustomerService {

    public List<Customer> findAll();
    public void save(Customer customer);
    public Customer findOne(Long id);
    public void delete(Long id);
}
