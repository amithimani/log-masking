package dev.knowledgecafe.logmasking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class HomeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);
    private static final Map<Integer, Customer> customerMap = new HashMap<>();

    HomeController(){
        customerMap.put(1, new Customer("ABC", 1, "hello@gmail.com", "345-34-2345"));
    }

    @GetMapping("/customer/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable("id") Integer id) {
        LOGGER.info("request received to fetch customer for ID=" +id);
        try {
            var customer = customerMap.get(id);
            LOGGER.info("returning Customer object " + customer);
            return ResponseEntity.ok(customer);
        } catch (Exception e) {
            LOGGER.error("Internal server error {} occurred while fetching all members", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
        }
    }





}
