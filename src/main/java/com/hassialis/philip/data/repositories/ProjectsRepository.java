package com.hassialis.philip.data.repositories;

import java.util.List;

import com.hassialis.philip.data.entities.Project;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ProjectsRepository extends CrudRepository<Project, Long> {

  public List<Project> findAll();
}
