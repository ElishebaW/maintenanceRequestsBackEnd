package com.maintenance.requests.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter 
@Setter 
@NoArgsConstructor 
public class AppUsers {
	
	@Id
	private int userId;
	@Column
	private String role;
	@Column
	private String location;
	@Column
	private byte photo;
	

}
