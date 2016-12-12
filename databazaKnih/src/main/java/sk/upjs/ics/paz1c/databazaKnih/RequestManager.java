package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface RequestManager {

    List<Request> getAllRequests();

    List<Request> getRequestsByRequester(User user);

    List<Request> getRequestsByAuthor(Author author);

    List<Request> getRequestsByBook(Book book);

    List<Request> getRequestsWhereAuthorIsNull();

    List<Request> getRequestsWhereBookIsNull();

    List<Request> getRequestsWhereBothAreNull();

    void deleteAllWithRequester(User user);

    void deleteAllWithBook(Book book);

    void deleteAllWithAuthor(Author author);

    void insertRequest(Request request);

    void updateRequest(Request request);

    void deleteRequest(int id);

    void undeleteRequest(int id);

    Request findById(int id);

}
