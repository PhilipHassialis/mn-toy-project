package com.hassialis.philip.dtos;

import java.sql.Date;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Introspected
public class ProjectDTO {

  private Long id;
  private String projectName;
  private String projectDescription;
  private String projectStatus;
  private Date projectStartDate;
  private Date projectEndDate;

}
