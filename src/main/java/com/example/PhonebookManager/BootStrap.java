package com.example.PhonebookManager;

import com.example.PhonebookManager.domain.entity.RoleType;
import com.example.PhonebookManager.domain.entity.User;
import com.example.PhonebookManager.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;

//@Component
public class BootStrap {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @PostConstruct
    public void test() throws Exception {

        User user1 = new User();
        user1.setEmail("stefan123");
        user1.setPassword(passwordEncoder.encode("1234"));
        user1.setRole(RoleType.ADMIN);
        userRepository.save(user1);

        User user2 = new User();
        user2.setEmail("stefan123@gmail.com");
        user2.setPassword(passwordEncoder.encode("123456"));
        user2.setRole(RoleType.ADMIN);
        userRepository.save(user2);

        User user3 = new User();
        user3.setEmail("stefan3@yahoo.com");
        user3.setPassword(passwordEncoder.encode("stefan994"));
        user3.setRole(RoleType.ADMIN);
        userRepository.save(user3);

        User user4 = new User();
        user4.setEmail("jovanovic.stefan94@yahoo.com");
        user4.setPassword(passwordEncoder.encode("stef94"));
        user4.setRole(RoleType.ADMIN);
        userRepository.save(user4);

        System.out.println("Hello is anyone there");
    }
}
