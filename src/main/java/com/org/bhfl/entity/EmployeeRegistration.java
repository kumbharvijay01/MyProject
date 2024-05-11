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
 * @author vijaykumbhar
 *
 */
@Entity
@Table(name = "EmployeeRegistration")
@Data
public class EmployeeRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Id")
	private Long id;
//default 256 char numbers/Charster 
	@Column(name = "name")
	private String name;

	@Column(name = "empid")
	private String empId;

	@Column(name = "location")
	private String location;

	@Column(name = "dobdate")
	private String dobDate;

	@Column(name = "address")
	private String address;

	@Column(name = "address1")
	private String address1;

	@Column(name = "city")
	private String city;
	
	@Column(name = "cityCode")
	private String cityCity;

}
