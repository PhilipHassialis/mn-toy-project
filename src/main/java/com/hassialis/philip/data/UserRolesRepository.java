package com.hassialis.philip.data;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, String> {

}
