package com.example.spring01.controller;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.spring01.model.dto.AddressDTO;
import com.example.spring01.model.dto.MemberDTO;
import com.example.spring01.service.AddressService;

@Controller	
public class AddressController {
	private static final Logger logger = LoggerFactory.getLogger(AddressController.class);
	
	@Inject
	AddressService addressService;
	
	@RequestMapping("member/addressbook.do")
	public String addmemberList(Model model) {
		System.out.println("gggg");
		List<AddressDTO> list = addressService.addmemberList();
		model.addAttribute("list", list);
		return "member/addressbook";
	}
	
	
	 @RequestMapping("member/addwrite.do") 
	 public String addwrite() { 
		 return	 "member/addwrite"; 
	 }
	 
	
	// @ModelAttribute의 폼에서 입력한 데이터가 저장된
	
	 @RequestMapping("member/addinsert.do") 
	 public String addinsert(@ModelAttribute AddressDTO dto) { 
		 addressService.addinsertMember(dto); 
		 return "redirect:/member/addressbook.do"; 
	 }
	 
	
	
	// view.do?userid=kim 이라면
	// @RequestParam String userid 변수에 kim이 저장됨
	
	 @RequestMapping("member/addview.do") 
	 public String addview(@RequestParam String userid, Model model) { 
		 model.addAttribute("dto", addressService.addviewMember(userid)); 
		 return "member/addview"; 
	 }
	 
	 @RequestMapping("member/addupdate.do")
		public String addupdate(@ModelAttribute AddressDTO dto, Model model) {
			logger.info(dto.getUserid() + " / " + dto.getPasswd());
			boolean result = addressService.checkPw(dto.getUserid(), dto.getPasswd());
			logger.info("비밀번호 확인: " + result);
			if(result) {		//비밀번호가 맞으면
				addressService.addupdateMember(dto);	//레코드 수정
				return "redirect:/member/addressbook";
			}else {				//비밀번호가 틀리면
				AddressDTO dto2 = addressService.addviewMember(dto.getUserid());
				model.addAttribute("dto", dto);
				model.addAttribute("message", "비밀번호가 일치하지 않습니다");
				return "member/addview";			//수정 페이지로 되돌아감
			}
			
		}	
			
		@RequestMapping("member/adddelete.do")
		public String delete(@RequestParam String userid, @RequestParam String passwd, Model model) {
			//logger.info(dto.getUserid() + " / " + dto.getPasswd());
			boolean result = addressService.checkPw(userid, passwd);
			logger.info("비밀번호 확인: " + result);
			if(result) {		//비밀번호가 맞으면
				addressService.adddeleteMember(userid);	//레코드 수정
				return "redirect:/member/addressbook.do";
			}else {				//비밀번호가 틀리면
				model.addAttribute("message", "비밀번호가 일치하지 않습니다");
				model.addAttribute("dto", addressService.addviewMember(userid));
				return "member/addview";			//수정 페이지로 되돌아감
			}
		}

}
