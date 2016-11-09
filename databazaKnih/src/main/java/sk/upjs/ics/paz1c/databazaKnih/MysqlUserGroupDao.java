package sk.upjs.ics.paz1c.databazaKnih;

import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class MysqlUserGroupDao implements InterfaceUserGroupDao {

     JdbcTemplate jdbcTemplate;

    public MysqlUserGroupDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public UserGroup getGroupById(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UserGroup> getGroups() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
