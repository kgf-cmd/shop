package com.store.backend.service;

import com.store.backend.api.model.RegistrationBody;
import org.h2.engine.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    @Transactional
    public void testRegisterUser(){
        RegistrationBody body = new RegistrationBody();
    }
}
