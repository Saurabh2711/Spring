package com.saurabh.repository;

import com.saurabh.model.Customer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by saurabh.uttam on 8/26/17.
 */
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();

        Customer customer = new Customer();

        customer.setFirstname("Saurabh");
        customer.setLastname("Uttam");

        customerList.add(customer);
        return customerList;
    }
}
