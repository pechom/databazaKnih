package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
import java.util.List;

public class DefaultAuthorRequestManager implements AuthorRequestManager {

    private InterfaceAuthorRequestDao requestDao = ObjectFactory.INSTANCE.getAuthorRequestDao();

    @Override
    public List<AuthorRequest> getAllRequests() {
        return requestDao.getAllRequests();
    }

    @Override
    public void insertRequest(AuthorRequest request) {
        requestDao.insertRequest(request);
    }

    @Override
    public void deleteRequest(int id) {
        requestDao.deleteRequest(id);
    }

    @Override
    public AuthorRequest findById(int id) {
        return requestDao.findById(id);
    }

    @Override
    public void updateRequest(AuthorRequest request) {
        requestDao.updateRequest(request);
    }

    @Override
    public List<AuthorRequest> getRequestsByRequester(User user) {
        List<AuthorRequest> requests = getAllRequests();
        List<AuthorRequest> userRequests = new ArrayList<>();
        for (AuthorRequest request : requests) {
            if ((request.getRequester() != 0) && (request.getRequester() == (user.getId()))) {
                userRequests.add(request);
            }
        }
        return userRequests;
    }

    @Override
    public List<AuthorRequest> getRequestsByAuthor(Author author) {
        List<AuthorRequest> requests = getAllRequests();
        List<AuthorRequest> authorRequests = new ArrayList<>();
        for (AuthorRequest request : requests) {
            if ((request.getAuthor() != 0) && (request.getAuthor() == (author.getId()))) {
                authorRequests.add(request);
            }
        }
        return authorRequests;
    }

    @Override
    public List<AuthorRequest> getRequestsWhereAuthorIsNull() {
        List<AuthorRequest> requests = getAllRequests();
        List<AuthorRequest> authorRequests = new ArrayList<>();
        for (AuthorRequest request : requests) {
            if (request.getAuthor() == 0) {
                authorRequests.add(request);
            }
        }
        return authorRequests;
    }

    @Override
    public void deleteAllWithRequester(User user) {
        List<AuthorRequest> requests = getAllRequests();
        for (AuthorRequest request : requests) {
            if ((request.getRequester() != 0) && (request.getRequester() == (user.getId()))) {
            }
        }
        requestDao.deleteAllWithRequester(user.getId());
    }

    @Override
    public void deleteAllWithAuthor(Author author) {
        List<AuthorRequest> requests = getAllRequests();
        for (AuthorRequest request : requests) {
            if ((request.getAuthor() != 0) && (request.getAuthor() == (author.getId()))) {
            }
        }
        requestDao.deleteAllWithAuthor(author.getId());
    }

    @Override
    public void undeleteRequest(int id) {
        requestDao.undeleteRequest(id);
    }
}
