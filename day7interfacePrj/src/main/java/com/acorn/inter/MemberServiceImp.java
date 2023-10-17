package com.acorn.inter;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImp  implements MemberServiceI{
	
	@Autowired
	MemberRepositoryI dao;

	@Override
	public int registerMember(Member member) {
		return dao.insert(member);
	}

	@Override
	public List<Member> getMemberList() {
		return dao.selectAll();
	}

	@Override
	public int modifyMember(Member member) {
		return  dao.update(member);
	}

	@Override
	public int deleteMember(String userId) {
		return dao.delete(userId);
	}

}
