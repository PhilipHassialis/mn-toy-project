package com.hassialis.philip.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "projectstatus")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ProjectStatus {

  @Id
  @Column(name = "projectstatus")
  private String projectStatus;

  @Column(name = "statusdescription")
  private String statusDescription;

}
