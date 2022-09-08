package com.agvillamizar.post.service;

import com.agvillamizar.post.model.Post;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class PostService {

    private final Random rand = new Random();

    public Post getPost(String postId, String blogId) {
        Post post = new Post();
        post.setId(rand.nextLong(1000));
        post.setPostId(postId);
        post.setTitle("Post title");
        post.setDescription("Blog entry");
        post.setBlogId(blogId);

        return post;
    }

    public String createPost(Post post, String blogId) {
        String responseMessage = null;
        if (post != null) {
            post.setBlogId(blogId);
            responseMessage = String.format("This is the post and the object is %s", post);
        }

        return responseMessage;
    }

    public String updatePost(Post post, String blogId) {
        String responseMessage = null;
        if (post != null) {
            post.setBlogId(blogId);
            responseMessage = String.format("This is the put and the object is: %s", post);
        }

        return responseMessage;
    }

    public String deletePost(String postId, String blogId) {
        return String.format("Deleting post with id %s for the blog %s", postId, blogId);
    }
}
