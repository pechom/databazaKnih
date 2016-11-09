package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface UsersManager {

    List<User> getAllUsers();

    void insertUser(User user);

    void deleteUser(int id);

    void updateUser(int id);

}
