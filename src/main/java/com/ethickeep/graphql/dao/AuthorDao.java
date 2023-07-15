package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Author;
import com.ethickeep.graphql.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AuthorDao {
    List<Author> findAll();

    Author findById(long id);
    Author save(Author author);
}
