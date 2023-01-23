package com.example.kil.controller;

import com.example.kil.entity.Post;
import com.example.kil.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/post")
public class PostController {


    @Autowired
    PostService postService;
    @PostMapping("")

    private Post submitUserPost(@RequestBody Post post){
        return postService.submitPostToDb(post);
    }
    @GetMapping("/post")
    private ArrayList<Post> getAllPosts(){
        return postService.retrivePostData();

    }
}