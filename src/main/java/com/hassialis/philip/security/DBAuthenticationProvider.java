package com.hassialis.philip.security;

import org.reactivestreams.Publisher;

import io.micronaut.http.HttpRequest;
import io.micronaut.security.authentication.AuthenticationProvider;
import io.micronaut.security.authentication.AuthenticationRequest;
import io.micronaut.security.authentication.AuthenticationResponse;
import jakarta.inject.Singleton;
import reactor.core.publisher.Mono;

@Singleton
public class DBAuthenticationProvider implements AuthenticationProvider {

  @Override
  public Publisher<AuthenticationResponse> authenticate(HttpRequest<?> httpRequest,
      AuthenticationRequest<?, ?> authenticationRequest) {
    return Mono.<AuthenticationResponse>create(emitter -> {
      emitter.success(AuthenticationResponse.success("user"));
    });
    // return null;
  }

}