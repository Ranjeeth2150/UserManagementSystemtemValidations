package com.geekster.UserManagementSystemValidations.BeanMaker;

import com.geekster.UserManagementSystemValidations.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanMaker {
    @Bean
    public List<User> getUsers()
    {
        return new ArrayList<>();
    }
}
