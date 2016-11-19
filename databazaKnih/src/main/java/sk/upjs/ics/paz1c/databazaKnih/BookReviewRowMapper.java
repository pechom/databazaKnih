package sk.upjs.ics.paz1c.databazaKnih;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;


public class BookReviewRowMapper implements RowMapper<BookReview>{

    BookRowMapper bookRowMapper=new BookRowMapper();
    UserRowMapper userRowMapper=new UserRowMapper();
    
    @Override
    public BookReview mapRow(ResultSet rs, int i) throws SQLException {
        BookReview bookReview=new BookReview();
        bookReview.setId(rs.getInt("idbookreview"));
        bookReview.setRating(rs.getInt("rating"));
        bookReview.setReview(rs.getString("review"));
        
        bookReview.setBook(bookRowMapper.mapRow(rs, i));
        bookReview.setUser(userRowMapper.mapRow(rs, i));
        
        return bookReview;
    }
    
}
