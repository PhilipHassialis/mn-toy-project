package com.hassialis.philip.data.entities;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "projects")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
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

  @NotNull
  @ManyToOne
  @JoinColumn(name = "projectstatus")
  private ProjectStatus projectStatus;

  @Column(name = "projectstartdate")
  private Date projectStartDate;

  @Column(name = "projectenddate")
  private Date projectEndDate;

  public Project(@NotNull String projectName, @NotNull String projectDescription, @NotNull ProjectStatus projectStatus,
      Date projectStartDate, Date projectEndDate) {
    this.projectName = projectName;
    this.projectDescription = projectDescription;
    this.projectStatus = projectStatus;
    this.projectStartDate = projectStartDate;
    this.projectEndDate = projectEndDate;
  }

}
