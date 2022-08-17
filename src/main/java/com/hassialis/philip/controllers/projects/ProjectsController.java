package com.hassialis.philip.controllers.projects;

import java.util.List;

import com.hassialis.philip.data.entities.Project;
import com.hassialis.philip.data.repositories.ProjectsRepository;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;

@Controller("/projects")
@Secured(SecurityRule.IS_AUTHENTICATED)
public class ProjectsController {

  private final ProjectsRepository projectsRepository;

  public ProjectsController(ProjectsRepository projectsRepository) {
    this.projectsRepository = projectsRepository;
  }

  @Get("/")
  public List<Project> getAllProjects() {
    return projectsRepository.findAll();
  }

  @Post("/")
  @Secured({ "MANAGER" })
  public Project createProject(@Body Project project) {
    return projectsRepository.save(project);
  }

}
