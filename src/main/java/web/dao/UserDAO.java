package web.dao;


import web.model.User;

import java.util.List;

public interface UserDAO {

    List<User> getAllUsers();
    User getUserById (long id);

    void addUser(User user);

    void delete(long id);
    void updateUser (long id, User updateUser);
}
