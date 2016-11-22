package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
// metody na filtre na parametre, overenost

public class DefaultTagManager implements TagManager {

    private InterfaceTagDao tagDao = ObjectFactory.INSTANCE.getTagDao();

    @Override
    public List<Tag> getAllTag() {
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

}
