package com.hassialis.philip.mappers;

// import org.flywaydb.core.internal.database.base.Function;

import com.hassialis.philip.data.entities.Task;
import com.hassialis.philip.dtos.TaskDTO;

import jakarta.inject.Singleton;

import java.util.function.Function;

@Singleton
public class TaskToTaskDTOMapper implements Function<Task, TaskDTO> {

  @Override
  public TaskDTO apply(Task task) {
    return new TaskDTO(task.getId(), task.getTaskName(), task.getTaskDescription(),
        task.getTaskStatus().getTaskStatus(),
        task.getTaskStartDate(), task.getTaskEndDate(), task.getProject().getId());
  }

}
