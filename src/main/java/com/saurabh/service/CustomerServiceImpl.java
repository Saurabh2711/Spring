package com.saurabh.service;

import com.saurabh.model.Customer;
import com.saurabh.repository.CustomerRepository;
import com.saurabh.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

/**
 * Created by saurabh.uttam on 8/26/17.
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository;   //moved to spring = new HibernateCustomerRepositoryImpl();

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
