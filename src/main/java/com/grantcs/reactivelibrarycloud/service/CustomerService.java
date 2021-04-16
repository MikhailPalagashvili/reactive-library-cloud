package com.grantcs.reactivelibrarycloud.service;

import com.grantcs.reactivelibrarycloud.model.Customer;

import java.util.Collection;

public interface CustomerService {
    Collection<Customer> save(String name);
    Customer findById(Long id);
    Collection<Customer> findAll();
}
