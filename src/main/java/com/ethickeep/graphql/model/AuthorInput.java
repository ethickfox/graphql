package com.ethickeep.graphql.model;

import java.util.List;

public class AuthorInput {
    private long id;
    private String name;
    private String thumbnail;
    private List<PostInput> posts;

    public AuthorInput() {
    }

    public AuthorInput(long id, String name, String thumbnail) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
    }

    public AuthorInput(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<PostInput> getPosts() {
        return posts;
    }

    public void setPosts(List<PostInput> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorInput author = (AuthorInput) o;

        return id == author.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }

    public Author getEntity() {
        return new Author(id,name,thumbnail);
    }
}
