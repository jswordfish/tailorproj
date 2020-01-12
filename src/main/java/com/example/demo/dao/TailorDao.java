package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.RegisteredUser;
import com.example.demo.entity.Tailor;
import com.example.demo.repository.TailorRepository;

@Repository("tailorDao")
public class TailorDao {

	@Autowired
	TailorRepository tailorRepository;
	
	public List getAllTailors() {
		// TODO Auto-generated method stub
		List<Tailor> tailorList =  tailorRepository.findAll();
		return tailorList;
	}

	public List addTailor(Tailor t) {
		// TODO Auto-generated method stub
		tailorRepository.saveAndFlush(t);
		return tailorRepository.findAll();
	}

	public Tailor getTailorById(int id) {
		// TODO Auto-generated method stub
		return tailorRepository.findById(id).get();
	}

	

}
