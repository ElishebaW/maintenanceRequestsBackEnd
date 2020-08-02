package com.maintenance.requests.entity;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name= "maintenance_requests")
public class MaintenanceRequests {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private Long maintenanceid;
	@Column
	 private String location;
	@Column
	 private String status;
	@Column
	 private Instant dateWitnessed; 
	@Column 
	 private String description;
	@Column 
	 private byte photo;
}
