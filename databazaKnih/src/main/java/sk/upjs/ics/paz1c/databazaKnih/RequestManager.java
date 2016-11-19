package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface RequestManager {

    List<Request> getAllRequests();

    void insertRequest(Request request);

    void deleteRequest(int id);

}
