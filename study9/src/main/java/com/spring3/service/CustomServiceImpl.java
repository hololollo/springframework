package com.spring3.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring3.dao.CustomDAO;
import com.spring3.dto.Custom;

@Service
public class CustomServiceImpl implements CustomService{
	
	@Autowired
	private CustomDAO CustomDAO;

	@Override
	public List<Custom> getCustomList() {
		return CustomDAO.getCustomList();
	}

	@Override
	public Custom getCustom(String id) {
		// TODO Auto-generated method stub
		return CustomDAO.getCustom(id);
	}

	@Override
	public int maxNum() {
		// TODO Auto-generated method stub
		return CustomDAO.maxNum();
	}

	@Override
	public void insCustom(Custom custom) {
		CustomDAO.insCustom(custom);
	}

	@Override
	public void changePw(String pw) {
		CustomDAO.changePw(pw);
	}

	@Override
	public void changeInfo(Custom custom) {
		CustomDAO.changeInfo(custom);
	}

	@Override
	public void delCustom(String id) {
		CustomDAO.delCustom(id);
	}
	
}
