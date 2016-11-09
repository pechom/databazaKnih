package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;

public interface InterfaceUserGroupDao {

    UserGroup getGroupById(long id);

    List<UserGroup> getGroups();
}
