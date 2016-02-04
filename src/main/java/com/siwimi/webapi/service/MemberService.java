package com.siwimi.webapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siwimi.webapi.domain.Member;
import com.siwimi.webapi.repository.MemberRepository;

@Service
public class MemberService {
	
	@Autowired
	private MemberRepository memberRep;
	
	public Member addMember(Member newMember){		
		return memberRep.save(newMember);	
	}
	
	public Member findByMemberId(String id) {
		return memberRep.findOne(id);
	}	
}
