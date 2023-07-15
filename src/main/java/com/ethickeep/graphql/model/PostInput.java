package com.ethickeep.graphql.model;

public class PostInput {
    private long id;
    private String title;
    private String text;
    private String category;
    private int views;
    private AuthorInput author;

    public PostInput(long id, String title, String text, String category, int views, AuthorInput author) {
        this.id = id;
        this.title = title;
        this.text = text;
        this.category = category;
        this.views = views;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public AuthorInput getAuthor() {
        return author;
    }

    public void setAuthor(AuthorInput author) {
        this.author = author;
    }

    public Post getEntity() {
        return new Post(id, title, text, category, views, author == null ? null : author.getEntity());
    }
}
