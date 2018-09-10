package com.lni.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lni.api.dao.Reg_part1DAO;
import com.lni.api.dto.Reg_part1;

@RestController
@RequestMapping("/reg")
public class RestApiController {
	
	@Autowired
	private Reg_part1DAO reg_part1DAO;
	
	@RequestMapping(value="/data", method=RequestMethod.GET)
	public Iterable<Reg_part1> getData()
	{
		Iterable<Reg_part1> data =  reg_part1DAO.findAll();
		
		return data;
	}
	
	@RequestMapping(value="/data", consumes = "application/json", method=RequestMethod.POST)
	public String addData(@RequestBody Reg_part1 part1)
	{
		//System.out.println(part1.toString());
		if(part1 != null) {
		reg_part1DAO.save(part1);
		
		return "{\"success\":200}";//ResponseEntity.status(HttpStatus.CREATED).build();
		}
		else {
			System.out.println("Fail");
		//	ResponseEntity<String> rs = new ResponseEntity<String>("something is not good", HttpStatus.EXPECTATION_FAILED);
			return "{\"fail\":400}";
		}		
		//return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
	
	

}
 