package com.bright.food_delivery_backend.controller.userController;

import com.bright.food_delivery_backend.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UsersController {
    private List<User> users = new ArrayList<>();

    @GetMapping
   public List<User> getUsers() {
        return users;
    }

    @PostMapping
    public List<User> createUser(@RequestBody User user) {
        users.add(user);
        return users;
    }

}
