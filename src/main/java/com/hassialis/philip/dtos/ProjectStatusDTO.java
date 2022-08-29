package com.hassialis.philip.dtos;

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
public class ProjectStatusDTO {
	private String projectStatus;
	private String statusDescription;
}
