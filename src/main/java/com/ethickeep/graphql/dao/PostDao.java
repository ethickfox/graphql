package com.ethickeep.graphql.dao;

import com.ethickeep.graphql.model.Post;
import com.ethickeep.graphql.model.PostInput;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

public interface PostDao {
    List<Post> findAll();

    List<Post> findAll(int count);

    List<Post> findAll(int count, Integer offset);

    Optional<Post> findById(int id);
    Post save(Post post);
}
