package com.example.spring01.service;

import java.util.List;

import com.example.spring01.model.dto.AddressDTO;

public interface AddressService {
	public List<AddressDTO> addmemberList();
	public void addinsertMember(AddressDTO vo);
	public AddressDTO addviewMember(String userid);
	public void adddeleteMember(String userid);
	public void addupdateMember(AddressDTO vo);
	public boolean checkPw(String userid, String passwd);
	
}
