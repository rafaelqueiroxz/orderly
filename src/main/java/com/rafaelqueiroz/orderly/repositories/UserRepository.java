package com.rafaelqueiroz.orderly.repositories;

import com.rafaelqueiroz.orderly.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
