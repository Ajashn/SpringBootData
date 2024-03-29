package com.restapi.springdata.springdata.Courses;


import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Course {
	
	@Id
	private String id;
	private String name;
	private String description;
	
	public Course() {
	}

	public Course(String id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", description=" + description + "]";
	}
	
	
	
	@Override
	public int hashCode() {
		return Objects.hash(description, id, name);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return Objects.equals(description, other.description) && id == other.id && Objects.equals(name, other.name);
	}

}
