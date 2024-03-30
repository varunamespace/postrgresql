package com.database.postgresql.dao;

import com.database.postgresql.domain.books;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Optional;

public class bookDAO {
    private final JdbcTemplate jdbcTemplate;

    public bookDAO(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    public void bookCreate(books book){
        jdbcTemplate.update("INSERT INTO books(id,title,author_id) VALUES (?,?,?)",
                book.getId(),book.getTitle(),book.getAuthor_id());
    }
}
