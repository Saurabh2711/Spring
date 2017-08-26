package com.saurabh.repository;

import com.saurabh.model.Customer;

import java.util.List;

/**
 * Created by saurabh.uttam on 8/26/17.
 */
public interface CustomerRepository {
    List<Customer> findAll();
}
