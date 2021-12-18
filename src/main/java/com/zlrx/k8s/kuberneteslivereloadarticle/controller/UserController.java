package com.zlrx.k8s.kuberneteslivereloadarticle.controller;


import com.zlrx.k8s.kuberneteslivereloadarticle.model.User;
import com.zlrx.k8s.kuberneteslivereloadarticle.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("users")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @PostMapping("users")
    public User postUser(@RequestBody User user) {
        return userRepository.save(user);
    }

}
