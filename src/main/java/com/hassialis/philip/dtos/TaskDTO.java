package com.hassialis.philip.dtos;

import java.sql.Date;

// import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {

  private Long id;
  private String taskName;
  private String taskDescription;
  private String taskStatus;
  private Date taskStartDate;
  private Date taskEndDate;
  private Long project;
  // private ProjectDTO project;

}
