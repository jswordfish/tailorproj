package com.example.demo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.entity.RegisteredUser;
import com.example.demo.entity.Tailor;
import com.example.demo.service.TailorService;
import com.example.demo.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPatternFinder_Boundary {
	
	   @Autowired 
	TailorService tailorService;
	   
	   @Autowired
	   UserService userService;


	    
	    @Test
	    public void testTestcase1() throws Exception{
	        String input = "";
	       Tailor dummy = new Tailor();
	       	for(long i=0; i< 100000l; i++){
	       		tailorService.addTailor(dummy);
	       	}
	        
	        
	        Assert.assertEquals(tailorService.getAllTailors().size(), 100000l);
	        
	      
	        
	    }
	    
	   
	    
	    
}

