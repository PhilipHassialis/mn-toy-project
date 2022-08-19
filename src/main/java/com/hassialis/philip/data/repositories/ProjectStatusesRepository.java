package com.hassialis.philip.data.repositories;

import com.hassialis.philip.data.entities.ProjectStatus;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface ProjectStatusesRepository extends CrudRepository<ProjectStatus, Long> {

  ProjectStatus findByProjectStatus(String projectStatus);
}
