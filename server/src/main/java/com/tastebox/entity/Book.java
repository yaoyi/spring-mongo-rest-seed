package com.tastebox.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Document
public class Book {
	
	@Id
	private String id;
	private String name;
	
	
	public void setId(String id)
	{
		this.id = id;
	}
	@JsonIgnore
	public String getId()
	{
		return this.id;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}

	
}
