package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceRequestDao {

    List<Request> getAllRequests();

    void insertRequest(Request request);

    void updateRequest(Request request);

    void deleteRequest(int id);

    void undeleteRequest(int id);

    Request findById(int id);

}
