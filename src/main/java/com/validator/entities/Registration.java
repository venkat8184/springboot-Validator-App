package com.validator.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name="validators")
public class Registration {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
	 @NotBlank(message = "Name is mandatory")
	    private String name;
	    @NotBlank(message = "Email is mandatory")
	    private String email;
	    @Size(min=10,max=10)
	    @NotNull
private long mobile;
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getMobile() {
			return mobile;
		}
		public void setMobile(long mobile) {
			this.mobile = mobile;
		}
//This is test method
public void test(){
//this logic for test method
}
}
