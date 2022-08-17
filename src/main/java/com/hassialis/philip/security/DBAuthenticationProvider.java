package com.hassialis.philip.security;

import java.util.Arrays;
import java.util.List;

import org.reactivestreams.Publisher;

import com.hassialis.philip.data.entities.User;
import com.hassialis.philip.data.repositories.UsersRepository;

import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.AuthenticationException;
import io.micronaut.security.authentication.AuthenticationProvider;
import io.micronaut.security.authentication.AuthenticationRequest;
import io.micronaut.security.authentication.AuthenticationResponse;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

@Singleton
public class DBAuthenticationProvider implements AuthenticationProvider {

  private final UsersRepository usersRepository;

  public DBAuthenticationProvider(UsersRepository usersRepository) {
    this.usersRepository = usersRepository;
  }

  @Override
  public Publisher<AuthenticationResponse> authenticate(HttpRequest<?> httpRequest,
      AuthenticationRequest<?, ?> authenticationRequest) {
    return Mono.<AuthenticationResponse>create(emitter -> {
      final String username = authenticationRequest.getIdentity().toString();
      List<User> users = usersRepository.findAllByUsername(username);
      if (users.size() == 0) {
        emitter.error(new AuthenticationException("Unable to login with provided credentials"));
      } else {
        emitter
            .success(AuthenticationResponse.success(username, Arrays.asList(users.get(0).getUserRole().getUserRole())));
      }
    });
  }
}