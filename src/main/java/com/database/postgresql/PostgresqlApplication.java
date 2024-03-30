package com.database.postgresql;

import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
@Log
public class PostgresqlApplication implements CommandLineRunner {
	private final DataSource dataSource;

	public PostgresqlApplication(final DataSource dataSource){
		this.dataSource = dataSource;
	}

	public static void main(String[] args) {
		SpringApplication.run(PostgresqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("DataSource: "+dataSource.toString());
		final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("select 1");
	}
}
