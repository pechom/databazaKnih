package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s uzivatelmi
import java.util.List;

public class DefaultUsersManager implements UsersManager {
    
    private InterfaceUserDao userDao = UserDaoFactory.INSTANCE.getUserDao();
    
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }
    
    @Override
    public void deleteUser(User user) {
        userDao.deleteUser(user);
    }
    
    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
    
}
