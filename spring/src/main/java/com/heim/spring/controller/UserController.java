package com.heim.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.heim.spring.model.UserModel;
import com.heim.spring.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserRepository repository;

  @GetMapping("/{id}")
  public UserModel getUser(@PathVariable("id") Integer id) {
    return repository.findById(id);
  }

  @GetMapping
  public List<UserModel> getAll() {
    return repository.findAll();
  }

  @DeleteMapping("/{id}")
  public void deleteUser(@PathVariable("id") Integer id) {
    repository.delete(id);
  }

  @PutMapping
  public void updateUser(@RequestBody UserModel user) {
    repository.update(user);
  }

  @PostMapping
  public void createUser(@RequestBody UserModel user) {
    repository.create(user);
  }
}
