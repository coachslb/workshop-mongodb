package com.coachslb.workshopmongo.service;

import com.coachslb.workshopmongo.domain.User;
import com.coachslb.workshopmongo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> findAll() {
        return repository.findAll();
    }
}
