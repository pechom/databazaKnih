package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class RequestRowMapper implements RowMapper<Request>{

    AuthorRowMapper authorRowMapper=new AuthorRowMapper();
    BookRowMapper bookRowMapper=new BookRowMapper();
    UserRowMapper userRowMapper=new UserRowMapper();
    
    @Override
    public Request mapRow(ResultSet rs, int i) throws SQLException {
       Request request=new Request();
       request.setContent(rs.getString("content"));
       request.setId(rs.getInt("idrequest"));
       
       request.setAuthor(authorRowMapper.mapRow(rs, i));
       request.setBook(bookRowMapper.mapRow(rs, i));
       request.setRequester(userRowMapper.mapRow(rs, i));
       
       return request;
       
    }
    
}
