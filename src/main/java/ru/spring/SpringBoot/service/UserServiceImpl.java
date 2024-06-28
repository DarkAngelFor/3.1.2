package ru.spring.SpringBoot.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.spring.SpringBoot.DAO.UserDAO;
import ru.spring.SpringBoot.model.User;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private final UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        userDAO.saveUser(user);
    }

    @Override
    public User showUserById(long id) {
        return userDAO.showUserById(id);
    }

    @Override
    @Transactional
    public void deleteUserById(long id) {
        userDAO.deleteUserById(id);
    }

}
