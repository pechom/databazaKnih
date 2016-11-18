package sk.upjs.ics.paz1c.databazaKnih;

// tu budu metody s uzivatelmi napr dnes prihlaseni, neprhlaseni viac ako rok...
import java.util.List;

public class DefaultUserManager implements UserManager {
    
    private InterfaceUserDao userDao = MySQLDaoFactory.INSTANCE.getUserDao();
    
    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
    
    @Override
    public void insertUser(User user) {
        userDao.insertUser(user);
    }

    @Override
    public void deleteUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUser(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
