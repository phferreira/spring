package com.heim.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.heim.spring.model.UserModel;

@Repository
public class UserRepository {
  public void create(UserModel user) {
    System.out.println("SAVE - User saved");

  }

  public void update(UserModel user) {
    System.out.println("UPDATE - User saved");

  }

  public void delete(Integer id) {
    System.out.println("DELETE - User saved");

  }

  public List<UserModel> findAll() {
    System.out.println("FINDALL - User saved");
    List<UserModel> usuarios = new ArrayList<UserModel>();
    usuarios.add(new UserModel("kael", "54321"));
    usuarios.add(new UserModel("paulo", "54321"));
    usuarios.add(new UserModel("keli", "98765"));
    return usuarios;

  }

  public UserModel findById(Integer id) {
    System.out.println("FINDBYID - User saved");
    return new UserModel("paulo", "12345");
  }
}
