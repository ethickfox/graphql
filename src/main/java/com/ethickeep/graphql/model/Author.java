package com.ethickeep.graphql.model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private long id;
    private String name;
    private String thumbnail;
    private List<Post> posts;

    public Author(long id, String name, String thumbnail) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.posts = new ArrayList<>();
    }

    public Author(long id, String name, String thumbnail, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.posts = posts;
    }

    public Author(long id) {
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

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        return id == author.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}
