package com.saurabh.service;

import com.saurabh.model.Customer;
import com.saurabh.repository.CustomerRepository;

import java.util.List;

/**
 * Created by saurabh.uttam on 8/26/17.
 */
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepository customerRepository; //Moved to spring = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
