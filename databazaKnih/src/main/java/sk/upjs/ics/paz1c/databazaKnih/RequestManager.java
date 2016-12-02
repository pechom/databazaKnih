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

    void addRequester(User user, Request request);

    void removeRequesterFromRequest(Request request);

    List<Request> removeRequester(User user);

    List<Request> deleteAllWithRequester(User user);

    void addBook(Book book, Request request);

    void removeBookFromRequest(Request request);

    List<Request> removeBook(Book book);

    List<Request> deleteAllWithBook(Book book);

    void addAuthor(Author author, Request request);

    void removeAuthorFromRequest(Request request);

    List<Request> removeAuhor(Author author);

    List<Request> deleteAllWithAuthor(Author author);

    void insertRequest(Request request);

    void updateRequest(Request request);

    void deleteRequest(int id);

    void undeleteRequest(int id);

    Request findById(int id);

}
