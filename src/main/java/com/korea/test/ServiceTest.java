package com.korea.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.korea.dto.MemberDTO;
import com.korea.service.MemberService;

public class ServiceTest {

	@Test
	public void test() {
		MemberDTO dto = new MemberDTO();
		dto.setEmail("example2@example.com");
		dto.setPwd("1234");
		dto.setAddr1("대구");
		dto.setAddr2("대구");
		
		MemberService service = MemberService.getInstance();
		service.MemberInsert(dto);
	}

}
