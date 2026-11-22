package com.rafaelqueiroz.orderly.config;

import com.rafaelqueiroz.orderly.entities.Category;
import com.rafaelqueiroz.orderly.entities.Order;
import com.rafaelqueiroz.orderly.entities.User;
import com.rafaelqueiroz.orderly.entities.enums.OrderStatus;
import com.rafaelqueiroz.orderly.repositories.CategoryRepository;
import com.rafaelqueiroz.orderly.repositories.OrderRepository;
import com.rafaelqueiroz.orderly.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("orderly-test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {

        User user1 = new User(null, "Beatriz", "bia@gmail.com", "11 99999 9999", "123456");
        User user2 = new User(null, "Luiz Felipe", "luiz@gmail.com", "11 88888 8888", "654321");

        Order order1 = new Order(null, Instant.parse("2025-10-11T16:30:11Z"), OrderStatus.PAID, user1);
        Order order2 = new Order(null, Instant.parse("2023-10-07T11:30:45Z"), OrderStatus.WAITING_PAYMENT, user2);
        Order order3 = new Order(null, Instant.parse("2025-10-11T17:35:18Z"), OrderStatus.WAITING_PAYMENT, user1);

        Category category1 = new Category(null, "Eletronics");
        Category category2 = new Category(null, "Books");
        Category category3 = new Category(null, "Computers");

        userRepository.saveAll(Arrays.asList(user1, user2));
        orderRepository.saveAll(Arrays.asList(order1, order2, order3));
        categoryRepository.saveAll(Arrays.asList(category1, category2, category3));

    }



}
