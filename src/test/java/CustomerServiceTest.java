import com.saurabh.service.CustomerService;
import com.saurabh.service.CustomerServiceImpl;

/**
 * Created by saurabh.uttam on 8/27/17.
 */
public class CustomerServiceTest {
    public static void main(String[] args) {
        CustomerService customerService= new CustomerServiceImpl();
        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(customerService.findAll().get(0).getLastname());
    }
}
