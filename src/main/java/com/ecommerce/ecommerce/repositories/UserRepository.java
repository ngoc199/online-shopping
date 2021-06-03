package com.ecommerce.ecommerce.repositories;

import java.util.Optional;

import com.ecommerce.ecommerce.entities.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author ngoc
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    public Optional<User> findByUsername(String username);

    public Optional<User> findByUserEmail(String userEmail);

    public Optional<User> findByUserPhone(String userPhone);
}