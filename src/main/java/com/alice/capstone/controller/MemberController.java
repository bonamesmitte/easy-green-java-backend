package com.alice.capstone.controller;

import java.util.List;

import javax.validation.Valid;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alice.capstone.model.Member;
import com.alice.capstone.repository.MemberRepository;

@CrossOrigin
@RestController
@RequestMapping("/alice_api/v1")

public class MemberController {
	
	@Autowired
	private MemberRepository memberRepository;
	
	// get all members
	
	@GetMapping("/members")
	public List<Member> getAllEmployees(Model model){
		return this.memberRepository.findAll();
	}
	
	// create member 
	@PostMapping("/members")
	public Member createMember(@Valid @RequestBody Member member) {
		return memberRepository.save(member);
	}
	
	//
	
	
	
//	
//	// get employee by id
//	
//	@GetMapping("employee/{id}")
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable(value = "id") Long employeeId)
//		throws ResourceNotFoundException {
//		Employee employee = employeeRepository.findById(employeeId).orElseThrow(() -> new ResourceNotFoundException
//				("Employee not found for this id :: " + employeeId));
//				return ResponseEntity.ok().body(employee);
//						
//	}
//	
//	// save employee
//	
//	@PostMapping("/employee")
//	public Employee createEmployee(@Valid @RequestBody Employee employee) {
//		return employeeRepository.save(employee);
//	}
	
}

