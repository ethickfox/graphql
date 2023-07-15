package com.ethickeep.graphql.model;

import java.time.LocalDate;

public class Comment {
    private long id;
    private Author author;
    private Post post;
    private LocalDate date;

    public Comment(long id, Author author, Post post, LocalDate date) {
        this.id = id;
        this.author = author;
        this.post = post;
        this.date = date;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
