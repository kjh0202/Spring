package com.example.spring01.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.example.spring01.model.dao.AddressDAO;
import com.example.spring01.model.dto.AddressDTO;
import com.example.spring01.model.dto.MemberDTO;

@Service
public class AddressServiceImpl implements AddressService {

	@Inject
	AddressDAO addressDao;

	@Override
	public List<AddressDTO> addmemberList() {
		return addressDao.addmemberList();
	}
	
	@Override
	public void addinsertMember(AddressDTO vo) {
		addressDao.addinsertMember(vo);
	}

	@Override
	public AddressDTO addviewMember(String userid) {
		return addressDao.addviewMember(userid);
	}
	
	@Override
	public void adddeleteMember(String userid) {
		addressDao.adddeleteMember(userid);

	}

	@Override
	public void addupdateMember(AddressDTO vo) {
		addressDao.addupdateMember(vo);
	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		return addressDao.checkPw(userid, passwd);
	}
	
}
