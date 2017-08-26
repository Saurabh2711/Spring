import com.saurabh.service.CustomerService;
import com.saurabh.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by saurabh.uttam on 8/27/17.
 */
public class CustomerServiceTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService= applicationContext.getBean("customerService",CustomerService.class);
        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(customerService.findAll().get(0).getLastname());
    }
}
