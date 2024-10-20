package com.course_spring_security_course.controller;

import com.course_spring_security_course.dto.AuthenticationRequest;
import com.course_spring_security_course.dto.AuthenticationResponse;
import com.course_spring_security_course.entity.User;
import com.course_spring_security_course.repository.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthenticationController {


    @Autowired
    private UserRepository userRepository;

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> login(@RequestBody @Valid
                                                        AuthenticationRequest AutRequest){
        return null;
    }


    @RequestMapping
    public ResponseEntity<List<User>> findAll() {
        List<User> users = userRepository.findAll();
        if (!users.isEmpty()) {
            return ResponseEntity.ok(users);
        }
        return ResponseEntity.notFound().build();
    }
}
