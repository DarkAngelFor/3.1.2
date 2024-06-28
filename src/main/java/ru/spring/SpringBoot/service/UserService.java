package ru.spring.SpringBoot.service;


import ru.spring.SpringBoot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUserById(long id);

    void deleteUserById(long id);

}
