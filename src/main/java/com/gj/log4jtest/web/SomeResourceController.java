package com.gj.log4jtest.web;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SomeResourceController {
	
	private static final Logger logger = LogManager.getLogger(SomeResourceController.class);

	  
	@RequestMapping(value="/health", method=RequestMethod.GET)
	public ResponseEntity<String> health(HttpServletRequest requestt){
		String header=requestt.getHeader("cust");
		logger.info("Ping: {}",header);
		return new ResponseEntity<String>("OK", HttpStatus.OK);
	}
	

	
    @RequestMapping(value = "/resources/{id}", method = RequestMethod.GET)
	public ResponseEntity<String> getResouceById(@PathVariable("id") long id,@RequestParam String query){
    	logger.info("Resource to return  with id {} " , id);
		logger.info("Resource to return  with query {} " , query);
	/*	logger.debug("UserProject to return  with query {} " , query);
		logger.info("UserProject to return  with query {} " + query);
		logger.debug("UserProject to return  with query {} " + query);
*/
		return new ResponseEntity<String>("done", HttpStatus.OK);
	}


	
}
