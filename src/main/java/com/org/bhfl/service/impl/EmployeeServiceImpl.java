/**
 * 
 */
package com.org.bhfl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.bhfl.entity.EmployeeRegistration;
import com.org.bhfl.repository.EmployeeRegistrationRepository;
import com.org.bhfl.service.EmployeeService;

/**
 * @author vijaykumbhar
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRegistrationRepository employeeRegistrationRepository;

	@Override
	public EmployeeRegistration save(EmployeeRegistration employeeRegistration) {
		return employeeRegistrationRepository.save(employeeRegistration);
	}

	@Override
	public List<EmployeeRegistration> findAll() {
		return employeeRegistrationRepository.findAll();
	}

}
