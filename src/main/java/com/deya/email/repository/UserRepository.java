package com.deya.email.repository;

import com.deya.email.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmailIgnoreCase(String email);
    Boolean existsByEmail(String email);
}
