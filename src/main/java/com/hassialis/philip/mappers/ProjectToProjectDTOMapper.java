package com.hassialis.philip.mappers;

import java.util.function.Function;

import com.hassialis.philip.data.entities.Project;
import com.hassialis.philip.dtos.ProjectDTO;

public class ProjectToProjectDTOMapper implements Function<Project, ProjectDTO> {

  @Override
  public ProjectDTO apply(Project project) {
    return new ProjectDTO(project.getId(), project.getProjectName(), project.getProjectDescription(),
        project.getProjectStatus().getProjectStatus(), project.getProjectStartDate(), project.getProjectEndDate());
  }
}
