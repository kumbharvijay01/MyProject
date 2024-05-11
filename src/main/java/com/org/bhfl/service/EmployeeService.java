/**
 * 
 */
package com.org.bhfl.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.org.bhfl.entity.EmployeeRegistration;

/**
 * @author vijaykumbhar
 *
 */

@Service
public interface EmployeeService {
	public EmployeeRegistration save(EmployeeRegistration employeeRegistration);

	public List<EmployeeRegistration> findAll();

}
