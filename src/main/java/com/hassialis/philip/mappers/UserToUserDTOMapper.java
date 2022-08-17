package com.hassialis.philip.mappers;

import com.hassialis.philip.data.entities.User;
import com.hassialis.philip.dtos.UserDTO;
import jakarta.inject.Singleton;

import java.util.function.Function;

@Singleton
public class UserToUserDTOMapper implements Function<User, UserDTO> {

	@Override
	public UserDTO apply(User user) {
		return new UserDTO(user.getId(), user.getUsername(), null, user.getUserRole().getUserRole());
	}
}
