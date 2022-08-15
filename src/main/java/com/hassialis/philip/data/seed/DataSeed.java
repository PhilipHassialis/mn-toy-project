package com.hassialis.philip.data.seed;

import com.hassialis.philip.data.User;
import com.hassialis.philip.data.UsersRepository;

import io.micronaut.runtime.event.ApplicationStartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import jakarta.inject.Singleton;

@Singleton
public class DataSeed {

  private final UsersRepository usersRepository;

  public DataSeed(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @EventListener
  public void onStartup(ApplicationStartupEvent event) {
    if (usersRepository.count() == 0) {
      usersRepository.save(new User("ADMIN", "secret", "ADMIN"));
    }
  }

}
