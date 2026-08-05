package com.coachslb.workshopmongo.controller;

import com.coachslb.workshopmongo.domain.Post;
import com.coachslb.workshopmongo.domain.User;
import com.coachslb.workshopmongo.domain.dto.UserDTO;
import com.coachslb.workshopmongo.service.PostService;
import com.coachslb.workshopmongo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/posts")
public class PostController {

    private final PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id){
        Post post = service.findById(id);

        return ResponseEntity.ok().body(post);
    }
}
