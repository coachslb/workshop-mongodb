package com.coachslb.workshopmongo.service;

import com.coachslb.workshopmongo.domain.User;
import com.coachslb.workshopmongo.domain.dto.UserDTO;
import com.coachslb.workshopmongo.repository.UserRepository;
import com.coachslb.workshopmongo.service.exception.ObjectNotFoundException;
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

    public User findById(String id){
        return repository.findById(id).orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

    public User insert(User user){
        return repository.insert(user);
    }

    public void delete(String id){
        findById(id);
        repository.deleteById(id);
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(), userDTO.getName(), userDTO.getEmail());
    }
}
