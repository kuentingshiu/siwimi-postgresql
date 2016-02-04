package com.siwimi.webapi.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.siwimi.webapi.domain.Member;
import com.siwimi.webapi.service.MemberService;
import com.siwimi.webapi.web.dto.MemberSideload;

@RestController
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	// Get by ID
	@RequestMapping(value = "/member/{id}", method = RequestMethod.GET, produces = "application/json")
	public Map<String, Member> findById(@PathVariable("id") String id) {		
		Map<String, Member> responseBody = new HashMap<String, Member>();			
		Member obj = service.findByMemberId(id);
		responseBody.put("member", obj);
		return responseBody;
	}
	
	// Add New
	@RequestMapping(value = "/member", method = RequestMethod.POST, produces = "application/json")
	public Map<String, Member> add(@RequestBody MemberSideload newObj){
		Member savedObj = service.addMember(newObj.member);			
		Map<String, Member> responseBody = new HashMap<String, Member>();
		responseBody.put("member", savedObj);
		return responseBody;
	}

}
