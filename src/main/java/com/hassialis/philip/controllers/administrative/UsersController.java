package com.hassialis.philip.controllers.administrative;

import java.util.List;

import com.hassialis.philip.data.entities.User;
import com.hassialis.philip.data.repositories.UsersRepository;

import com.hassialis.philip.dtos.UserDTO;
import com.hassialis.philip.mappers.UserDTOToUserMapper;
import com.hassialis.philip.mappers.UserToUserDTOMapper;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import lombok.RequiredArgsConstructor;

@Controller("/users")
@Secured("ADMIN")
@RequiredArgsConstructor
public class UsersController {

  private final UsersRepository usersRepository;
  private final UserDTOToUserMapper userDTOToUserMapper;
  private final UserToUserDTOMapper userToUserDTOMapper;

  @Get("/")
  public List<User> getAllUsers() {
    return usersRepository.findAll();
  }

  @Post("/")
  public UserDTO createUser(@Body UserDTO user) {
    return userToUserDTOMapper.apply(usersRepository.save(userDTOToUserMapper.apply(user)));
//    return usersRepository.save(user);
  }
}
