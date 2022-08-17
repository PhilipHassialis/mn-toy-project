package com.hassialis.philip.data.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
public class Project {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Column(name = "projectname")
  private String projectName;

  @NotNull
  @Column(name = "projectdescription")
  private String projectDescription;

  @Column(name = "projectstatus")
  private String projectStatus;

  @Column(name = "projectstartdate")
  private Date projectStartDate;

  @Column(name = "projectenddate")
  private Date projectEndDate;

  public Long getId() {
    return id;
  }

  public String getProjectName() {
    return projectName;
  }

  public String getProjectDescription() {
    return projectDescription;
  }

  public String getProjectStatus() {
    return projectStatus;
  }

  public Date getProjectStartDate() {
    return projectStartDate;
  }

  public Date getProjectEndDate() {
    return projectEndDate;
  }

}
