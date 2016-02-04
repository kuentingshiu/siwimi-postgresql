package com.siwimi.webapi.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.siwimi.webapi.domain.Member;

@Repository
public interface MemberRepository extends CrudRepository<Member, String>, MemberRepositoryCustom{	
	
}
