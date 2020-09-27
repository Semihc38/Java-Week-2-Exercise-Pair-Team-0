package com.techelevator;

import java.time.LocalDate;
import java.util.List;

public class Project {

	
	
	public Project(String name, String description, LocalDate startDate, LocalDate dueDate) {
		this.name=name;
		this.description=description;
		this.startDate=startDate;
		this.dueDate=dueDate;
		
		
		
		
	}
	
	private LocalDate dueDate;
	private LocalDate startDate;
	private String name;
	private String description;
	private List<Employee> teamMembers;
	
	
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<Employee> getTeamMembers() {
		return teamMembers;
	}
	public void setTeamMembers(List<Employee> teamMembers) {
		this.teamMembers = teamMembers;
	}
}
