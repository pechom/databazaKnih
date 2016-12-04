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
    public void addRequester(User user, Request request) {
        request.setRequester(user);
        updateRequest(request);
    }

    @Override
    public void removeRequesterFromRequest(Request request) {
        request.setRequester(null);
        updateRequest(request);
    }

    @Override
    public List<Request> removeRequester(User user) {
        List<Request> requests = getAllRequests();
        List<Request> removed = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getRequester() != null) && (request.getRequester().equals(user))) {
                request.setRequester(null);
                updateRequest(request);
                removed.add(request);
            }
        }
        return removed;
    }

    @Override
    public List<Request> deleteAllWithRequester(User user) {
        List<Request> requests = getAllRequests();
        List<Request> removed = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getRequester() != null) && (request.getRequester().equals(user))) {
                deleteRequest(request.getId());
                removed.add(request);
            }
        }
        return removed;
    }

    @Override
    public void addBook(Book book, Request request) {
        request.setBook(book);
        updateRequest(request);
    }

    @Override
    public void removeBookFromRequest(Request request) {
        request.setBook(null);
        updateRequest(request);
    }

    @Override
    public List<Request> removeBook(Book book) {
        List<Request> requests = getAllRequests();
        List<Request> removed = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getBook() != null) && (request.getBook().equals(book))) {
                request.setBook(null);
                updateRequest(request);
                removed.add(request);
            }
        }
        return removed;
    }

    @Override
    public List<Request> deleteAllWithBook(Book book) {
        List<Request> requests = getAllRequests();
        List<Request> removed = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getBook() != null) && (request.getBook().equals(book))) {
                deleteRequest(request.getId());
                removed.add(request);
            }
        }
        return removed;
    }

    @Override
    public void addAuthor(Author author, Request request) {
        request.setAuthor(author);
        updateRequest(request);
    }

    @Override
    public void removeAuthorFromRequest(Request request) {
        request.setAuthor(null);
        updateRequest(request);
    }

    @Override
    public List<Request> removeAuhor(Author author) {
        List<Request> requests = getAllRequests();
        List<Request> removed = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getAuthor() != null) && (request.getAuthor().equals(author))) {
                request.setAuthor(null);
                updateRequest(request);
                removed.add(request);
            }
        }
        return removed;
    }

    @Override
    public List<Request> deleteAllWithAuthor(Author author) {
        List<Request> requests = getAllRequests();
        List<Request> removed = new ArrayList<>();
        for (Request request : requests) {
            if ((request.getAuthor() != null) && (request.getAuthor().equals(author))) {
                deleteRequest(request.getId());
                removed.add(request);
            }
        }
        return removed;
    }

    @Override
    public void undeleteRequest(int id) {
        requestDao.undeleteRequest(id);
    }
}
