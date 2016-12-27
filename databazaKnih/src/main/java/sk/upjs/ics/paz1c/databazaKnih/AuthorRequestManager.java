package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface AuthorRequestManager {

    List<AuthorRequest> getAllRequests();

    List<AuthorRequest> getRequestsByRequester(User user);

    List<AuthorRequest> getRequestsByAuthor(Author author);

    List<AuthorRequest> getRequestsWhereAuthorIsNull();

    void deleteAllWithRequester(User user);

    void deleteAllWithAuthor(Author author);

    void insertRequest(AuthorRequest request);

    void updateRequest(AuthorRequest request);

    void deleteRequest(int id);

    void undeleteRequest(int id);

    AuthorRequest findById(int id);
}
