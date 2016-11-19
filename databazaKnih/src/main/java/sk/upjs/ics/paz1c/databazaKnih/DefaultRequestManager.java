package sk.upjs.ics.paz1c.databazaKnih;

//metody na requesty podla knihy, autora, tie kde je kniha null(tykaju sa priamo autora)
import java.util.List;

public class DefaultRequestManager implements RequestManager {

    private InterfaceRequestDao requestDao = MySQLDaoFactory.INSTANCE.getRequestDao();

    @Override
    public List<Request> getAllRequests() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertRequest(Request request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteRequest(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
