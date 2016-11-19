package sk.upjs.ics.paz1c.databazaKnih;

import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import org.springframework.jdbc.core.RowMapper;

class BookRowMapper implements RowMapper<Book> {

    AuthorRowMapper authorRowMapper=new AuthorRowMapper();
    
    @Override
    public Book mapRow(ResultSet rs, int i) throws SQLException {
       Book book=new Book();
       book.setAverageOfReviews(rs.getInt("averageOfRviews"));
       book.setBayesianAverage(rs.getInt("bayesianAverage"));
       book.setDescription(rs.getString("description"));
       book.setISBN(rs.getInt("ISBN"));
       book.setId(rs.getInt("idbook"));
       book.setName(rs.getString("name"));
       book.setNumberInChart(rs.getInt("numberInChart"));
       book.setNumberOfPages(rs.getInt("numberOfPages"));
       book.setNumberOfReviews(rs.getInt("numberOfPages"));
       book.setNumberOfReviews(rs.getInt("numberOfReviews"));
       book.setVerificationStatus(rs.getBoolean("verificationStatus"));
       book.setYear(rs.getInt("year"));
       
       book.setAuthor(authorRowMapper.mapRow(rs, i));
       
       return book;
    }

}
