package com.sneha.sprintboot.model;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name="products")
@ToString
public class Products {

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
	@SequenceGenerator(name = "product_sequence",
	                   sequenceName =  "product_schema_sequence",allocationSize = 1)
	@Id
	private int ptId;
	
	@Column(name = "pname" , nullable =  false)
	private String pName;

	@Column(name = "pquantity")
	private int pQuanity;
	
	@CreationTimestamp
	@Column(name = "datecreated")
	private LocalDateTime dateCreated;
	
	@UpdateTimestamp
	@Column(name = "lastupdate")
	private LocalDateTime lastUpdate;
}
