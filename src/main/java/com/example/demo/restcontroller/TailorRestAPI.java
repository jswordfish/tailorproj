package com.example.demo.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Tailor;
import com.example.demo.service.TailorService;

@RestController
@RequestMapping(value="tailor")
@CrossOrigin(methods = { RequestMethod.OPTIONS, RequestMethod.GET, RequestMethod.POST })
public class TailorRestAPI {

	@Autowired
	private TailorService tailorService;
	
	@RequestMapping(value="/welcome")
	public String welcome() {
		return "Hello Spring Boot!!!!";
	}
	
	@RequestMapping(value="/all", method= RequestMethod.GET)
	public List getAllTailors() {
		
		return tailorService.getAllTailors();
		
	}
	
	//@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public List addTailor(@RequestBody Tailor t1) {
				
		System.out.println(t1.getMaleDress());
		System.out.println(t1.getFemaleDress());
		System.out.println(t1.getTags());
		
		/*List<String> md = new ArrayList<String>();
		md.add("achkan");
		md.add("shirt");
		md.add("trouser");
		
		List<String> fd = new ArrayList<String>();
		fd.add("chooridar");
		fd.add("frock");
		fd.add("salwar kameez");
		fd.add("bridal gown");
		
		List<String> tags = new ArrayList<String>();
		tags.add("achkan");
		tags.add("shirt");
		tags.add("trouser");
		tags.add("chooridar");
		tags.add("frock");
		tags.add("salwar kameez");
		tags.add("bridal gown");
		
		List<String> pics = new ArrayList<String>();
		pics.add("1.jpg");*/
		
		
		//Tailor t = new Tailor(1,"Shakti Master","Chennai Dress Makers","202","Experts in Bridal Gowns",new Date(21-11-2018),"Pillaiyar Koil Street","Thoraipakkam","Chennai", "India","8888888881","chennaidressmaker@gmail.com","Best Tailors",new Date(21-11-2018),5,md ,fd,tags,pics);
		//Tailor t = new Tailor(t1);
		return tailorService.addTailor(t1);
	}
	
	@RequestMapping(value="/get/{id}", method=RequestMethod.GET)
	public Tailor getTailorById(@PathVariable("id") int id) {
		System.out.println(id);
		return tailorService.getTailorById(id);
	}
	
}
