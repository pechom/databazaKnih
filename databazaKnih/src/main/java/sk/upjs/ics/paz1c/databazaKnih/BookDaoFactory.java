package sk.upjs.ics.paz1c.databazaKnih;

public enum BookDaoFactory {
    INSTANCE;
    private InterfaceBookDao bookDao;

    private BookDaoFactory() {
        bookDao = new MysqlBookDao();
    }

    public InterfaceBookDao getBookDao() {
        return bookDao;
    }
}
