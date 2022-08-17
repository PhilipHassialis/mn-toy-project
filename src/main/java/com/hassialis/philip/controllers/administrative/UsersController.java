package com.hassialis.philip.controllers.administrative;

import java.util.List;

import com.hassialis.philip.data.entities.User;
import com.hassialis.philip.data.repositories.UsersRepository;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;

@Controller("/users")
@Secured("ADMIN")
public class UsersController {

  private final UsersRepository usersRepository;

  public UsersController(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Get("/")
  public List<User> getAllUsers() {
    return usersRepository.findAll();
  }

  @Post("/")
  public User createUser(@Body User user) {
    return usersRepository.save(user);
  }
}
