package com.korea.test;

import java.util.List;

import org.junit.Test;

import com.korea.dao.BoardDAO;
import com.korea.dto.BoardDTO;

public class DaoTest {

//	@Test
//	public void test() {
//		//
//		MemberDTO dto = new MemberDTO();
//		dto.setEmail("example@example.com");
//		dto.setPwd("1234");
//		dto.setAddr1("대구광역시 달서구 000");
//		dto.setAddr2("00아파트 000동 0000호");
//		
//		MemberDAO dao = MemberDAO.getInstance();
//		boolean result = dao.insert(dto);
//		if(result)
//			System.out.println("INSERT 성공");
//		else
//			System.out.println("INSERT 실패");
//	}
	
//	@Test
//	public void Test2() {
//		//MemberDAO's Select(email)
//		MemberDAO dao = MemberDAO.getInstance();
//		MemberDTO dto  = dao.Select("jwg1323@outlook.kr");
//		System.out.println("결과 : "  + dto.toString());
//		
//	}
	
//	@Test
//	public void Test3() {
//		MemberDTO dto = new MemberDTO();
//		dto.setEmail("test1@naver.com");
//		dto.setPwd("0987");
//		dto.setAddr1("서울특별시");
//		dto.setAddr2("00구 00동");
//		
//		MemberDAO dao = MemberDAO.getInstance();
//		dao.Update(dto);	
//	}
	

	
	@Test
	public void Test4()
	{
		BoardDAO dao = BoardDAO.getInstance();
		
		List<BoardDTO> list =dao.Select(11, 20);
		
		//list.forEach(dto -> System.out.println(dto));
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));	
		}
		
		
	}


}





