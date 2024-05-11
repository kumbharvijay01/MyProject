/**
 * 
 */
package com.org.bhfl.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.org.bhfl.entity.EmployeeRegistration;

/**
 * @author vijaykumbhar
 *
 */
@Repository
public interface EmployeeRegistrationRepository extends JpaRepository<EmployeeRegistration, Long> {
	List<EmployeeRegistration> findAll();
}
