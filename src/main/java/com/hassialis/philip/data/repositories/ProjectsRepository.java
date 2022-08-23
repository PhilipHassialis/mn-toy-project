package com.hassialis.philip.data.repositories;

import java.util.List;

import com.hassialis.philip.data.entities.Project;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ProjectsRepository extends CrudRepository<Project, Long> {

  @Join(value = "tasks", type=Join.Type.FETCH)
  @Join(value = "tasks.taskStatus", type=Join.Type.FETCH)
  public List<Project> findAll();
}
