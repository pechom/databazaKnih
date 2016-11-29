package sk.upjs.ics.paz1c.databazaKnih;

import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

class AuthorRowMapper implements RowMapper<Author> {


    
    @Override
    public Author mapRow(ResultSet rs, int i) throws SQLException {
      Author author=new Author();
      author.setBiography(rs.getString("biography"));
      author.setBirth(rs.getInt("birth"));
      author.setDeath(rs.getInt("death"));
      author.setId(rs.getInt("idauthor"));
      author.setLifeStatus(rs.getBoolean("lifeStatus"));
      author.setName(rs.getString("name"));
      author.setNationality(rs.getString("nationality"));
      author.setSex(rs.getString("sex"));
      author.setVerificationStatus(rs.getBoolean("verificationStatus"));
      author.setIsActive(rs.getBoolean("isActive"));
      return author;

    }

}
