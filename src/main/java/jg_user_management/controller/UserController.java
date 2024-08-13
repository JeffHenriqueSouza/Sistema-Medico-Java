package jg_user_management.controller;

import jakarta.validation.Valid;
import jg_user_management.dto.request.InsertUserRequest;
import jg_user_management.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public ResponseEntity<?> insertUser(@RequestBody @Valid InsertUserRequest request) {
        return ResponseEntity.ok().body(service.insertUser(request));
    }
}

