package practice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class MemberDao {
	
    private JdbcTemplate jdbcTemplate;

    public MemberDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
    
    public int count() {
    	//queryForObject method returns an object, not a primitive type.
    	//By providing Integer.class, you are informing the method that you expect an Integer result from the query.
    	Integer count = jdbcTemplate.queryForObject("select count(*) from member", Integer.class);
        return count;
     }
    
    public String memberName(int memberno) {
    	String name = jdbcTemplate.queryForObject("SELECT name FROM member WHERE memberno = ?", String.class, memberno);
    	//?가 복수개면 ,로 계속 입력해주면 된다
    	return name;
    }

    public void insert(Member member) {
    	//insert, update, delete는 queryForObject 대신 update로 쓴다.
    	jdbcTemplate.update("INSERT INTO member(id, pw, name) VALUES(?, ?, ?)", member.getId(), member.getPw(), member.getName());
    }
    
    public void update(Member member) {
    	jdbcTemplate.update("UPDATE member SET pw = ?, name = ? WHERE memberno = ?", member.getPw(), member.getName(), member.getMemberno());
    }
    
    public void delete(int memberno) {
    	jdbcTemplate.update("DELETE FROM member WHERE memberno = ?", memberno);
    }
    
//    public List<Member> selectAll(){
//    	List<Member> results = jdbcTemplate.query("SELECT * FROM member", new RowMapper<Member>() {
//
//    		//익명의 interface 구현객체 생성
//			@Override
//			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Member dto = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("pw"), rs.getString("name"));
//				return dto;
//			}
//    	});
//    	return results;
//    }

    //위에 동일한 method를 람다식으로 처리
    public List<Member> selectAll(){
    	List<Member> results = jdbcTemplate.query("SELECT * FROM member", 
  			(ResultSet rs, int rowNum) -> { Member dto = new Member(rs.getInt("memberno"), rs.getString("id"), rs.getString("pw"), rs.getString("name"));
			return dto;
    	});
    	return results;
    }
    
    
}
