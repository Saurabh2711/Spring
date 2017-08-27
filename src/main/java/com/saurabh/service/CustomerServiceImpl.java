package com.saurabh.service;

import com.saurabh.model.Customer;
import com.saurabh.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by saurabh.uttam on 8/26/17.
 */

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Resource(name = "customerRepository")
    private CustomerRepository customerRepository;  //Moved to spring  = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
