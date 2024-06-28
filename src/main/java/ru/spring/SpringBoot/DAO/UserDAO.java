package ru.spring.SpringBoot.DAO;



import ru.spring.SpringBoot.model.User;

import java.util.List;

public interface UserDAO {
    List<User> getAllUsers();

    void saveUser(User user);

    User showUserById(long id);

    void deleteUserById(long id);
}
