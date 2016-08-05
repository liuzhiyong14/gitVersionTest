package com.utils;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class User {  
    
    public User() {  
    }  
      
    public User(int id, String name, Integer age) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.age = age;  
    }  
  
    private int id;  
      
    private String name;  
    @JsonIgnore  
    private Integer age;  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getName() {  
        return name;  
    }  
  
    public void setName(String name) {  
        this.name = name;  
    }

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}  
