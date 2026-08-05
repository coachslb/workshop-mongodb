package com.coachslb.workshopmongo.service;

import com.coachslb.workshopmongo.domain.Post;
import com.coachslb.workshopmongo.domain.User;
import com.coachslb.workshopmongo.domain.dto.UserDTO;
import com.coachslb.workshopmongo.repository.PostRepository;
import com.coachslb.workshopmongo.repository.UserRepository;
import com.coachslb.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private final PostRepository repository;

    public PostService(PostRepository repository) {
        this.repository = repository;
    }

    public Post findById(String id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("Post not found"));
    }

}
