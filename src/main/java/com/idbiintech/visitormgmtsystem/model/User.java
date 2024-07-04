package com.idbiintech.visitormgmtsystem.model;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private Integer empId;
    
    
    public User(String email, String password) 
    {
        this.email = email;
        this.password = password;
    }

    public User() {
		super();
	}
    
    

	public User(String email, String password, String firstName, String lastName, Integer empId) 
	{
		super();
		this.email = email;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.empId = empId;
	}

	public String getEmail() 
	{
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

	public Integer getEmpId() 
	{
		return empId;
	}

	public void setEmpId(Integer empId) 
	{
		this.empId = empId;
	}
    
    
}
