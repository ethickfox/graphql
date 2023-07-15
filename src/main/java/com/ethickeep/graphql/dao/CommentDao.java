package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Author;
import com.ethickeep.graphql.model.Comment;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CommentDao {
    List<Comment> findAll();

    List<Comment> findByAuthor(Author author);
}
