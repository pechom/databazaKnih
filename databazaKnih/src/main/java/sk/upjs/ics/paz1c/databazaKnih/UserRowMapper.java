package sk.upjs.ics.paz1c.databazaKnih;

import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<User> {


    @Override
    public User mapRow(ResultSet rs, int i) throws SQLException {
       User user=new User();
       user.setId(rs.getInt("iduser"));
       user.setIsAdmin(rs.getBoolean("isAdmin"));
       Timestamp timestamp = rs.getTimestamp("lastLogin");
       if (timestamp != null) {
            user.setLastLogin(timestamp.toLocalDateTime());
        }
       user.setMail(rs.getString("mail"));
       user.setName(rs.getString("name"));
       user.setPasswordHash(rs.getString("passwordHash"));
       user.setSalt(rs.getString("salt"));
       user.setSurname(rs.getString("surname"));
       user.setUserName(rs.getString("userName"));
       
       return user;
    }

}
