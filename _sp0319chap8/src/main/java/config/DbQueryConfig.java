package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dbquery.DbQuery;

@Configuration
public class DbQueryConfig {
	
	@Autowired
	private javax.sql.DataSource dataSource;
	
	//의존성주입
	@Bean
	public DbQuery dbQuery() {
		return new DbQuery(dataSource);
	}
	

}
