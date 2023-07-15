package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Author;
import com.ethickeep.graphql.model.Comment;
import com.ethickeep.graphql.model.Post;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class CommentArrayDao implements CommentDao {
    private final List<Comment> comments = Data.getComments();

    @Override
    public List<Comment> findAll() {
        return comments;
    }

    @Override
    public List<Comment> findByAuthor(Author author) {
        return comments.stream().filter(comment -> comment.getAuthor().equals(author)).collect(Collectors.toList());
    }
}
