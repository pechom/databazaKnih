package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class GenreRowMapper implements RowMapper<Genre>{

    @Override
    public Genre mapRow(ResultSet rs, int i) throws SQLException {
      Genre genre=new Genre();
      genre.setId(rs.getInt("idgenre"));
      genre.setName(rs.getString("name"));
      genre.setIsActive(rs.getBoolean("isActive"));
      
      return genre;
    }
    
}
