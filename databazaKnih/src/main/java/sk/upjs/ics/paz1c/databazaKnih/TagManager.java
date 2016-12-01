package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface TagManager {

    List<Tag> getAllTags();

    Tag getTagByName(String name);

    void addBooksToTag(List<Book> books, Tag tag);

    void removeBooksFromTag(List<Book> book, Tag tag);

    List<Tag> removeBook(Book book);//odstrani knihu zo vsetkych vztahov

    void insertTag(Tag tag);

    void deleteTag(int id);
    
    void undeleteTag(Tag tag);

    void updateTag(Tag tag);

    Tag findById(int id);

}
