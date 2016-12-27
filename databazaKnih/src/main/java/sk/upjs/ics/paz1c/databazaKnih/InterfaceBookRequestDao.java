package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceBookRequestDao {
    
    List<BookRequest> getAllRequests();

    void insertRequest(BookRequest request);

    void updateRequest(BookRequest request);

    void deleteRequest(int id);

    void deleteAllWithRequester(int iduser);

    void deleteAllWithBook(int idbook);

    void undeleteRequest(int id);

    BookRequest findById(int id);
}
