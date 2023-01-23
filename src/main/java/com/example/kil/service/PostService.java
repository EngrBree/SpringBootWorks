package com.example.kil.service;

import com.example.kil.entity.Post;
import com.example.kil.repository.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PostService {

    @Autowired
    PostRepo postRepo;
    public Post submitPostToDb(Post post){
        return postRepo.save(post);
    }
    public ArrayList<Post>retrivePostData(){
        return postRepo.findAll();
    }

}
