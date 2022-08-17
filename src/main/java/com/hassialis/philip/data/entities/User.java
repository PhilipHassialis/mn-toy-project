package com.hassialis.philip.data.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

//import com.fasterxml.jackson.annotation.JsonIgnore;
//import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
@Getter
@Setter
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @NotNull
  private String username;

  @NotNull
  private String password;

//  @JsonProperty("userRole")
//  @Column(name = "userrole", insertable = true, updatable = true)
//  private String userroleStr;

//  @JsonIgnore
  @ManyToOne
  @JoinColumn(name = "userrole")
  @NotNull
  private UserRole userRole;

  public User(String username, String password, UserRole userRole) {
    this.username = username;
    this.password = password;
    this.userRole = userRole;
  }

}
