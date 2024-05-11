/**
 * 
 */
package com.org.bhfl.dto;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author vijaykumbhar
 *
 */
@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpRegistrationDto {
	private String empid, empname, dobdate, place, address;
}
