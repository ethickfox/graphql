package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Post;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PostArrayDao implements PostDao {
    private final List<Post> posts = Data.getPosts();

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public List<Post> findAll(int count) {
        return posts.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Post> findAll(int count, Integer offset) {
        return posts.stream().skip(offset).limit(count).collect(Collectors.toList());
    }

    @Override
    public Optional<Post> findById(int id) {
        return posts.stream().filter(post -> post.getId() == id).findFirst();
    }

    @Override
    public Post save(Post post) {
        posts.add(post);
        return post;
    }
}
