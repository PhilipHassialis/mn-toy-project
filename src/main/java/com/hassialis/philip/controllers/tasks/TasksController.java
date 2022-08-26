package com.hassialis.philip.controllers.tasks;

import java.util.List;
import java.util.stream.Collectors;

import com.hassialis.philip.data.repositories.TasksRepository;
import com.hassialis.philip.dtos.TaskDTO;
import com.hassialis.philip.mappers.TaskToTaskDTOMapper;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.annotation.Secured;
import io.micronaut.security.rules.SecurityRule;
import lombok.RequiredArgsConstructor;

@Controller("/tasks")
@RequiredArgsConstructor
@Secured(SecurityRule.IS_AUTHENTICATED)
public class TasksController {

  private final TasksRepository tasksRepository;
  private final TaskToTaskDTOMapper taskToTaskDTOMapper;

  @Get("/")
  public List<TaskDTO> index() {
    return tasksRepository.findAll().stream().map(taskToTaskDTOMapper::apply).collect(Collectors.toList());
  }

}
