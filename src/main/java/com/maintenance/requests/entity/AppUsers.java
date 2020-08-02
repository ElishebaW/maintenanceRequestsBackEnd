package com.maintenance.requests.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter 
@Setter 
@NoArgsConstructor
@Entity
@Table(name= "app_users")
public class AppUsers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	
	@ManyToOne
	private MaintenanceRequests maintenance;
	@Column
	private String role;
	@Column
	private String location;
	@Column
	private byte photo;
}
