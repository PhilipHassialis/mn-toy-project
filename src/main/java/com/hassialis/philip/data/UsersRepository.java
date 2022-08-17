package com.hassialis.philip.data;

import java.util.List;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UsersRepository extends CrudRepository<User, Long> {

  public List<User> findAll();

  public List<User> findAllByUsername(String username);
}
