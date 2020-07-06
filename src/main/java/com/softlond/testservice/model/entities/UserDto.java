package com.softlond.testservice.model.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategyBase.SnakeCaseStrategy.class)
public class UserDto {
	private String name;
	private String lastname;
		
	public UserDto() {}
	
	public UserDto(String name, String lastname) {
		this.name = name;
		this.lastname = lastname;		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
}
