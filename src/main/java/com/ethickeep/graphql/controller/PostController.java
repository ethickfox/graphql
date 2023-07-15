package com.ethickeep.graphql.controller;

import com.ethickeep.graphql.dao.AuthorDao;
import com.ethickeep.graphql.dao.CommentDao;
import com.ethickeep.graphql.dao.PostDao;
import com.ethickeep.graphql.model.*;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.Comparator;
import java.util.List;

@Controller
public class PostController {
    private PostDao postDao;
    private AuthorDao authorDao;
    private CommentDao commentDao;

    public PostController(PostDao postDao, AuthorDao authorDao, CommentDao commentDao) {
        this.postDao = postDao;
        this.authorDao = authorDao;
        this.commentDao = commentDao;
    }

    @QueryMapping
    public List<Post> recentPosts(@Argument int count, @Argument Integer offset) {
        return postDao.findAll(count, offset);
    }

    @QueryMapping
    public Comment lastComment(@Argument long authorId) {
        return commentDao.findByAuthor(new Author(authorId)).stream().max(Comparator.comparing(Comment::getDate)).orElse(null);
    }

    @QueryMapping
    public Author author(@Argument long authorId) {
        return authorDao.findById(authorId);
    }

    @QueryMapping
    public List<Author> authors() {
        return authorDao.findAll();
    }

    @MutationMapping
    public Post createPost(@Argument(name = "post") PostInput post) {
        return postDao.save(post.getEntity());
    }

    @MutationMapping
    public Author author(@Argument(name = "author") AuthorInput author) {
        return authorDao.save(author.getEntity());
    }

    @SchemaMapping
    public Author author(Post post) {
        return authorDao.findById(post.getAuthor().getId());
    }
}
