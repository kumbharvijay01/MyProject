/**
 * 
 */
package com.org.bhfl.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.org.bhfl.entity.EmployeeRegistration;
import com.org.bhfl.repository.EmployeeRegistrationRepository;
import com.org.bhfl.service.impl.EmployeeServiceImpl;

/**
 * @author vijaykumbhar
 *
 */
@RestController
public class LoginController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@Autowired
	EmployeeRegistrationRepository employeeRegistrationRepository;

//	empid,empname,date,place

	@PostMapping(value = "/registration")

	public EmployeeRegistration registration(@RequestBody EmployeeRegistration employeeRegistration) {
		return employeeServiceImpl.save(employeeRegistration);
	}

	@GetMapping("/empdata")
	public List<EmployeeRegistration> getAll() {
		return employeeRegistrationRepository.findAll();
	}

	@GetMapping("/getempdata")
	public List<EmployeeRegistration> getEmployeeData() {
		return employeeServiceImpl.findAll();
	}

	@GetMapping("/getcount")
	public Long getCount() {
// @RequestBody
//		@ResponseBody
		return employeeRegistrationRepository.count();
	}

	@GetMapping("/getone")
	public Optional<EmployeeRegistration> findOne(@RequestParam Long empId) {
		return employeeRegistrationRepository.findById(empId);
	}

	@GetMapping("/savebulk")
	public List<EmployeeRegistration> saveBulk() {
		EmployeeRegistration employeeRegistration = new EmployeeRegistration();
		List<EmployeeRegistration> list = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			employeeRegistration = new EmployeeRegistration();
			employeeRegistration.setEmpId(String.valueOf(Math.random()));
			employeeRegistration.setName("ABC" + i);
			employeeRegistration.setLocation("PUNE_HO-" + i);
			employeeRegistrationRepository.save(employeeRegistration);
			list.add(employeeRegistration);
		}
		return list;
	}

	@GetMapping("/savebulkbatch")
	public List<EmployeeRegistration> saveBulkinBatch() {
		EmployeeRegistration employeeRegistration = new EmployeeRegistration();
		List<EmployeeRegistration> list = new ArrayList<>();
		for (int i = 0; i <= 1000; i++) {
			employeeRegistration = new EmployeeRegistration();
			employeeRegistration.setEmpId(String.valueOf(i));
			employeeRegistration.setName("XYZ" + i);
			employeeRegistration.setLocation("CHENNAI_BO-" + i);
			list.add(employeeRegistration);
		}
		System.out.println("Total Employee Count " + list.size());
		employeeRegistrationRepository.saveAll(list);
		return list;
	}

	@GetMapping("/deleterecords")
	public void deleteallrecords() {

		employeeRegistrationRepository.deleteAll();

	}

	@GetMapping("/deleterecordsbyid")
	public void deleteallrecords(@RequestParam Long id) {
		employeeRegistrationRepository.deleteById(id);

	}

	@GetMapping("/getempiddetails")
	public Optional<EmployeeRegistration> getemployeedetails(@RequestParam Long id) {
		return employeeRegistrationRepository.findById(id);
	}

}
