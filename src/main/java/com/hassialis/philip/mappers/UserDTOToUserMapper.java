package com.hassialis.philip.mappers;

import com.hassialis.philip.data.entities.User;
import com.hassialis.philip.data.repositories.UserRolesRepository;
import com.hassialis.philip.dtos.UserDTO;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

import java.util.function.Function;

@Singleton
@RequiredArgsConstructor
public class UserDTOToUserMapper implements Function<UserDTO, User> {

	private final UserRolesRepository userRolesRepository;

	@Override
	public User apply(UserDTO userDTO) {
		return new User(userDTO.getId(), userDTO.getUsername(), userDTO.getPassword(), userRolesRepository.findByUserRole(userDTO.getUserRole()));
//		return null;
	}

}
