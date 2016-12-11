package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceUserDao {

    List<User> getAllUsers();

    void insertUser(User user);

    void deleteUser(int id);

    void undeleteUser(int id);

    void updateUser(User user);

    User findById(int id);

    void changePassword(User user);


}
