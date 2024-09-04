package com.example.codinglive.Service;

import com.example.codinglive.Entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {

    @Autowired
    RestTemplate restTemplate;

    private static final String API_URL = "https://jsonplaceholder.typicode.com/posts";

    public Post[] getAllPost(){
        return restTemplate.getForObject(API_URL, Post[].class);
    }

    public Post getById(Integer id){
        String url = API_URL + "/" + id;
        return restTemplate.getForObject(url,Post.class);
    }
}
