package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TailorDao;
import com.example.demo.entity.RegisteredUser;
import com.example.demo.entity.Tailor;

@Service("tailorService")
public class TailorService {

	@Autowired
	TailorDao tailorDao;
	
	public List getAllTailors() {
		// TODO Auto-generated method stub
		return tailorDao.getAllTailors();
	}

	public List addTailor(Tailor t) {
		// TODO Auto-generated method stub
		return tailorDao.addTailor(t);
	
	}

	public Tailor getTailorById(int id) {
		// TODO Auto-generated method stub
		return tailorDao.getTailorById(id);
	}

	

}
