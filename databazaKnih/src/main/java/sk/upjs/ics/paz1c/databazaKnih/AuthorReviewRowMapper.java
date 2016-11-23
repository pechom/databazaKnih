package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class AuthorReviewRowMapper implements RowMapper<AuthorReview>{

    private AuthorRowMapper authorRowMapper= new AuthorRowMapper();
    private UserRowMapper userRowMapper=new UserRowMapper();
    
    @Override
    public AuthorReview mapRow(ResultSet rs, int i) throws SQLException {
        AuthorReview authorReview= new AuthorReview();
        authorReview.setId(rs.getInt("idauthorreview"));
        authorReview.setRating(rs.getInt("rating"));
        authorReview.setReview(rs.getString("review"));
        
        
        authorReview.setAuthor(authorRowMapper.mapRow(rs, i));
        authorReview.setUser(userRowMapper.mapRow(rs, i));
        
        return authorReview;
    }
    
}
