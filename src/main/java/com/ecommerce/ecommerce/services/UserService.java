package com.ecommerce.ecommerce.services;

import java.util.List;
import java.util.Optional;

import com.ecommerce.ecommerce.entities.User;
import com.ecommerce.ecommerce.repositories.UserRepository;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Find all users in the database
     * 
     * @return list of users
     */
    public List<User> findAllUser() {
        return userRepository.findAll();
    }

    /**
     * Find user by id
     * 
     * @param id
     * @return user
     */
    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    /**
     * Save user to the database. Update is included
     * 
     * @param user
     * @return saved user
     */
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    /**
     * Find user by username. Returns null if user doesn't exist in the database
     * 
     * @param username
     * @return user
     */
    public User findUserByUsername(String username) {
        Optional<User> foundUser = userRepository.findByUsername(username);

        if (foundUser.isEmpty()) {
            return null;
        } else {
            return foundUser.get();
        }
    }

    /**
     * Find User by User Email. Returns null if user doesn't exit in the database
     * 
     * @param email
     * @return user
     */
    public User findUserByEmail(String email) {
        Optional<User> foundUser = userRepository.findByUserEmail(email);

        if (foundUser.isEmpty()) {
            return null;
        } else {
            return foundUser.get();
        }
    }

    /**
     * Find user by User Phone. Returns null if user doesn't exist in the database
     * 
     * @param phone
     * @return user
     */
    public User findUserByPhone(String phone) {
        Optional<User> foundUser = userRepository.findByUserPhone(phone);

        if (foundUser.isEmpty()) {
            return null;
        } else {
            return foundUser.get();
        }
    }

}