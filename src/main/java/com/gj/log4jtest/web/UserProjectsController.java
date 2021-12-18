package com.gj.log4jtest.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class UserProjectsController {
	
	private static final Logger logger = LogManager.getLogger(UserProjectsController.class);

	  
	@RequestMapping(value="/ping", method=RequestMethod.GET)
	public ResponseEntity<String> ping(HttpServletRequest requestt){
		String header=requestt.getHeader("cust");
		logger.info("Ping: {}",header);
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	

	
    @RequestMapping(value = "/userprojects/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getUserProjectById(@PathVariable("id") long id,@RequestParam String query){
    	logger.info("UserProject to return  with id {} " , id);
		logger.info("UserProject to return  with query {} " , query);
		logger.debug("UserProject to return  with query {} " , query);
		logger.info("UserProject to return  with query {} " + query);
		logger.debug("UserProject to return  with query {} " + query);


		return new ResponseEntity<String>("done", HttpStatus.OK);
	}


	
}
