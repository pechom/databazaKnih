package sk.upjs.ics.paz1c.databazaKnih;

//metody na filtre na parametre.Tam kde je autor null je request o knihe, ked je kniha null tak o autorovi a ak obe tak o niecom inom (zaner, tag ...)
import java.util.ArrayList;
import java.util.List;

public class DefaultRequestManager implements RequestManager {
    
    private InterfaceRequestDao requestDao = ObjectFactory.INSTANCE.getRequestDao();
    
    @Override
    public List<Request> getAllRequests() {
        return requestDao.getAllRequests();
    }
    
    @Override
    public void insertRequest(Request request) {
        requestDao.insertRequest(request);
    }
    
    @Override
    public void deleteRequest(int id) {
        requestDao.deleteRequest(id);
    }
    
    @Override
    public Request findById(int id) {
        return requestDao.findById(id);
    }
    
    public void updateRequest(Request request) {
        requestDao.updateRequest(request);
    }
    
    @Override
    public List<Request> getRequestsByRequester(User user) {
        List<Request> requests = getAllRequests();
        List<Request> userRequests = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getRequester() != null) && (request.getRequester().equals(user))) {
                userRequests.add(request);
            }
        }
        return userRequests;
    }
    
    @Override
    public List<Request> getRequestsByAuthor(Author author) {
        List<Request> requests = getAllRequests();
        List<Request> authorRequests = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getAuthor() != null) && (request.getAuthor().equals(author))) {
                authorRequests.add(request);
            }
        }
        return authorRequests;
    }
    
    @Override
    public List<Request> getRequestsByBook(Book book) {
        List<Request> requests = getAllRequests();
        List<Request> bookRequests = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getBook() != null) && (request.getBook().equals(book))) {
                bookRequests.add(request);
            }
        }
        return bookRequests;
    }
    
    @Override
    public List<Request> getRequestsWhereAuthorIsNull() {
        List<Request> requests = getAllRequests();
        List<Request> authorRequests = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getAuthor() == null) && (request.getBook() != null)) {
                authorRequests.add(request);
            }
        }
        return authorRequests;
    }
    
    @Override
    public List<Request> getRequestsWhereBookIsNull() {
        List<Request> requests = getAllRequests();
        List<Request> authorRequests = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getAuthor() != null) && (request.getBook() == null)) {
                authorRequests.add(request);
            }
        }
        return authorRequests;
    }
    
    @Override
    public List<Request> getRequestsWhereBothAreNull() {
        List<Request> requests = getAllRequests();
        List<Request> authorRequests = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getAuthor() == null) && (request.getBook() == null)) {
                authorRequests.add(request);
            }
        }
        return authorRequests;
    }
    
    @Override
    public void deleteAllWithRequester(User user) {
        List<Request> requests = getAllRequests();
        for (Request request : requests) {
            if ((request.getRequester() != null) && (request.getRequester().equals(user))) {
            }
        }
        requestDao.deleteAllWithRequester(user.getId());
    }
    
    @Override
    public void deleteAllWithBook(Book book) {
        List<Request> requests = getAllRequests();
        for (Request request : requests) {
            if ((request.getBook() != null) && (request.getBook().equals(book))) {
            }
        }
        requestDao.deleteAllWithBook(book.getId());
    }
    
    @Override
    public void deleteAllWithAuthor(Author author) {
        List<Request> requests = getAllRequests();
        for (Request request : requests) {
            if ((request.getAuthor() != null) && (request.getAuthor().equals(author))) {
            }
        }
        requestDao.deleteAllWithAuthor(author.getId());
    }
    
    @Override
    public void undeleteRequest(int id) {
        requestDao.undeleteRequest(id);
    }
}
