package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class TagRowMapper implements RowMapper<Tag> {

    @Override
    public Tag mapRow(ResultSet rs, int i) throws SQLException {
        Tag tag=new Tag();
        tag.setId(rs.getInt("idtag"));
        tag.setName(rs.getString("name"));
        tag.setIsActive(rs.getBoolean("isActive"));
        
        return tag;
    }
    
}
