package com.learn.microservices.coveredpersoninformation.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.microservices.coveredpersoninformation.model.CoveredPerson;
import com.learn.microservices.coveredpersoninformation.model.EnrollmentCoveredPerson;


@RestController
@RequestMapping("/resources")
public class CoveredPersonResource {
	
	@RequestMapping("/getCoveredPerson")
	public CoveredPerson getCoveredPerson(){
		List<EnrollmentCoveredPerson> ecpList=Arrays.asList(
				new EnrollmentCoveredPerson(10,"Sandeep","35"),new EnrollmentCoveredPerson(30,"Mamatha","30"),new EnrollmentCoveredPerson(20,"Advaith","2"));
		CoveredPerson cp=new CoveredPerson(ecpList);
		return cp;
		
	}


}
