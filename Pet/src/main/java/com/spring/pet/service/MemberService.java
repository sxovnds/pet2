package com.spring.pet.service;

import com.spring.pet.dto.MemberDto;

public interface MemberService {
	
	//회원가입
	public void register(MemberDto dto) throws Exception;
	
	//로그인
	public MemberDto login(MemberDto dto) throws Exception;
	
	//회원정보수정
	public void memberUpdate(MemberDto dto) throws Exception;
	
	//회원탈퇴
	public void memberDelete(MemberDto dto) throws Exception;
	
	//패스워트체크
	public int passChk (MemberDto dto) throws Exception;
	
	//아이디 중복 체크
	public int idChk(MemberDto dto) throws Exception;

}
