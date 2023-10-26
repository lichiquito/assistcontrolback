package com.example.assistcontrolback.Service;

import com.example.assistcontrolback.Model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User createUser(User user);

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User updateUser(Long id, User userDetails);

    void deleteAllUsers();

    void deleteUser(Long id);

}
