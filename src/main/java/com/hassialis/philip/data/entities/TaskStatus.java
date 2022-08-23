package com.hassialis.philip.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "projectstatus")
public class TaskStatus {

  @Id
  @Column(name = "taskstatus")
  private String taskStatus;

  @Column(name = "statusdescription")
  private String statusDescription;

}
