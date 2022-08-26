package com.hassialis.philip.data.repositories;

import java.util.List;

import com.hassialis.philip.data.entities.Task;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface TasksRepository extends CrudRepository<Task, Long> {

  List<Task> findByProjectId(Long projectId);

  List<Task> findAll();

}
