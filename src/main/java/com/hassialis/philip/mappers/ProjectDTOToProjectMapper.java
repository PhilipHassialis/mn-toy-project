package com.hassialis.philip.mappers;

import java.util.function.Function;

import com.hassialis.philip.data.entities.Project;
import com.hassialis.philip.data.repositories.ProjectStatusesRepository;
import com.hassialis.philip.dtos.ProjectDTO;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@RequiredArgsConstructor
public class ProjectDTOToProjectMapper implements Function<ProjectDTO, Project> {

  private final ProjectStatusesRepository projectStatusesRepository;

  @Override
  public Project apply(ProjectDTO projectDTO) {
    return new Project(projectDTO.getId(), projectDTO.getProjectName(), projectDTO.getProjectDescription(),
        projectStatusesRepository.findByProjectStatus(projectDTO.getProjectStatus()),
        projectDTO.getProjectStartDate(), projectDTO.getProjectEndDate());
  }

}
