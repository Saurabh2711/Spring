package com.saurabh.service;

import com.saurabh.model.Customer;
import com.saurabh.repository.CustomerRepository;

import java.util.List;

/**
 * Created by saurabh.uttam on 8/27/17.
 */
public interface CustomerService {

    abstract List<Customer> findAll();
}
