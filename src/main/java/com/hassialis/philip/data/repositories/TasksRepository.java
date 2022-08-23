package com.hassialis.philip.data.repositories;

import com.hassialis.philip.data.entities.Task;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TasksRepository extends CrudRepository<Task, Long> {

}
