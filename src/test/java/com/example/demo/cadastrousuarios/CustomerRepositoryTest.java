package com.example.demo.cadastrousuarios;

import com.example.demo.DemoApplication;
import com.example.demo.cadastrousuarios.model.Customer;
import com.example.demo.cadastrousuarios.repository.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DemoApplication.class)
public class CustomerRepositoryTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void testSaveAndFindCustomer() {
        Customer customer = new Customer();
        customer.setName("John");
        customerRepository.save(customer);

        Customer found = customerRepository.findById(customer.getId()).orElse(null);
        assertThat(found).isNotNull();
        assertThat(found.getName()).isEqualTo("John");
    }
}
