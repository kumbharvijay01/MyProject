/**
 * 
 */
package com.org.bhfl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * 
 */

@Entity
@Table(name = "Cities")
@Data
public class City {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Long id;
	
	@Column(name = "CityCode")
	private String cityCode;
	
	private String cityName;
	private String lat;
	private String longitude;
	private String longitude1;
	

	
	
	
	

}
