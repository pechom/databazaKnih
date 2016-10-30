package sk.upjs.ics.paz1c.databazaKnih;

public enum AuthorDaoFactory {
    INSTANCE;
    public InterfaceAuthorDao authorDao;

    private AuthorDaoFactory() {
        authorDao = new MysqlAuthorDao();
    }

    public InterfaceAuthorDao getAuthorDao() {
        return authorDao;
    }
}
