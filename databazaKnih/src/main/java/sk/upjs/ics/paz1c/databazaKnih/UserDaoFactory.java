package sk.upjs.ics.paz1c.databazaKnih;

public enum UserDaoFactory {

    INSTANCE;

    private InterfaceUserDao userDao;

    private UserDaoFactory() {
        userDao = new MysqlUserDao();
    }

    public InterfaceUserDao getUserDao() {
        return userDao;
    }

}
