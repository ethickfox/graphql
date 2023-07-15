package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Author;
import com.ethickeep.graphql.model.Comment;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class AuthorArrayDao implements AuthorDao {
    private final List<Author> authors = Data.getAuthors();

    @Override
    public List<Author> findAll() {
        return authors;
    }

    @Override
    public Author findById(long id) {
        return authors.stream().filter(author -> author.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Author save(Author author) {
        authors.add(author);
        return author;
    }

}
