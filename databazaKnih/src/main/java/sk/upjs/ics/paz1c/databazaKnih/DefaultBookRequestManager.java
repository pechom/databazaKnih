package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
import java.util.List;

public class DefaultBookRequestManager implements BookRequestManager {

    private InterfaceBookRequestDao requestDao = ObjectFactory.INSTANCE.getBookRequestDao();

    @Override
    public List<BookRequest> getAllRequests() {
        return requestDao.getAllRequests();
    }

    @Override
    public List<BookRequest> getRequestsByRequester(User user) {
        List<BookRequest> requests = getAllRequests();
        List<BookRequest> userRequests = new ArrayList<>();
        for (BookRequest request : requests) {
            if ((request.getRequester() != null) && (request.getRequester().equals(user))) {
                userRequests.add(request);
            }
        }
        return userRequests;
    }

    @Override
    public void insertRequest(BookRequest request) {
        requestDao.insertRequest(request);
    }

    @Override
    public void updateRequest(BookRequest request) {
        requestDao.updateRequest(request);
    }

    @Override
    public void deleteRequest(int id) {
        requestDao.deleteRequest(id);
    }

    @Override
    public void undeleteRequest(int id) {
        requestDao.undeleteRequest(id);
    }

    @Override
    public BookRequest findById(int id) {
        return requestDao.findById(id);
    }

    @Override
    public List<BookRequest> getRequestsByBook(Book book) {
        List<BookRequest> requests = getAllRequests();
        List<BookRequest> bookRequests = new ArrayList<>();
        for (BookRequest request : requests) {
            if ((request.getBook() != null) && (request.getBook().equals(book))) {
                bookRequests.add(request);
            }
        }
        return bookRequests;
    }

    @Override
    public List<BookRequest> getRequestsWhereBookIsNull() {
        List<BookRequest> requests = getAllRequests();
        List<BookRequest> bookRequests = new ArrayList<>();
        for (BookRequest request : requests) {
            if (request.getBook() == null) {
                bookRequests.add(request);
            }
        }
        return bookRequests;
    }

    @Override
    public void deleteAllWithRequester(User user) {
        List<BookRequest> requests = getAllRequests();
        for (BookRequest request : requests) {
            if ((request.getRequester() != null) && (request.getRequester().equals(user))) {
            }
        }
        requestDao.deleteAllWithRequester(user.getId());
    }

    @Override
    public void deleteAllWithBook(Book book) {
        List<BookRequest> requests = getAllRequests();
        for (BookRequest request : requests) {
            if ((request.getBook() != null) && (request.getBook().equals(book))) {
            }
        }
        requestDao.deleteAllWithBook(book.getId());
    }
}
