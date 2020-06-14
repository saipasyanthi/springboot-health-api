package com.careApi.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name = "healthuser")
public class User {
	
	private Long user_id;
	private String username;
    private String password;
    private Double phoneno;
    private String email;
    private String role;
    private String newpassword;
    private String confirmpassword;
    
    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="user_id")
    private Set<Survey> surveys;
    private Set<Survey> surveydetails;
    
    @Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	
	public void setUsername(String username) {
    	this.username=username;
    }   

	@Column(name="username")
	//@NotNull
    public String getUsername() 
    {
    	return username;
    }
        
    public void setPassword(String password) {
    	this.password=password;
    } 
    @Column(name="password")
    public String getPassword() {
    	return password;
    }  
    
    @Column(name="email")
    public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
	@Column(name="role")
    public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	 @Column(name="phoneno")
	public Double getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(Double phoneno) {
		this.phoneno = phoneno;
	}

	 @Column(name="newpassword")
	public String getNewpassword() {
		return newpassword;
	}

	public void setNewpassword(String newpassword) {
		this.newpassword = newpassword;
	}
	
	@Column(name="confirmpassword")
	public String getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
		this.confirmpassword = confirmpassword;
	}

	
	public User() {
    }
 
    public User(Long user_id, String username, String password,String newpassword,String confirmpassword, String email, String role, Double phoneno ) {
        this.user_id = user_id;
        this.username = username;
        this.password = password;
        this.email=email;
        this.role=role;
        this.phoneno=phoneno;
        this.confirmpassword= confirmpassword;
        this.newpassword=newpassword;
    }

}
