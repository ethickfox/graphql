package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Author;
import com.ethickeep.graphql.model.Comment;
import com.ethickeep.graphql.model.Post;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Data {

    private static final List<Author> authors = new ArrayList<>();
    private static List<Post> posts = new ArrayList<>();
    private static final List<Comment> comments = new ArrayList<>();

    static {
        authors.add(new Author(0, "author1", "thumbnail"));
        authors.add(new Author(1, "author2", "thumbnail"));
        authors.add(new Author(2, "author3", "thumbnail"));

        posts.add(new Post(0, "Post1", "Text", "category", 0, authors.get(0)));
        posts.add(new Post(1, "Post2", "Text", "category", 0, authors.get(0)));
        posts.add(new Post(2, "Post3", "Text", "category", 0, authors.get(1)));
        posts.add(new Post(3, "Post4", "Text", "category", 0, authors.get(2)));
        posts.add(new Post(4, "Post5", "Text", "category", 0, authors.get(2)));

        authors.get(0).setPosts(posts.stream().skip(0).limit(2).collect(Collectors.toList()));
        authors.get(1).setPosts(posts.stream().skip(2).limit(1).collect(Collectors.toList()));
        authors.get(2).setPosts(posts.stream().skip(3).limit(2).collect(Collectors.toList()));

        comments.add(new Comment(0,authors.get(0),posts.get(1), LocalDate.now().minusDays(2)));
        comments.add(new Comment(1,authors.get(1),posts.get(2), LocalDate.now().minusDays(3)));
        comments.add(new Comment(2,authors.get(2),posts.get(3), LocalDate.now().minusDays(4)));
        comments.add(new Comment(3,authors.get(2),posts.get(4), LocalDate.now().minusDays(5)));
        comments.add(new Comment(4,authors.get(1),posts.get(0), LocalDate.now().minusDays(6)));
        comments.add(new Comment(5,authors.get(0),posts.get(2), LocalDate.now().minusDays(7)));
        comments.add(new Comment(6,authors.get(2),posts.get(4), LocalDate.now().minusDays(8)));
    }


    public static List<Author> getAuthors() {
        return authors;
    }

    public static List<Comment> getComments() {
        return comments;
    }

    public static List<Post> getPosts() {
        return posts;
    }
}
