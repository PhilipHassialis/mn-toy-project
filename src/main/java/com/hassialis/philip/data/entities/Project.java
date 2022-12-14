package com.hassialis.philip.data.entities;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "projects")
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

  @OneToMany(mappedBy = "project")
  @JsonManagedReference
  private List<Task> tasks;

  public Project(@NotNull String projectName, @NotNull String projectDescription, @NotNull ProjectStatus projectStatus,
      Date projectStartDate, Date projectEndDate) {
    this.projectName = projectName;
    this.projectDescription = projectDescription;
    this.projectStatus = projectStatus;
    this.projectStartDate = projectStartDate;
    this.projectEndDate = projectEndDate;
    this.tasks = new ArrayList<>();
  }

}
