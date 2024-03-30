package com.database.postgresql.dao;

import com.database.postgresql.domain.authors;
import org.springframework.jdbc.core.JdbcTemplate;

public class authorDAO {
    private final JdbcTemplate jdbcTemplate;

    public authorDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public void createAuthor(authors author){
        jdbcTemplate.update("INSERT INTO authors (id,name,age) VALUES (?,?,?)",
                author.getId(),author.getName(),author.getAge()
        );
    }
}
