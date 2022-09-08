package com.agvillamizar.post.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Post {

    private long id;
    private String postId;
    private String title;
    private String description;
    private String blogId;
}
