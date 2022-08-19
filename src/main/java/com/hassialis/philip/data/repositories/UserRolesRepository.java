package com.hassialis.philip.data.repositories;

import com.hassialis.philip.data.entities.UserRole;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, String> {

  UserRole findByUserRole(String userRole);

}
