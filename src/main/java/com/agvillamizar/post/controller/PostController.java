package com.agvillamizar.post.controller;

import com.agvillamizar.post.model.Post;
import com.agvillamizar.post.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/blog/{blogId}/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/{postId}")
    public ResponseEntity<Post> getPost(@PathVariable("blogId") String blogId, @PathVariable("postId") String postId) {
        Post post = postService.getPost(postId, blogId);
        return ResponseEntity.ok(post);
    }

    @PutMapping
    public ResponseEntity<String> updatePost(@PathVariable String blogId, @RequestBody Post request) {
        return ResponseEntity.ok(postService.updatePost(request, blogId));
    }

    @PostMapping
    public ResponseEntity<String> createPost(@PathVariable String blogId, @RequestBody Post request) {
        return ResponseEntity.ok(postService.createPost(request, blogId));
    }

    @DeleteMapping(value = "/{postId}")
    public ResponseEntity<String> deletePost(@PathVariable("blogId") String blogId, @PathVariable("postId") String postId) {
        return ResponseEntity.ok(postService.deletePost(postId, blogId));
    }
}
