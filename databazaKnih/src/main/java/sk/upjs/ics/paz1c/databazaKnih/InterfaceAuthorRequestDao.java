package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceAuthorRequestDao {

    List<AuthorRequest> getAllRequests();

    void insertRequest(AuthorRequest request);

    void updateRequest(AuthorRequest request);

    void deleteRequest(int id);

    void deleteAllWithRequester(int iduser);

    void deleteAllWithAuthor(int idauthor);

    void undeleteRequest(int id);

    AuthorRequest findById(int id);
}
