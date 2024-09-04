package com.example.codinglive.Controller;

import com.example.codinglive.Entity.Post;
import com.example.codinglive.Service.PostService;
import javafx.geometry.Pos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("searchPostById")
    public Post searchPostById(@RequestParam Integer id){
        return postService.getById(id);
    }
}
