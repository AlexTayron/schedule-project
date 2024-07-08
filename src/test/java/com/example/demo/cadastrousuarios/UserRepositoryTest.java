package com.example.demo.cadastrousuarios;

import com.example.demo.DemoApplication;
import com.example.demo.cadastrousuarios.model.User;
import com.example.demo.cadastrousuarios.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = DemoApplication.class)
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByEmail() {
        User user = new User();
        user.setEmail("user@eemail.com");
        userRepository.save(user);

        User found = userRepository.findByEmail("user@eemail.com");
        assertThat(found).isNotNull();
        assertThat(found.getEmail()).isEqualTo("user@eemail.com");
    }
}
