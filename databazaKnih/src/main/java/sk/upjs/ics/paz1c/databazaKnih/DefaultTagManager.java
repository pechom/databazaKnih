package sk.upjs.ics.paz1c.databazaKnih;

import java.util.ArrayList;
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
    public Tag getTagByName(String name) {
        List<Tag> tags = getAllTags();
        Tag nameTag = null;
        for (Tag tag : tags) {
            if ((tag.getName() != null) && (tag.getName().equals(name))) {
                nameTag = tag;
                break;
            }
        }
        return nameTag;
    }

    @Override
    public void addBooksToTag(List<Integer> books, Tag tag) {
        for (int book : books) {
            if (!tag.getBooksWithTag().contains(book)) {
                tag.getBooksWithTag().add(book);
                tagDao.addBookToTag(book, tag.getId());
            }
        }
    }

    @Override
    public void removeBooksFromTag(List<Integer> books, Tag tag) {
        for (int book : books) {
            if (tag.getBooksWithTag().contains(book)) {
                tag.getBooksWithTag().remove(book);
                tagDao.removeBookFromTag(book, tag.getId());
            }
        }
    }

    @Override
    public void removeBook(Book book) {
        List<Tag> tags = getAllTags();
        for (Tag tag : tags) {
            if (tag.getBooksWithTag().contains(book.getId())) {
                tag.getBooksWithTag().remove(book.getId());
            }
        }
        tagDao.removeBook(book.getId());
    }

    @Override
    public void undeleteTag(int id) {
        tagDao.undeleteTag(id);
    }
}
