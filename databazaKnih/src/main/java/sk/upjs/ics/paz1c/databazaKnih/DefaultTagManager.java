package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
// metody na filtre na parametre, overenost

public class DefaultTagManager implements TagManager {

    private InterfaceTagDao tagDao = ObjectFactory.INSTANCE.getTagDao();

    @Override
    public List<Tag> getAllTags() {
        return tagDao.getAllTag();
    }

    @Override
    public void insertTag(Tag tag) {
        tagDao.insertTag(tag);
    }

    @Override
    public void deleteTag(int id) {
        tagDao.deleteTag(id);
    }

    @Override
    public void updateTag(Tag tag) {
        tagDao.updateTag(tag);
    }

    @Override
    public Tag findById(int id) {
        return tagDao.findById(id);
    }

    @Override
    public List<Tag> getActiveTags() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Tag getTagByName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addBooksToTag(List<Book> books, Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBooksFromTag(List<Book> book, Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeBook(Book book) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void undeleteTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
