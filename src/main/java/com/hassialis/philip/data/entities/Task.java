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

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  @Column(name = "taskname")
  private String taskName;

  @NotNull
  @Column(name = "taskdescription")
  private String taskDescription;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "taskstatus")
  private TaskStatus taskStatus;

  @Column(name = "taskstartdate")
  private Date taskStartDate;

  @Column(name = "taskenddate")
  private Date taskEndDate;

  @NotNull
  @ManyToOne
  @JoinColumn(name = "projectid")
  private Project project;

}
