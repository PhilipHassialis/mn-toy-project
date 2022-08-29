package com.hassialis.philip.dtos;

import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Introspected
public class SimpleProjectDTO {
	private Long id;
	private String projectName;
	private String projectDescription;
	private ProjectStatusDTO projectStatus;
	private Date projectStartDate;
	private Date projectEndDate;

}
