package com.hassialis.philip.data.repositories;

import com.hassialis.philip.data.entities.TaskStatus;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TaskStatusRepository extends CrudRepository<TaskStatus, String> {

  TaskStatus findByTaskStatus(String taskStatus);
}
