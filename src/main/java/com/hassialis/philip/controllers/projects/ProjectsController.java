package com.hassialis.philip.controllers.projects;

import java.util.List;

import com.hassialis.philip.data.entities.Project;
import com.hassialis.philip.data.repositories.ProjectsRepository;
import com.hassialis.philip.dtos.ProjectDTO;
import com.hassialis.philip.mappers.ProjectDTOToProjectMapper;
import com.hassialis.philip.mappers.ProjectToProjectDTOMapper;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import lombok.RequiredArgsConstructor;

@Controller("/projects")
@Secured(SecurityRule.IS_AUTHENTICATED)
@RequiredArgsConstructor
public class ProjectsController {

  private final ProjectsRepository projectsRepository;
  private final ProjectDTOToProjectMapper projectDTOToProjectMapper;
  private final ProjectToProjectDTOMapper projectToProjectDTOMapper;

  @Get("/")
  public List<Project> getAllProjects() {
    return projectsRepository.findAll();
  }

  @Post("/")
  @Secured({ "MANAGER" })
  public ProjectDTO createProject(@Body ProjectDTO projectDTO) {
    return projectToProjectDTOMapper.apply(projectsRepository.save(projectDTOToProjectMapper.apply(projectDTO)));
  }

}
