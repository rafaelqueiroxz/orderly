package com.rafaelqueiroz.orderly.config;

import com.rafaelqueiroz.orderly.entities.User;
import com.rafaelqueiroz.orderly.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("orderly-test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository repository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Beatriz", "bia@gmail.com", "11 99999 9999", "123456");
        User user2 = new User(null, "Luiz Felipe", "luiz@gmail.com", "11 88888 8888", "654321");
        repository.saveAll(Arrays.asList(user1, user2));

    }
}
