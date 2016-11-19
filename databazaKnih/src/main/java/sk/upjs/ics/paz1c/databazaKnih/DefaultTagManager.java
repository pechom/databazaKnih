package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
// metody na overene,neoverene tagy
public class DefaultTagManager implements TagManager{
    
   private InterfaceTagDao TagDao = MySQLDaoFactory.INSTANCE.getTagDao();

    @Override
    public List<Tag> getAllTag() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertTag(Tag tag) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteTag(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTag(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
