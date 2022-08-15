package com.hassialis.philip.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "userroles")
public class UserRole {

  @Id
  @Column(name = "userrole")
  private String userRole;

  @Column(name = "roledescription")
  private String roleDescirption;

  public String getRoleDescirption() {
    return roleDescirption;
  }

  public String getUserRole() {
    return userRole;
  }

}
