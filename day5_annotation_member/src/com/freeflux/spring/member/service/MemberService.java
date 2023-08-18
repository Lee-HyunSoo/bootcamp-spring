package com.freeflux.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.freeflux.spring.member.vo.MemberVO;

public interface MemberService {
	 public List listMembers() throws DataAccessException;
	 public int addMember(MemberVO memberVO) throws DataAccessException;
	 public int removeMember(String id) throws DataAccessException;

}
