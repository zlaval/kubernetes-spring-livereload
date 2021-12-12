package com.zlrx.k8s.kuberneteslivereloadarticle.controller;


import com.zlrx.k8s.kuberneteslivereloadarticle.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @GetMapping("users")
    public List<User> getUsers() {
        return List.of(
                new User(1L, "Erik"),
                new User(2L, "Alex")
        );
    }

}
