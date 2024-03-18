package practice;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DbConfig {

	/**
	 * Configuring a data source bean in a Java Spring application. 
	 * This data source bean is used to establish a connection to a MySQL database.
	 **/
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource() {
		
		//DataSource: DB 연결점 만들어주는 library 이전에 했던 'Connect... 이런 걸 얘가 자동으로 해줌!
		//DataSource is used for managing database connections and that it handles some aspects of connection management automatically. 
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost/project2?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("mysql");
		// Setting the initial number of connections to be created when the pool is initialized
		ds.setInitialSize(2);
		// Setting the maximum number of active connections that can be allocated from this pool
		ds.setMaxActive(10);
		return ds;
	}

}
