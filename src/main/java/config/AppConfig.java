package config;

import com.saurabh.repository.CustomerRepository;
import com.saurabh.repository.HibernateCustomerRepositoryImpl;
import com.saurabh.service.CustomerService;
import com.saurabh.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by saurabh.uttam on 8/27/17.
 */

@Configuration
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());
        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
