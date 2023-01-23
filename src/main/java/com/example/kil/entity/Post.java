package com.example.kil.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.sql.Timestamp;

@Entity
public class Post {
    @Id
    @GeneratedValue
    int id;
   private String postId;
   private String userId;
   private String path;
    private Timestamp timestamp;
    private int likeCount;

    public Post() {
        super();
    }

    public Post(int id, String postId, String userId, String path, Timestamp timestamp, int likeCount) {
        this.id = id;
        this.postId = postId;
        this.userId = userId;
        this.path = path;
        this.timestamp = timestamp;
        this.likeCount = likeCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public int getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(int likeCount) {
        this.likeCount = likeCount;
    }
}
