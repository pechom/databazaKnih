package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceTagDao {

    List<Tag> getAllTag();

    void insertTag(Tag tag);

    void deleteTag(int id);

    void undeleteTag(int id);

    void updateTag(Tag tag);

    Tag findById(int id);

}
