package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

//controller is used to define endpoints
//an endpoint is a method in controller

@RestController
public class UserController {
    //todo : use dependency injection

    //property injection :
    //@Autowired and @component
    // UserRepository userRepository = new InMemoryUserRepository(); ->

    //@Qualifier("InMemoryUserRepository") for multiple dependencies
    //@Autowired
    UserRepository userRepository;

    @Autowired
    public UserController(UserRepository repo) {
        this.userRepository = repo;
    }

    //endpoint are like,
    //retrieving an existing user(get user)->GET
    @GetMapping("/user")
    public User getUser(@RequestParam int id) {
        return userRepository.findById(id);
    }

//user registration (add new user) -> POST user
    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        userRepository.save(user);
    }

//remove user -> GET
//    @GetMapping("/remove_user")
//    public User removeUser(@RequestParam int id){
//        return userRepository.remove(id);
//    }
//updating a user data
//or other user related action.

    //dependency injections:
        //1.property injection
        //2.constructor injection *preferred

}