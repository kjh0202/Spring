package com.example.spring01.model.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.spring01.model.dto.AddressDTO;


 @Repository 
 public class AddressDAOImpl implements AddressDAO {
	 @Inject
	 SqlSession sqlSession;
 
	 @Override
	 public List<AddressDTO> addmemberList() {
		return sqlSession.selectList("addmember.addmemberList");	//addmemberMapper.xml에서의 이름과 같아야 함.
	}
	 
	@Override
	public void addinsertMember(AddressDTO vo) {
		sqlSession.insert("addmember.addinsertMember", vo);	 
	}

	@Override
	public AddressDTO addviewMember(String userid) {
		return sqlSession.selectOne("addmember.addviewMember", userid);
	}
	 
	@Override
	public void adddeleteMember(String userid) {
		sqlSession.delete("addmember.adddeleteMember", userid);

	}

	@Override
	public void addupdateMember(AddressDTO vo) {
		sqlSession.update("addmember.addupdateMember", vo);
	}

	@Override
	public boolean checkPw(String userid, String passwd) {
		boolean result = false;
		Map<String, String> map = new HashMap<String, String>();
		map.put("userid", userid);
		map.put("passwd", passwd);
		int count = sqlSession.selectOne("member.checkPw", map);
		if(count == 1) 
			result = true;
		return result;
	}

 }
