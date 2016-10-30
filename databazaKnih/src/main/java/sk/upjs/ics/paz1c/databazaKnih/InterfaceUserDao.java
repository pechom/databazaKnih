package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceUserDao {

    List<User> getAllUsers();

    void insertUser(User user);

    void deleteUser(User user);

    void updateUser(User user);
}
