package com.hassialis.philip.controllers;

import java.util.List;

import com.hassialis.philip.data.User;
import com.hassialis.philip.data.UsersRepository;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Controller("/users")
@Secured(SecurityRule.IS_ANONYMOUS)
public class AllUsersController {

  private final UsersRepository usersRepository;

  public AllUsersController(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Get("/")
  public List<User> getAllUsers() {
    return usersRepository.findAll();
  }
}
