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

    void addRequester(User user);

    void removeRequester(User user);

    void deleteAllWithRequester(User user);

    void addBook(Book book);

    void deleteAllWithBook(Book book);

    void removeBook(Book book);

    void addAuthor(Author author);

    void removeAuthor(Author author);

    void deleteAllWithAuthor(Author author);

    void insertRequest(Request request);

    void deleteRequest(int id);

    void undeleteRequest(int id);

    Request findById(int id);

}
