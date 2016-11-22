package sk.upjs.ics.paz1c.databazaKnih;

//metody na filtre na parametre
import java.util.List;

public class DefaultRequestManager implements RequestManager {

    private InterfaceRequestDao requestDao = ObjectFactory.INSTANCE.getRequestDao();

    @Override
    public List<Request> getAllRequests() {
        return requestDao.getAllRequests();
    }

    @Override
    public void insertRequest(Request request) {
        requestDao.insertRequest(request);
    }

    @Override
    public void deleteRequest(int id) {
        requestDao.deleteRequest(id);
    }

    @Override
    public Request findById(int id) {
        return requestDao.findById(id);
    }
}
