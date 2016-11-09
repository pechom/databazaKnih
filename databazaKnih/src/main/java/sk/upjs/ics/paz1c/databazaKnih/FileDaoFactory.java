package sk.upjs.ics.paz1c.databazaKnih;
// neaktualizovana a niektore entity este ani nemaju fileDao
public enum FileDaoFactory {

    INSTANCE;

    private InterfaceUserDao userDao;
    private InterfaceBookDao bookDao;
    private InterfaceAuthorDao authorDao;
    private InterfaceUserGroupDao userGroupDao;
    
    private FileDaoFactory() {
        userDao = new FileUserDao();
        bookDao = new FileBookDao();
        authorDao = new FileAuthorDao();
        userGroupDao=new FileUserGroupDao();
    }

    public InterfaceUserDao getUserDao() {
        return userDao;
    }

    public InterfaceBookDao getBookDao() {
        return bookDao;
    }

    public InterfaceAuthorDao getAuthorDao() {
        return authorDao;
    }
    public InterfaceUserGroupDao getUserGroupDao(){
     return userGroupDao;   
    }

}
