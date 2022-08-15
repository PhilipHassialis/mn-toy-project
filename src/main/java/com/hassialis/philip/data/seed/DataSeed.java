package com.hassialis.philip.data.seed;

import com.hassialis.philip.data.UserRole;
import com.hassialis.philip.data.UserRolesRepository;
import com.hassialis.philip.data.User;
import com.hassialis.philip.data.UsersRepository;

import io.micronaut.runtime.event.ApplicationStartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;

@Singleton
public class DataSeed {

  private final UsersRepository usersRepository;
  private final UserRolesRepository rolesRepository;

  public DataSeed(UsersRepository usersRepository, UserRolesRepository rolesRepository) {
    this.usersRepository = usersRepository;
    this.rolesRepository = rolesRepository;
  }

  @EventListener
  public void onStartup(ApplicationStartupEvent event) {

    UserRole roleAdmin = new UserRole("ADMIN", "Administrator account");

    if (rolesRepository.findById("ADMIN").isEmpty()) {
      rolesRepository.save(roleAdmin);
    }

    if (usersRepository.count() == 0) {
      usersRepository.save(new User("ADMIN", "secret", roleAdmin));
    }
  }

}
