package com.hassialis.philip.data.repositories;

import java.util.List;

import com.hassialis.philip.data.entities.User;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

  public List<User> findAll();

  public List<User> findAllByUsername(String username);
}
