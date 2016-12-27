package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface BookRequestManager {

    List<BookRequest> getAllRequests();

    List<BookRequest> getRequestsByRequester(User user);

    List<BookRequest> getRequestsByBook(Book book);

    List<BookRequest> getRequestsWhereBookIsNull();

    void deleteAllWithRequester(User user);

    void deleteAllWithBook(Book book);

    void insertRequest(BookRequest request);

    void updateRequest(BookRequest request);

    void deleteRequest(int id);

    void undeleteRequest(int id);

    BookRequest findById(int id);
}
