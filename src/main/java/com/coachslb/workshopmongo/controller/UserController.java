package com.coachslb.workshopmongo.controller;

import com.coachslb.workshopmongo.domain.User;
import com.coachslb.workshopmongo.domain.dto.UserDTO;
import com.coachslb.workshopmongo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        List<User> list = service.findAll();

        List<UserDTO> listDto = list.stream().map(UserDTO::new).toList();

        return ResponseEntity.ok().body(listDto);
    }
}
