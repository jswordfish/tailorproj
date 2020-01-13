package com.example.demo;

import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.TailorService;
import com.example.demo.service.UserService;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestPatternFinder_Functional {
    static Properties properties = null;
    @Autowired
    UserService userService;
    
    @Autowired
    TailorService tailorService;
    
    static{
        try {
            properties = TestUtil.getForProblem1();
        }
        catch(Exception e){
            //should never happen
            e.printStackTrace();
            System.out.println("here");
        }

    }
    



    
    @Test
    public void testTestcase1(){
        Integer res = userService.getNonRegisteredUsersCount();
        
        Integer answer = Integer.parseInt((String)properties.get("testcase1"));
        Assert.assertEquals(res, answer);
        
    }
    
    @Test
    public void testTestcase2() {
        Integer res = userService.getSuspendUsersCountUsers();
        
        Integer answer = Integer.parseInt((String)properties.get("testcase2"));
        Assert.assertEquals(res, answer);
        
    }
    
    @Test
    public void testTestcase3() {
        Integer res = userService.getUserRegistrationsInPipelineCountUsers();
        
        Integer answer = Integer.parseInt((String)properties.get("testcase3"));
        Assert.assertEquals(res, answer);
        
    }
    
    @Test
    public void testTestcase4() {
        Integer res = tailorService.getNotSuitableTailorsCount();
        
        Integer answer = Integer.parseInt((String)properties.get("testcase4"));
        Assert.assertEquals(res, answer);
        
    }
}
